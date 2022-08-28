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

	public void clientS() {
		
		// 멤버변수 선언
		
		// 포트번호와 ip주소
		int port = 8280;
		String clientIP = "127.0.0.1";
		
		// 소켓
		Socket clientSocket = null;
		// 스트림
		InputStream is = null;
		OutputStream os = null;
		// 보조 스트림
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			// 소켓 연결
			System.out.println("[Client]");
			System.out.println("서버에 요청하고 있습니다...");
			clientSocket = new Socket(clientIP, port);
			if(clientSocket!=null) {
				// 스트림 연결
				is = clientSocket.getInputStream();
				os = clientSocket.getOutputStream();
				// 보조스트림 연결
				br = new BufferedReader( new InputStreamReader(is));
				pw = new PrintWriter(os);
				// 스트림을 이용해 입력받음
				String serverMessage = br.readLine();
				System.out.println(serverMessage);
				// 스트림을 이용해 출력
				Scanner sc = new Scanner(System.in);
				System.out.print("메세지 입력 : ");
				String clientMessage = sc.nextLine();
				pw.println(clientMessage);
				pw.flush();
			} else {
				System.out.println("[System] : 연결 실패");
			}
		} catch (IOException e) {
		
		} finally {
			// 종료
			try {
				if(br!=null) br.close();
				if(pw!=null) pw.close();
				if(clientSocket!=null) clientSocket.close();
				System.out.println("[System] : 연결 해제");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}	
