package com.jin.edu.form;

import com.jin.edu.dto.MergeInfoDto;

public class SearchForm {
	// DBから取得したデータをformに保持させる変数、オブジェクトの準備
	private String shainNo;
	private MergeInfoDto mergeInfo;
	// setter
	public void setShainNo(String shainNo) {
		this.shainNo = shainNo;
	}
	public void setMergeInfo(MergeInfoDto mergeInfo) {
		this.mergeInfo = mergeInfo;
	}
	// getter
	public String getShainNo() {
		return shainNo;
	}
	public MergeInfoDto getMergeInfo() {
		return mergeInfo;
	}
}
