package edu.kh.io.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IoService {

	// 스트림 : 데이터가 이동하는 통로
	
	// 바이트 기반 스트림 : 1byte 단위로 데이터를 입/출력하는 스트림
	// -> 주로 문자가 아닌 파일(이미지, 영상, exe 등)의 입/출력 시 사용
	
	// 문자 기반 스트림 : 문자 단위(자바 기준 2byte)로 데이터를 입/출력하는 스트림
	// -> 문자 데이터(채팅, 코드, 데이터)를 주고받을 때 사용
	
	public void output() { // 출력
		
		String content = "Hello World\n"
					   + "1234567890\n"
					   + "오늘은 금요일 입니다.\n"
					   + "점심 어떤게 좋을까요?\n";
		
		// * 스트림 객체 생성 시 예외 처리가 필요함(Checked Exception?)
		
		
		// 1) 바이트 기반 파일 출력 스트림
		FileOutputStream fos = null;
		// Unhandled exception type FileNotFoundException 파일이 존재하지 않는 예외가 발생 가능

		// try 안에서 만들이 않은 이유 : try의 지역 변수가 되어 finally에서 사용할 수 없게 되어서
		// 현재는 메서드 지역 변수로 메서드 내 어디서든 사용 가능

		
		
		// 2) 문자 기반 파일 출력 스트림
		FileWriter fw = null;
		
		
		try {
			fos = new FileOutputStream("byte/byteTest.txt", true);
			// new FileOutputStream("출력할 파일의 경로", 이어쓰기여부)
			// new FileOutputStream("출력할 파일의 경로, true") : true를 명시하면 이어쓰기 -> log 생성 시 활용 가능
			// *** 작성한 파일의 경로가 없으면 자동생성됨

			// 새롭게 실행될 때 마다 파일/내용이 덮어쓰기됨(뒤에 내용을 추가하는게 아님)
			// 이어쓰기여부를 true로 하면 이전 내용 이어쓰기한다
			
			// 1byte씩 파일로 출력 (content에 적은 내용 하나씩)
			for(int i =0; i < content.length(); i++) {
				fos.write( content.charAt(i));
				// void java.io.FileOutputStream.write(int b) throws IOException
				// IOException에 대한 예외처리 필요함
			}
			
			System.out.println("*** 바이트 스트림 출력 완료");
			// ----------------------------------
			
			fw = new FileWriter("char/charTest.txt", true);
			// new FileWriter("출력한 파일의 경로")
			// -> 작성한 파일의 경로가 없으면 자동생성됨
			
			fw.write(content);			
			
			System.out.println("*** 문자 스트림 출력 완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // 예외가 발생한 메서드까지의 모든 메서드를 출력
			
		} catch (IOException e) { // IOException은 File...Exception의 상위 클래스임
								  // 그래서 위 File...캐치 구문을 없애도 다형성이 적용되어 정상처리됨

			e.printStackTrace();
			
		} finally {
			try {
				// 스트림.close() : 통로를 닫음
				// = 스트림 내부에 존재하는 데이터를 모두 밀어낸 후
				//   스트림 객체 자원(메모리)를 반환
				// 스트림에 남아있는 데이터가 메모리에서 전부 지워짐
				// -> close구문 필수 작성
				// 만약 close구문을 작성하지 않으면, 값이 정상적으로 출력되지 않을 수 있음
				fos.close();
				fw.close(); // 항상 close구문을 적어둘 것
				
			} catch (IOException e) {

				e.printStackTrace();
			} 
		}
		
	}
	
	
	public void input() { // 입력
		
		FileInputStream fis = null;
		
		FileReader fr = null;
		// 메서드 변수로 만들어서, input 메서드 내에서는 어디서든 사용 가능함

		try {
			fis = new FileInputStream("char/charTest.txt");
			// throws FileNotFoundException -> try/catch 구문 작성할 것
			
			int value = 0; // 파일에서 읽어온 값을 저장할 변수
			
			// fis.read() : 다음 1byte 단위를 읽어와 int로 반환
			//				단, 읽어올 내용이 없는 경우, -1 반환
			// >> 다음 한 byte를 읽어와 int로 변환한 값이 만약 -1이면 while문 중단함
			// while( (value = fis.read()) != -1) System.out.print((char)value);
				
			while(true) {
				value = fis.read();
				if(value == -1) break;
				
				System.out.print((char)value);
				// value = fis.read()는 int형 값을 출력하므로 char로 강제형변환
			}
			
			System.out.println("\n----------------------------------------");
			
			fr = new FileReader("char/charTest.txt");
			
			while(true) {
				value = fr.read();
				if(value == -1) break;
				
				System.out.print((char)value);
				// value = fr.read()는 int형 값을 출력하므로 char로 강제형변환
			}
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if(fis != null) fis.close(); // 참조하는 스트림이 있을 때만 fis를 닫음
				if(fr != null) fr.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
	

	public void fileCopy() { // 어떤 형식의 파일이든 복사하기
		// 복사 : 파일을 전부 input해온 후, 다시 output
		// byte 기반 스트림을 쓰되, 보조 스트림을 달아서 바이트 기반 스트림의 문제인 문자 깨짐 현상이 발생하지 않게 보완함
		
		Scanner sc = new Scanner(System.in);
		
		// 보조 스트림(혼자 생성돼서 입/출력을 할 수는 없음)
		BufferedInputStream bis = null;
		
		BufferedOutputStream bos = null;
		
		try {
			System.out.print("복사할 파일의 경로 입력 : ");
			String input = sc.nextLine();
			bis = new BufferedInputStream(new FileInputStream(input));
			// new BufferedInputStream(기반 스트림) 보조 스트림이라서 기반 스트림이 반드시 필요함...
			
			System.out.print("복사 위치 및 파일명 : ");
			String output = sc.nextLine();
			bos = new BufferedOutputStream(new FileOutputStream(output));
			
			// Buffered 보조 스트림
			// -> 버퍼를 이용해서 1byte/1문자 씩이 아닌
			//	  한번에 많은 내용을 입/출력할 수 있게 하는 보조 스트림(속도 up)
			
			int value = 0;
			
			while(true) {
				value = bis.read();
				// 바이트 스트림이기 때문에 1byte씩 읽어오지만
				// 한글 같이 2byte 문자가 버퍼에 쌓이면서 깨졌던 모양이 복구됨
				if(value == -1) break;
				bos.write(value);
				// 1byte씩 출력되는 것 같으나, 보조스트림 Buffer의 영향으로 내부 버퍼에 출력되는 내용이 모여서 한번에 출력됨..
			}

			System.out.println("복사 완료");
			
		} catch (FileNotFoundException e) { 
			System.out.println("파일을 찾을 수 없습니다. ");
		} catch (IOException e) {
			System.out.println("입/출력 과정에서 오류가 발생했습니다. ");
		} finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
