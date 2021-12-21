package com.jin.edu.service;

import java.util.HashMap;
import java.util.Map;

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

		form.getShainListMap().put(001, "鈴木イチロー");
		form.getShainListMap().put(002, "田中将大");
		form.getShainListMap().put(003, "高橋雄介");
		form.getShainListMap().put(004, "鈴木亮一");
		form.getShainListMap().put(005, "橋本省吾");
		
		if (form.getShainListMap().containsKey(form.getShainNo())) {
			form.setShainNameKanji(form.getShainListMap().get(form.getShainNo()));
			form.getShainNameKanji();
		} else {
			form.setShainNameKanji("該当する社員はいません");
			form.getShainNameKanji();
		}
		// member 各情報を設定する。
		// form.setShainNameKanji("鈴木イチロー");
		// form.getShainNameKanji(form.getShainNo());
	}
}
