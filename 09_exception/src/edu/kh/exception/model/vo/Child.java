package edu.kh.exception.model.vo;

import java.io.EOFException;
import java.io.IOException;

public class Child extends Parent {

	@Override
	public void method() throws EOFException {
		// IOException -> Exception으로 바꿀 수 없음
		
		// Exception Exception is not compatible
		// ...with throws clause in Parent.method()
		
		// 왜? Exception은 IOException의 부모 클래스이므로, 더 넓은 예외를 처리할 수 있음
		
		// IOException -> EOFException으로는 바꿀 수 있음
		// 왜? EOFException이 더 좁은(구체적인) 예외 처리이기 때문에
	}

}
