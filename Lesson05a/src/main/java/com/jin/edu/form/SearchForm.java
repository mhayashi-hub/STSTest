package com.jin.edu.form;

import com.jin.edu.dto.BushoInfoDto;

public class SearchForm {
	// form経由でaccessするためのオブジェクト、変数を準備
	// ここでformに表示する機能を保持する。DBアクセス結果もこれを経由してHTMLなどに受け渡す。
	private String bushoCd;
	private BushoInfoDto bushoInfo;
	// setter
	public void setBushoCd(String bushoCd) {
		this.bushoCd = bushoCd;
	}
	public void setBushoInfo(BushoInfoDto bushoInfo) {
		this.bushoInfo = bushoInfo;
	}
	// getter
	public String getBushoCd() {
		return bushoCd;
	}
	public BushoInfoDto getBushoInfo() {
		return bushoInfo;
	}
}
