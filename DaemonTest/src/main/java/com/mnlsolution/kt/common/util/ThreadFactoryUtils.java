package com.mnlsolution.kt.common.util;

import java.text.MessageFormat;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ch.kwak
 */
public class ThreadFactoryUtils implements ThreadFactory {
	private final AtomicInteger number = new AtomicInteger(0);
	private String name;
	private boolean daemon;
	private int priority;

	public ThreadFactoryUtils(String name, boolean daemon, int priority) {
		this.name = name;
		this.daemon = daemon;
		this.priority = priority;
	}

	@Override
	public Thread newThread(Runnable r) {
		MessageFormat messageFormat = new MessageFormat("{0}-{1}");
		String num = String.format("%1$03d", number.getAndIncrement());
		Thread t = new Thread(r, messageFormat.format(new Object[] { name, num }));
		t.setDaemon(daemon);
		t.setPriority(priority);
		return t;
	}
}
