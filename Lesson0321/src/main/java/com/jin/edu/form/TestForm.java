package com.jin.edu.form;

import java.util.HashMap;
import java.util.Map;

public class TestForm {

//	member info Number
//	private String shainNo;
	private Integer shainNo;
//	member name Kanji
	private String shainNameKanji;
	// setter method
	public void setShainNo(Integer shainNo) {
		this.shainNo = shainNo;
	}
	public void setShainNameKanji(String shainNameKanji) {
		this.shainNameKanji = shainNameKanji;
	}
	// getter method
	public Integer getShainNo() {
		return shainNo;
	}
	public String getShainNameKanji() {
		return shainNameKanji;
	}
	// shainNoとshainNameKanjiを格納したhashMap
	Map<Integer, String> shainListMap = new HashMap<> ();
	// setter method
	public void setShainListMap(Map<Integer, String> shainListMap) {
		this.shainListMap = shainListMap;
	}
	// getter method
	public Map<Integer, String> getShainListMap() {
		return shainListMap;
	}
}
