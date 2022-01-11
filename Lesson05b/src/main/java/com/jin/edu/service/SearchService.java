package com.jin.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jin.edu.dto.MergeInfoDto;
import com.jin.edu.form.SearchForm;
import com.jin.edu.mapper.MergeInfoDaoMapper;

@Service
public class SearchService {

	@Autowired
	private MergeInfoDaoMapper mapper;
	// 検索フォーム部実装
	public void select(SearchForm form) {
		// formオブジェクト初期化
		MergeInfoDto mergeInfo = null;
		// 検索キーワードをトリガとしてDBアクセスし取得した値をオブジェクトに渡す
		if (form.getShainNo() != null) {
			mergeInfo = mapper.select(form.getShainNo());
			form.setMergeInfo(mergeInfo);
		}
	}
}
