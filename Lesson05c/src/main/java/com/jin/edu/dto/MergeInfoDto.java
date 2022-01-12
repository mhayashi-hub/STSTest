package com.jin.edu.dto;

import org.springframework.stereotype.Component;

@Component
public class MergeInfoDto {

	// DBから取得する値、MergeInfoDtoクラスのメンバ
	private String shainNo;
	private String shainNameKj;
	private String shainAge;
	private String bushoName;
	// setter
	/**
	 * 社員番号を設定、DBから取得
	 * @param shainNo
	 */
	public void setShainNo(String shainNo) {
		this.shainNo = shainNo;
	}
	/**
	 * 社員名(漢字)を設定、DBから取得
	 * @param shainNameKj
	 */
	public void setShainNameKj(String shainNameKj) {
		this.shainNameKj = shainNameKj;
	}
	/**
	 * 社員の年齢(文字列として扱う)、DBから取得
	 * @param shainAge
	 */
	public void setShainAge(String shainAge) {
		this.shainAge = shainAge;
	}
	/**
	 * 部署名を設定、DBから取得
	 * @param bushoName
	 */
	public void setBushoName(String bushoName) {
		this.bushoName = bushoName;
	}
	// getter
	/**
	 * 社員番号取得メソッド
	 * @return shainNo
	 */
	public String getShainNo() {
		return shainNo;
	}
	/**
	 * 社員名(漢字)取得メソッド
	 * @return shainNameKj
	 */
	public String getShainNameKj() {
		return shainNameKj;
	}
	/**
	 * 社員の年齢取得メソッド
	 * @return shainAge
	 */
	public String getShainAge() {
		return shainAge;
	}
	/**
	 * 部署名取得メソッド
	 * @return bushoName
	 */
	public String getBushoName() {
		return bushoName;
	}
}
