package com.mnlsolution.kt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DaemonTestApplication {
	
	private final static Logger logger = LoggerFactory.getLogger(DaemonTestApplication.class);
	
	private final static String[] CONFIG_LOCATIONS = { "classpath:root-context.xml" , "classpath:cron-context.xml" };

    public static void main(String[] args) {
        SpringApplication.run(DaemonTestApplication.class, args);
        
        logger.info(">>>>>>>>>>>>>> Daemon is start");
        
		AbstractApplicationContext context = new ClassPathXmlApplicationContext( CONFIG_LOCATIONS );
        context.registerShutdownHook( );
    }
    
    
    
}
