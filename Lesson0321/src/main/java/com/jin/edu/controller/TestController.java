package com.jin.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jin.edu.form.TestForm;
import com.jin.edu.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService service;

	/**
	 * 初期画面表示機能
	 * 
	 * @param form  画面情報
	 * @param model
	 * @return HTML
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(@ModelAttribute("form") TestForm form, Model model) {
		return "index";
	}

	/**
	 * 情報設定画面表示機能
	 * 
	 * @param form
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String search(@ModelAttribute("form") TestForm form, Model model) {
		service.setShainInfo(form);
		model.addAttribute("form", form);
		return "index";
	}
}
