package com.jin.edu.service;

import org.springframework.stereotype.Service;
import com.jin.edu.form.TestForm;

@Service
public class TestService {

	/**
	 * memberの情報設定
	 * 
	 * @param form 画面情報から取得
	 */
	public void setShainInfo(TestForm form) {
		// member 各情報を設定する。
		// form.setShainNameKanji("鈴木イチロー");
		form.setShainNo(001);
		form.setShainNameKanji("鈴木イチロー");
		form.setShainNo(002);
		form.setShainNameKanji("田中将大");
		form.getShainNameKanji();
	}
}
