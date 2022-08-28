package network.server.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerService2 {
	
	public void service() {
		
		// 1)
		int port = 9876;
		
		// 2)
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		InputStream is = null;
		OutputStream os = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		// 3)
		try {
			
			// 4)
			System.out.println("[서버]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");
			
			serverSocket = new ServerSocket(port);
			clientSocket = serverSocket.accept();
			System.out.println("[System] : 클라이언트 연결 완료 ");
			
			// 5)
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			// 6)
			br = new BufferedReader(new InputStreamReader(is));
//			bw = new BufferedWriter(new OutputStreamWriter(os));
			pw = new PrintWriter(os);
			
			// 7) 입력
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd HH:mm:ss");
			String nowStr = sdf.format(now);
			
//			bw.write(nowStr);
//			bw.flush();
			pw.println(nowStr);
			pw.flush();
			
			// 7) 출력
			String clientMessage = br.readLine();
			System.out.println("클라이언트" + clientMessage);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 8) 종료
				try {
					System.out.println("연결이 해제되었습니다.");
					if(br != null) br.close();
//					if(bw != null) bw.close();
					if(pw != null) pw.close();
					if(serverSocket != null) serverSocket.close();
					if(clientSocket != null) clientSocket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		
	}

	public void serverS() {
		
		// 멤버변수 선언
		
		// 포트번호를 저장할 port변수 선언
		int port = 8280;
		
		// 소켓 변수 선언
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		// 기반 스트림 선언
		InputStream is = null;
		OutputStream os = null;
		// 보조 스트림 선언
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			// 소켓 연결
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");
			serverSocket = new ServerSocket(port);
			clientSocket = serverSocket.accept();
			System.out.println("[System] : 연결 성공");
			// 스트림 연결
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			// 보조 스트림 설정
			br = new BufferedReader( new InputStreamReader(is));
			pw = new PrintWriter(os);
			// 스트림을 이용해 출력
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd HH:mm:ss");
			String serverMessage = sdf.format(now);
			pw.println("현재 시각 : " + serverMessage);
			pw.flush();
			// 스트림을 이용해 입력받음
			String clientMessage = br.readLine();
			String clientIP = clientSocket.getInetAddress().getHostAddress();
			System.out.println("클라이언트("+clientIP+") : "+clientMessage);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 종료
				try {
					if(br!=null) br.close();
					if(pw!=null) pw.close();
					if(serverSocket!=null) serverSocket.close();
					if(clientSocket!=null) clientSocket.close();
					System.out.println("[System] : 연결 해제");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
		
	}
}
