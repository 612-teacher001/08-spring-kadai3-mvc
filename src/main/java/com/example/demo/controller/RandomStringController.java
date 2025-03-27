package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.RandomStringService;

@Controller
public class RandomStringController {

	@Autowired
	RandomStringService service;
	
	@PostMapping("/random")
	public String generate(@RequestParam int charLength,                               // 生成文字数
						   @RequestParam(defaultValue = "false") boolean withNumber,   // 数字混在
						   @RequestParam(defaultValue = "false") boolean withAlphabet, // 英字のみ
						   @RequestParam(name = "createCount", defaultValue = "1") int count,              // 生成文字列数
						   Model model // 遷移先にデータを引き継ぐスコープ
						  ) {
		// ランダム文字列生成サービスによる文字列リストの生成
		List<String> stringList = service.generate(charLength, withNumber, withAlphabet, count);
		// 入力値と生成した文字列リストをスコープに登録
		model.addAttribute("charLength", charLength);
		model.addAttribute("withNumber", withNumber);
		model.addAttribute("withAlphabet", withAlphabet);
		model.addAttribute("createCount", count);
		model.addAttribute("randList", stringList);
		// 自画面遷移
		return "random";
	}
	
	/**
	 * ランダム文字列ジェネレータトップ画面表示
	 * @return
	 */
	@GetMapping("/random")
	public String index() {
		// 初期画面表示
		return "random";
	}
}
