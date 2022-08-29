package network.server.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerService3 {

	
	public void server() {
		
		// 1. 포트번호를 저장할 변수 선언하고 초기화
		int port = 9876;
		
		// 2. 소켓 참조변수를 선언하고 기본값으로 초기화
		Socket clientSocket = null;
		ServerSocket serverSocket = null;
		
		// 3. 기반 스트림 생성
		InputStream is = null;
		OutputStream os = null;
		
		// 4. 보조 스트림 생성
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 5. try ~ catch 구문 작성
		try {
			
			// 6. 클라이언트와 소켓을 연결
			System.out.println("[서버]");
			System.out.println("클라이언트와 연결을 시도하고 있습니다.");
			
			serverSocket = new ServerSocket(port);
			clientSocket = serverSocket.accept();
			String clientIP = clientSocket.getInetAddress().getHostAddress();
			
			System.out.println("연결 성공(" + clientIP + ")");
			
			// 7. 클라이언트 소켓으로과 스트림을 연결함
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			// 8. 보조 스트림으로 기반 스트림 성능 상승
			br = new BufferedReader( new InputStreamReader(is)); // is는 바이트 기반이므로 InputStreamReader를 이용해 연결
			pw = new PrintWriter(os);
			
			// 9. 스트림을 이용해서 현재 시각을 출력
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:MM");
			String nowStr = sdf.format(now);
			
			pw.println("[Server] : " + nowStr);
			pw.flush();
			
			// 10. 클라이언트의 메세지를 입력받아 출력
			String clientMessage = br.readLine();
			System.out.println("클라이언트"+clientMessage);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 11. 종료
			try {
				if(br!=null) br.close();
				if(pw!=null) pw.close();
				if(serverSocket!=null) serverSocket.close();
				if(clientSocket!=null) clientSocket.close();
				
			} catch (Exception e2) {

			} finally {
				
			}
		}
		
		
	}
}
