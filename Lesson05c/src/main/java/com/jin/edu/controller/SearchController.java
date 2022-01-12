package com.jin.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jin.edu.form.SearchForm;
import com.jin.edu.service.SearchService;

@Controller
public class SearchController {

	@Autowired
	private SearchService service;
	
	// 初期画面表示機能
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(@ModelAttribute("form") SearchForm form) {
		return "index";
	}
	// 検索結果表示機能
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String search(@ModelAttribute("form") SearchForm form, Model model) {
		service.select(form);
		model.addAttribute("form", form);
		return "index";
	}
	
}
