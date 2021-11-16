package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class EchoWS {
	
	@WebMethod
	public String echo(String s) {
		return "Echo: " + s;
	}
	
	public static void main(String[] agrs) {
		System.out.println("EchoWS up and running...");
		String url = "http://localhost:8888/EchoWS";
		Endpoint.publish(url, new EchoWS());
	}
}
