package network.server.run;

import network.server.model.service.ServerService;

public class ServerRun {
	public static void main(String[] args) {
		ServerService server = new ServerService();
		
		server.service();
	}
}
