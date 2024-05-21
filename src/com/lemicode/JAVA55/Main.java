package com.lemicode.JAVA55;

public class Main {

	public static void main(String[] args) {
		 // 音楽とビデオのインスタンスを生成
		Music music = new Music();
		Video video = new Video();
		
		music.displayInfo();//"音楽: 「Beethoven - Symphony No.9」, 長さ: 70分" と出力される
		music.replay();//"再生中: Beethoven - Symphony No.9" と出力される
		

		video.displayInfo();//"ビデオ: 「Spirited Away」, 長さ: 125分" と出力される
		video.replay();//"再生中: Spirited Away" と出力される
	}

}
