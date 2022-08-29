package network.server.run;

import network.server.model.service.ServerService;
import network.server.model.service.ServerService2;
import network.server.model.service.ServerService3;

public class ServerRun {
	public static void main(String[] args) {
		ServerService server = new ServerService();
		
//		server.service();
//		server.service2();
		
		ServerService2 server2 = new ServerService2();
		
//		server2.service();
//		server2.serverS();
		
		ServerService3 server3 = new ServerService3();
		server3.server();
	}
}
