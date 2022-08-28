package network.client.run;

import network.client.model.service.ClientSerivce;

public class ClientRun {
	public static void main(String[] args) {
		ClientSerivce client = new ClientSerivce();
		
		client.service();
	}
}
