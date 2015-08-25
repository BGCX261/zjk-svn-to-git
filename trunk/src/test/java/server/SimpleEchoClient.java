/**
 * 
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.glassfish.grizzly.Connection;
import org.glassfish.grizzly.filterchain.BaseFilter;
import org.glassfish.grizzly.filterchain.FilterChainBuilder;
import org.glassfish.grizzly.filterchain.FilterChainContext;
import org.glassfish.grizzly.filterchain.NextAction;
import org.glassfish.grizzly.filterchain.TransportFilter;
import org.glassfish.grizzly.nio.transport.TCPNIOTransport;
import org.glassfish.grizzly.nio.transport.TCPNIOTransportBuilder;
import org.glassfish.grizzly.utils.StringFilter;

/**
 * @author ytsai1
 *
 */
public class SimpleEchoClient {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		
		Connection connection = null;
		
		FilterChainBuilder filterChainBuilder = FilterChainBuilder.stateless()
		.add(new TransportFilter())
		.add(new StringFilter(Charset.forName("UTF-8")))
		.add(new ClientFilter());
		
		final TCPNIOTransport transport = TCPNIOTransportBuilder.newInstance().build();
		transport.setProcessor(filterChainBuilder.build());
		
		
		try{
			transport.start();
			
			Future<Connection> future = transport.connect(SimpleEchoServer.SERVER_HOST, SimpleEchoServer.SERVER_PORT);
			connection = future.get(10, TimeUnit.SECONDS);
			System.out.println("Ready... (\"q\" to exit)");
			await(connection);
		}finally{
			transport.stop();
		}
	}
	
	
	
	private static void await(Connection connection) throws IOException{
		final BufferedReader inReader = new BufferedReader(
				new InputStreamReader(System.in));
		do {
			final String userInput = inReader.readLine();
			if (userInput == null || "q".equals(userInput)) {
				break;
			}
			connection.write(userInput);
		} while (true);
	}
	
	
	
	private static class ClientFilter extends BaseFilter{

		public NextAction handleRead(FilterChainContext ctx) throws IOException {
			Object mesg = ctx.getMessage();
			System.out.println("Server response: "+ mesg);
			
			return ctx.getStopAction();
		}
	}
}
