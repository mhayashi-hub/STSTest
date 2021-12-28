package com.jin.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jin.edu.dto.BushoInfoDto;
import com.jin.edu.form.SearchForm;
import com.jin.edu.mapper.BushoInfoDaoMapper;

@Service
public class SearchService {

	@Autowired
	private BushoInfoDaoMapper mapper;
	// 検索フォーム部の実装
	public void select(SearchForm form) {
		// formのオブジェクトの初期化、nullで初期化していいのかは少し疑問
		BushoInfoDto bushoInfo = null;
		// 検索キーワードが入ったらDBアクセスして返ってきた値をオブジェクトに設定
		if (form.getBushoCd() != null) {
			bushoInfo = mapper.select(form.getBushoCd());
			form.setBushoInfo(bushoInfo);
		}
	}
}
