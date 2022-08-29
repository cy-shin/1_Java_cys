package network.client.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientService3 {

	
	public void client() {
		
		// 1. 포트 번호 및 아이피 주소를 저장할 변수 선언하고 초기화
		int port = 9876;
		String address = "127.0.0.1";
		
		// 2. 클라이언트 소켓 참조변수를 선언하고 기본값으로 초기화
		Socket clientSocket = null;
		
		// 3. 기반 스트림 생성
		InputStream is = null;
		OutputStream os = null;
		
		// 4. 보조 스트림 생성
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 5. try ~ catch 구문 작성
		try {
			
			// 6. 서버와 연결할 클라이언트의 소켓을 열어둠
			clientSocket = new Socket(address, port);
			if(clientSocket!=null) {
				System.out.println("[클라이언트]");
				System.out.println("서버와 연결을 시도하고 있습니다.");
				String clientIp = clientSocket.getInetAddress().getHostAddress();
				System.out.println("연결 성공");
				
				// 7. 서버에 연결할 스트림을 설정
				is = clientSocket.getInputStream();
				os = clientSocket.getOutputStream();
				
				// 8. 보조 스트림으로 기반 스트림 성능 개선
				br = new BufferedReader( new InputStreamReader(is));
				pw = new PrintWriter(os);
				
				// 9. 스트림을 이용해 서버의 출력을 받아옴
				String serverMessage = br.readLine();
				System.out.println(serverMessage);
				
				// 10. 스트림을 이용해 서버에 메세지 출력
				Scanner sc = new Scanner(System.in);
				System.out.print("메세지 입력 > ");
				String clientMessage = "("+clientIp+") : " + sc.nextLine();
				pw.println(clientMessage);
				pw.flush(); // flush() 메서드를 사용해 밀어내야 함. 밀어내지 않고 닫으면 null값이 전달됨
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 11. 종료
			try {
				if(br!=null) br.close();
				if(pw!=null) pw.close();
				if(clientSocket!=null) clientSocket.close();
				
			} catch (Exception e2) {

			} finally {
				
			}
		}
	}
}
