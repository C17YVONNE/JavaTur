package com.lemicode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//カスタム例外クラス
class InvalidFileFormatException extends Exception {
	public InvalidFileFormatException(String message) {
		super(message);
	}
}

//ファイル行読み込みクラス
public class FileLineReader {

	private String filePath;

	public FileLineReader(String filePath) {
		this.filePath = filePath;
	}

	public void readLines() {

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			if (!filePath.endsWith(".csv")) {
				throw new InvalidFileFormatException("ファイル形式が無効です。CSVファイルを指定してください。");
			}
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println("エラー: ファイルが見つかりません。");
		} catch (IOException e) {
			System.err.println("エラー: ファイルの読み込み中にエラーが発生しました。");
		} catch (InvalidFileFormatException e) {
			System.err.println("エラー: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// テスト例
		String filePath = "D:\\Github\\JavaTur\\src\\com\\lemicode\\data.csv";

		FileLineReader fileLineReader = new FileLineReader(filePath);
		fileLineReader.readLines();
	}
}
