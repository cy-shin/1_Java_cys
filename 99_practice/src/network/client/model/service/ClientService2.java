package network.client.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientService2 {
	
	public void service() {
		
		int port = 9876;
		String iNetAddress = "127.0.0.1";
		
		Socket clientSocket = null;
		
		InputStream is = null;
		OutputStream os = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			System.out.println("[클라이언트]");
			System.out.println("서버에 요청을 보내고 있습니다...");
			
			clientSocket = new Socket(iNetAddress, port);
			
			if(clientSocket != null) {
				System.out.println("[System] : 서버에 연결되었습니다.");
				
				is = clientSocket.getInputStream();
				os = clientSocket.getOutputStream();
				
				br = new BufferedReader( new InputStreamReader(is));
//				bw = new BufferedWriter( new OutputStreamWriter(os));
				pw = new PrintWriter(os);
				
				String serverMessage = br.readLine();
				System.out.println("[Server] : " + serverMessage);
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("메세지 입력 : ");
				String clientMessage = sc.nextLine();

				String myAddress = clientSocket.getInetAddress().getHostAddress();
				pw.println("(" + myAddress + ") : " + clientMessage);
				pw.flush();
//				bw.write("(" + myAddress + ")" + clientMessage);
//				bw.flush();
				
			} else {
				System.out.println("[System] : 서버 요청 실패");
			}
			
			
			
			
		} catch (Exception e) {

		} finally {
			try {
				System.out.println("연결이 해제되었습니다.");
				if(br != null) br.close();
//				if(bw != null) bw.close();
				if(pw != null) pw.close();
				
				if(clientSocket != null) clientSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	
		}
		
		
	}
}
