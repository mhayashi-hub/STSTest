package com.jin.edu.form;

import com.jin.edu.dto.MergeInfoDto;

public class SearchForm {
	// DBから取得したデータを保管するオブジェクトの準備と初期化
	private String shainNo;
	private MergeInfoDto mergeInfo;
	// setter
	/**
	 * 社員番号の設定　in form
	 * @param shainNo
	 */
	public void setShainNo(String shainNo) {
		this.shainNo = shainNo;
	}
	/**
	 * DBから取り出した結合データmergeInfoの設定　in form
	 * @param mergeInfo
	 */
	public void setMergeInfo(MergeInfoDto mergeInfo) {
		this.mergeInfo = mergeInfo;
	}
	// getter
	/**
	 * 社員番号取得メソッド　in form
	 * @return shainNo
	 */
	public String getShainNo() {
		return shainNo;
	}
	/**
	 * DBから取得した結合データオブジェクトmergeInfo取得メソッド in form
	 * @return mergeInfo
	 */
	public MergeInfoDto getMergeInfo() {
		return mergeInfo;
	}
}
