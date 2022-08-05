package edu.kh.variable.ex1;

public class VariableExample5 {
	
	public static void main(String[] args) {
		
		/*	출력 메서드
		 * 	System.out.print("내용") 괄호 안에 입력한 값을 출력
		 *  System.out.println("내용") 괄호 안에 입력한 값을 출력 + 줄바꿈
		 *  
		 *  
		 *  
		 *  System.out.printf("내용 + 패턴" , 패턴에 들어갈 값 )
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		System.out.print("aaaaa");
		System.out.print("bbbbb");
		System.out.println("ccccc");
		System.out.println("ddddd");
		
		
		
		String name = "이름";
		int age = 27;
		char gender = '남';
		double height = 175.0;
		boolean tf = true;
		
		// name님은 age세 gender성, 키는 height입니다. (tf)
		System.out.println(name + "님은 "
							+ age + "세 "
							+ gender + "성" + ", 키는 " 
							+ height + "cm입니다. (" + tf + ")");
		
		System.out.printf("%s님은 %d세 %c성, 키는 %.1fcm입니다. (%b)\n", name, age, gender, height, tf);
		// \n : 개행문자 / 줄바꿈을 의미하는 탈출문자
		
		
		
		System.out.println("줄바뀜?");
		
		
		
		
		
		
		
		
	}
}
