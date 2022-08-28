package network.server.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// 네트워크 구조를 만들려면 Server가 먼저 준비되어야 함
public class ServerService {
	Scanner sc = new Scanner(System.in);
	
	public void service() {
		
		// 1. 서버의 포트번호 설정
		int port = 7700;
		
		// 2 . 참조변수 생성
		
		// 2-1. 서버와 클라이언트 클래스 타입의 참조변수 작성
		// 멤버변수로 생성해야 클래스 전체에서 사용
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		// 이 때, serverSocket은 IOException을 발생시킬 수 있음!
		
		// 2-2. 스트림 객체를 생성
		InputStream is = null;
		OutputStream os = null;
		
		// 2-3. 보조 스트림 객체를 생성
		BufferedReader br = null;
		PrintWriter pw = null; // 객체를 텍스트로 출력
		
		// 소켓, 스트림, 보조스트림 변수를 작성했으면 try/catch문으로 넘어감
		
		try {
			// 3. 서버와 클라이언트를 연결
			// 3-1. 서버 소켓 객체를 생성하고 매개변수로 port를 넣음
			serverSocket = new ServerSocket(port);
			
			// 3-2. 서버 소켓과 클라이언트 소켓을 연결
			System.out.println("[서버]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			
			clientSocket = serverSocket.accept();;
			// .accept() 연결 요청을 수락함
			
			System.out.println("클라이언트와 연결되었습니다.");
			
			// 4. 클라이언트의 입출력 스트림을 받아옴
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			// 5. 보조 스트림을 사용해 스트림 성능을 개선
			// 5-1. BufferedReader 객체를 생성하고 매개변수로 InputStreamReader 넣음
			//		InputStreramReader 객체의 매개변수에는 InputStream을 넣음
			
			br = new BufferedReader(new InputStreamReader(is));
			
			// 5-2. PrintWriter 객체를 생성하고 매개변수로 os를 넣음
			// 		PrintWriter는 이미 문자 기반이므로 문자 변환 스트림이 필요하지 않음.
			pw = new PrintWriter(os);
			
			// 6. 스트림을 통해 입출력
			Date now = new Date(); // 현재 시각을 저장함
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
			
			String str = sdf.format(now)+""; //sdf로 지정한 포멧에 현재 시각 now를 매개변수로 넣음
			
			pw.println(str); // client로 출력함
			pw.flush(); // 스트림에 남아있는 문자를 밀어냄
			
			String clientMessage = br.readLine();
			String clientIP = clientSocket.getInetAddress().getHostAddress();
			// .getInetAddress : Returns the address to which the socket is connected
			// .getHostAddress : Returns the IP address string in textual presentation
			System.out.println(clientMessage);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 7. 통신 종료

			try {
				
				// 7-1. 스트림 종료
				if(br != null) br.close();
				if(pw != null) pw.close();
				
				// 7-2. 소켓 닫음
				if(serverSocket != null) serverSocket.close();
				if(clientSocket != null) clientSocket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
		
	}
}
