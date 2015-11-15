/**
 * COPYRIGHT(c) KT  2015
 * This software is the proprietary information of KT Corp.
 */
package com.mnlsolution.kt.cron.task.dto;

public class CampTargetDto {
	private int msgNo;
	private String activeId;
	private String svcMgmtNum;
	private String memStCd;

	public int getMsgNo() {
		return msgNo;
	}

	public void setMsgNo(int msgNo) {
		this.msgNo = msgNo;
	}

	public String getActiveId() {
		return activeId;
	}

	public void setActiveId(String activeId) {
		this.activeId = activeId;
	}

	public String getSvcMgmtNum() {
		return svcMgmtNum;
	}

	public void setSvcMgmtNum(String svcMgmtNum) {
		this.svcMgmtNum = svcMgmtNum;
	}

	public String getMemStCd() {
		return memStCd;
	}

	public void setMemStCd(String memStCd) {
		this.memStCd = memStCd;
	}
}
