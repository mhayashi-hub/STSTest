package com.jin.edu.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.jin.edu.form.TestForm;

@Service
public class TestService {

	Map<Integer, String> shainListMap = new HashMap<Integer, String>();
			put(001, "鈴木イチロー"),
			put(002, "田中将大"),
			put(003, "高橋雄介"),
			put(004, "鈴木亮一"),
			put(014, "橋本省吾")

	/**
	 * memberの情報設定
	 * 
	 * @param form 画面情報から取得
	 */
	public void setShainInfo(TestForm form) {
		
		if (form.getShainListMap().containsKey(form.getShainNo())) {
			form.getShainNameKanji(form.getShainNo());
		} else {
			form.putToShainListMap(000, "該当する社員はいません");
			form.getShainNameKanji(000);
		}
		// member 各情報を設定する。
		// form.setShainNameKanji("鈴木イチロー");
		// form.getShainNameKanji(form.getShainNo());
	}

	private int put(int i, String string) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}
}
