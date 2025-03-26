package com.example.demo.model;

public class Account {
	
	/**
	 * フィールド
	 */
	private String name;     // 氏名
	private String email;    // メールアドレス
	private String password; // パスワード
	
	/**
	 * デフォルトコンストラクタ
	 */
	public Account() {}

	/**
	 * コンストラクタ
	 * @param name     氏名
	 * @param email    メールアドレス
	 * @param password パスワード
	 */
	public Account(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
