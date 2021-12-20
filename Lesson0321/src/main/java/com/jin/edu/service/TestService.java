package com.jin.edu.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.jin.edu.form.TestForm;

@Service
public class TestService {

	Map<Integer, String> shainListMap = new HashMap<>();
			shainListMap.put(001, "鈴木イチロー");
			shainListMap.put(002, "田中将大");
			shainListMap.put(003, "高橋雄介");
			shainListMap.put(004, "鈴木亮一");
			shainListMap.put(014, "橋本省吾");

	/**
	 * memberの情報設定
	 * 
	 * @param form 画面情報から取得
	 */
	public void setShainInfo(TestForm form) {
		
		if (shainListMap.containsKey(form.getShainNo())) {
			shainListMap.get(form.getShainNo());
		} else {
			shainListMap.put(000, "該当する社員はいません");
			shainListMap.get(000);
		}
		// member 各情報を設定する。
		// form.setShainNameKanji("鈴木イチロー");
		// form.getShainNameKanji(form.getShainNo());
	}
}
