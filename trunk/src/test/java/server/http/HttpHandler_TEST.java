/**
 * 
 */
package server.http;

import java.io.IOException;

import org.glassfish.grizzly.http.server.HttpHandler;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.grizzly.http.server.Request;
import org.glassfish.grizzly.http.server.Response;
import org.glassfish.grizzly.http.server.ServerConfiguration;
import org.glassfish.grizzly.http.server.io.NIOReader;
import org.glassfish.grizzly.http.server.io.NIOWriter;
import org.glassfish.grizzly.http.server.io.ReadHandler;
import org.glassfish.grizzly.samples.httpserver.nonblockinghandler.NonBlockingHttpHandlerSample;

/**
 * @author ytsai1
 *
 */
public class HttpHandler_TEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		NonBlockingHttpHandlerSample.main(args);
		
		// create a basic server that listens on port 8080.
		final HttpServer server = HttpServer.createSimpleServer();
		final ServerConfiguration config = server.getServerConfiguration();
		
		config.addHttpHandler(new EchoHttpHandler(), "/echo");
		try{
			server.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			
		}
	}

	
	private static class EchoHttpHandler extends HttpHandler {
		
		public void service(Request request, final Response response) throws Exception {
			
			final char[] buffer = new char[128];
			final NIOReader reader = request.getReader(false);
			final NIOWriter writer = response.getWriter();
			response.suspend();
			
			reader.notifyAvailable(new ReadHandler() {
				public void onError(Throwable t) {
					t.printStackTrace();
				}
				public void onDataAvailable() throws Exception {
					System.out.println("onDataAvailable() readyData: "+reader.readyData());
					reader.notifyAvailable(this);
				}
				public void onAllDataRead() throws Exception {
					System.out.println("onAllDataRead() readyData: " + reader.readyData());
					
					try{
						echoAvailableData(reader, writer, buffer);
					}finally{
						try{
							reader.close();	
						}catch(IOException e){ e.printStackTrace();}
						try{
							writer.close();	
						}catch(IOException e){ e.printStackTrace();}
						response.resume();
					}
					
					
				}
			});
			
		}
		
		private void echoAvailableData(NIOReader in, NIOWriter out, char[] buf) throws IOException{
			 while(in.isReady()) {
				 int len = in.read(buf);
				 out.write(buf, 0, len);
			 }
		}
		
		
	}
}
