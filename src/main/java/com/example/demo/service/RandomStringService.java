package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

@Service
public class RandomStringService {
	
	/**
	 * クラス定数：生成文字列の個数
	 */
	private static final int GENERATE_NUM = 10;

	/**
	 * ランダムな文字列のリストを生成する
	 * @param charLength ひとつの文字列の文字数
	 * @param withNumber 数字を含める場合はtrue、それ以外はfalse
	 * @return ランダムな文字列のリスト
	 */
	@SuppressWarnings("deprecation") // TODO: 非推奨メソッドを検討する！
	public List<String> generate(int charLength, boolean withNumber) {
		// 生成した文字列を格納する文字列リストの初期化
		List<String> list = new ArrayList<>();
		// 生成する個数分の繰り返し
		for (int i = 0; i < GENERATE_NUM; i++) {
			if (withNumber) {
				// 数字を含む文字列を文字列リストに追加
				list.add(RandomStringUtils.randomAlphanumeric(charLength));
			} else {
				// 数字を含まない文字列を文字列リストに追加
				list.add(RandomStringUtils.randomAlphabetic(charLength));
			}
		}
		return list;
	}
	
}
