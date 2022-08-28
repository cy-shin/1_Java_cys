package network.server.run;

import network.server.model.service.ServerService;
import network.server.model.service.ServerService2;

public class ServerRun {
	public static void main(String[] args) {
		ServerService server = new ServerService();
		
//		server.service();
//		server.service2();
		
		ServerService2 server2 = new ServerService2();
		
//		server2.service();
		server2.serverS();
	}
}
