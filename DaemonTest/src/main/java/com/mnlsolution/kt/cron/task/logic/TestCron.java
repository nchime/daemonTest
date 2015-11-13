package com.mnlsolution.kt.cron.task.logic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mnlsolution.kt.cron.common.Worker;
import com.mnlsolution.kt.cron.task.service.TestService;

public class TestCron implements Worker {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	private final TestService testService = new TestService();

	public TestCron() {
	}

	@Override
	public void worker() {
		testService.printDate();
	}

}
