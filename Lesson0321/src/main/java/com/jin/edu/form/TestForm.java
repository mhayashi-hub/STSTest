package com.jin.edu.form;

import java.util.HashMap;
import java.util.Map;

public class TestForm {

//	member info Number
//	private String shainNo;
	private Integer shainNo;
//	member name Kanji
	private String shainNameKanji;
	
	public void setShainNo(Integer shainNo) {
		this.shainNo = shainNo;
	}
	public void setShainNameKanji(String shainNameKanji) {
		this.shainNameKanji = shainNameKanji;
	}
	
	public Integer getShainNo() {
		return shainNo;
	}
	public String getShainNameKanji() {
		return shainNameKanji;
	}
}
