package com.jin.edu.dto;

import org.springframework.stereotype.Component;

@Component
public class BushoInfoDto {

	// form経由で画面に表示する情報を取得、設定する機能と、DBからの取得情報を一時格納する機能
	// インスタンス作成可能だがコンストラクタはDBから値をとるから不要？orDIコンテナ側にある？
	private String bushoCd;
	private String bushoName;
	// setter DBから取得した値 or formから取得した値を設定
	public void setBushoCd(String bushoCd) {
		this.bushoCd = bushoCd;
	}
	public void setBushoName(String bushoName) {
		this.bushoName = bushoName;
	}
	// getter objectに格納した値を取得する機能
	public String getBushoCd() {
		return bushoCd;
	}
	public String getBushoName() {
		return bushoName;
	}
}
