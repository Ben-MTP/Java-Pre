package ws;

public class EchoClient {

	public static void main(String[] args) {
		try {
			EchoWSService service = new EchoWSService();
			EchoWS port = service.getEchoWSPort();
			String res = null;
			if(args.length == 0) {
				res = port.echo("Testing WebService");
			} else {
				res = port.echo(args[0]);
			}
			System.out.println(res);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
