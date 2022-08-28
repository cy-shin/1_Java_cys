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
}
