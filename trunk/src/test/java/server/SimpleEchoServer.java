/**
 * 
 */
package server;

import java.io.IOException;
import java.nio.charset.Charset;

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
public class SimpleEchoServer {

	
	public static final String SERVER_HOST = "localhost";
	public static final int SERVER_PORT = 7777;
	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		
		FilterChainBuilder fcBuilder = FilterChainBuilder.stateless()
		.add(new TransportFilter())
		.add(new StringFilter(Charset.forName("UTF-8")))
		.add(new EchoFilter());
		
		final TCPNIOTransport transport = TCPNIOTransportBuilder.newInstance().build();
		
		transport.setProcessor(fcBuilder.build());
		
		try{
			transport.bind(SERVER_HOST, SERVER_PORT);
			transport.start();
			
			System.out.println("press ENTER key to stop server....");
			System.in.read();
		}finally{
			transport.stop();
		}
		
	}

	
	public static class EchoFilter extends BaseFilter{


		public NextAction handleRead(FilterChainContext ctx) throws IOException {
			Object addr = ctx.getAddress();
			Object mesg = ctx.getMessage();
			
			System.out.println("receive from: "+addr);
			System.out.println("receive mesg: "+mesg);
			System.out.println();
			
			
			ctx.write(addr, mesg, null);
			return ctx.getStopAction();
		}
//
//		public NextAction handleWrite(FilterChainContext ctx)
//				throws IOException {
//			return super.handleWrite(ctx);
//		}
//
//		public NextAction handleConnect(FilterChainContext ctx)
//				throws IOException {
//			return super.handleConnect(ctx);
//		}
//
//		public NextAction handleAccept(FilterChainContext ctx)
//				throws IOException {
//			return super.handleAccept(ctx);
//		}
//
//		public NextAction handleEvent(FilterChainContext ctx,
//				FilterChainEvent event) throws IOException {
//			return super.handleEvent(ctx, event);
//		}
//
//		public NextAction handleClose(FilterChainContext ctx)
//				throws IOException {
//			return super.handleClose(ctx);
//		}
//		
//		
//		public void onAdded(FilterChain filterChain) {
//			super.onAdded(filterChain);
//		}
//
//		public void onFilterChainChanged(FilterChain filterChain) {
//			super.onFilterChainChanged(filterChain);
//		}
//
//		public void onRemoved(FilterChain filterChain) {
//			super.onRemoved(filterChain);
//		}
		
	}//end of class...
	
}
