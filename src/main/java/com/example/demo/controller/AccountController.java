package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Account;

@Controller
public class AccountController {
	/**
	 * 確認画面表示
	 * @return 確認画面のThymeleafテンプレート名
	 */
	@PostMapping("/account/confirm")
	public String confirm(@RequestParam String name,     // 氏名
						  @RequestParam String email,    // メールアドレス
						  @RequestParam String password, // パスワード
						  Model model // 遷移先画面にデータを引き継ぐ場合
						 ) {
		// 取得したリクエストパラメータから会員クラスのインスタンスを生成
		Account account = new Account(name, email, password);
		// 会員のインスタンスを自画面に引き継ぐためにスコープに登録
		model.addAttribute("account", account);
		// 画面遷移
		return "accountConfirm";
	}
	
	/**
	 * 初期画面表示
	 * @return 初期画面のThymeleafテンプレート名
	 */
	@GetMapping("/account")
	public String index() {
		// 初期画面表示
		return "accountForm";
	}
}
