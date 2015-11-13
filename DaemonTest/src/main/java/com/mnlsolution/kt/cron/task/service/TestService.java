package com.mnlsolution.kt.cron.task.service;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public TestService() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * 시간 로그 출력 테스트  
	 */
	public void printDate() {
		Date date = new Date(); 
		logger.info(">>>>>>>>>>>> {}", date.toString()  );
	}
	
	
	
	/**
	 *	파일 업로드 상태 체크  
	 */
	public void fileCheck() {
		
		
	}   
	
	

}
