package edu.kh.io.run;

import edu.kh.io.model.service.IoService;

public class Run {
	public static void main(String[] args) {
	
		IoService service = new IoService();
		
//		service.output();
//		service.input();
		service.fileCopy();
	}
}
