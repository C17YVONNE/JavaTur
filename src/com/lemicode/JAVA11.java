package com.lemicode;




/**
 * 正規表現を使用して、メールアドレスのフォーマットが合法かどうかを検証するJavaプログラムを書いてください
 * ユーザーが入力したメールアドレスがフォーマットに合致すれば「メールアドレスのフォーマットが合法です」と出力し
 * そうでなければ「メールアドレスのフォーマットが不合法です」と出力してください
 */
import java.util.Scanner;		
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JAVA11 {
    public static void main(String[] args) {
    	System.out.println("メールアドレスを入力してください");
    	Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        // メールアドレスの正規表現パターン
        String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        // パターンをコンパイル
        Pattern pattern = Pattern.compile(emailPattern);

        // 入力されたメールアドレスとパターンをマッチング
        Matcher matcher = pattern.matcher(email);

        // マッチング結果を判定して出力
        if (matcher.matches()) {
            System.out.println("メールアドレスのフォーマットが合法です");
        } else {
            System.out.println("メールアドレスのフォーマットが不合法です");
        }
    }
}

