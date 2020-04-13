package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	// *** コントローラ ***

	// インデックスページへ遷移するメソッド
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String toIndexPage(Model model) throws Exception {
	    model.addAttribute("message", "This is index Page.");
	    return "index";
	}

	// テストページへ遷移するメソッド
	@RequestMapping(value = "test", method = RequestMethod.GET)
	public String toTestpage(Model model) {
	    model.addAttribute("message", "This is Test Page");
	    return "test";
	}

	// *** メソッド ***




}