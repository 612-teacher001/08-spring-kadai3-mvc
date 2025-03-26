package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/sp30")
	public String index() {
		// 初期画面表示
		return "index";
	}
}
