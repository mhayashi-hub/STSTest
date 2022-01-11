package com.jin.edu.dto;

import org.springframework.stereotype.Component;

@Component
public class MergeInfoDto {
	
	private String shainNo;
	private String shainNameKj;
	private String bushoName;
	// setter
	public void setShainNo(String shainNo) {
		this.shainNo = shainNo;
	}
	public void setShainNameKj(String shainNameKj) {
		this.shainNameKj = shainNameKj;
	}
	public void setBushoName(String bushoName) {
		this.bushoName = bushoName;
	}
	// getter
	public String getShainNo() {
		return shainNo;
	}
	public String getShainNameKj() {
		return shainNameKj;
	}
	public String getBushoName() {
		return bushoName;
	}
}
