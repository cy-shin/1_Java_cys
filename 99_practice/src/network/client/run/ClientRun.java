package network.client.run;

import network.client.model.service.ClientSerivce;
import network.client.model.service.ClientService2;
import network.client.model.service.ClientService3;

public class ClientRun {
	public static void main(String[] args) {
		ClientSerivce client = new ClientSerivce();
		
//		client.service();
//		client.service2();
		
		ClientService2 client2 = new ClientService2();
		
//		client2.service();
//		client2.clientS();
		
		ClientService3 client3 = new ClientService3();
		client3.client();		
	}
}
