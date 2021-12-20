package com.jin.edu.form;

import java.util.HashMap;
import java.util.Map;

public class TestForm {

//	member info Number
//	private String shainNo;
	private Integer shainNo;
//	member name Kanji
	private String shainNameKanji;

	Map<Integer, String> shainListMap = new HashMap<>();

	/**
	 * member info numberの取得
	 * 
	 * @return member info Number shainNo
	 */
	public Integer getShainNo() {
		return shainNo;
	}

	/**
	 * member info numberの設定
	 * 
	 * @param shainNo
	 */
	public void setShainNo(Integer shainNo) {
		this.shainNo = shainNo;
	}

	/**
	 * member Name Kanjiの取得
	 * 
	 * @return member Name Kanji shainNameKanji
	 */
	/*
	public String getShainNameKanji() {
		return shainNameKanji;
	}
	*/
	public String getShainNameKanji() {
		return shainListMap.get(shainNo);
	}

	/**
	 * member Name Kanjiの設定
	 * 
	 * @param shainNameKanji
	 */
	public void setShainNameKanji(String shainNameKanji) {
		this.shainNameKanji = shainNameKanji;
	}
}
