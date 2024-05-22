package com.lemicode;
/**
 * 「招待状生成」クラス
 */
public class JAVA64 {

	public static void main(String[] args) {
		//参加者の名前とイベントの日付
		String name = "山田太郎";
		String date = "2023年4月1日";
		
		//招待状のテキストをフォーマット
		String invitation = String.format("%s様、%sのイベントにご招待します。", name, date);
		System.out.println(invitation);

	}

}
