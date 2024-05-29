package com.lemicode;

/**
 * 「注文処理」クラス
 */
public class OrderProcessor {
	// カスタム例外クラス
	class OutOfStockException extends Exception {
		public OutOfStockException(String message) {
			super(message);
		}
	}
	 class PaymentAuthorizationException extends Exception {
		 public PaymentAuthorizationException(String message) {
            super(message);
        }
    }
	
	// 商品の在庫をチェックするメソッド
	public void checkStock(int productId, int amount) throws OutOfStockException {
	//ダミー在庫データ
		int stock = 3; // 例: 全ての商品は5個在庫があると仮定
		
		if (amount > stock) {
			throw new OutOfStockException("商品ID " + productId + " の在庫が不足しています");
		}
	}
	
	//クレジットカード承認を行うメソッド
	public void authorizePayment(String creditCardInfo) throws PaymentAuthorizationException{
		// ダミー承認処理
		boolean isAuthorized = creditCardInfo.equals("valid-card");
		
		if (!isAuthorized) {
			throw new PaymentAuthorizationException("クレジットカードの承認に失敗しました");
		}
	}
	
    // 注文処理メソッド
	public void OrderInfo (int productId, int amount, String creditCardInfo) {
		try {
			checkStock(productId, amount);
			authorizePayment(creditCardInfo);
			System.out.println("注文が成功しました: 商品ID " + productId + " 数量 " + amount);
		} catch (OutOfStockException e) {
			System.out.println("エラーメッセージ: " + e.getMessage());
		} catch (PaymentAuthorizationException e) {
			System.out.println("エラーメッセージ: " + e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		OrderProcessor processor = new OrderProcessor();
		
		// 例1: 正常な注文
		int productId1 = 123;
		int amount1 = 2;
		String creditCardInfo1 = "valid-card";
		System.out.println("注文を処理中: 商品ID " + productId1 + " 数量 " + amount1);
		processor.OrderInfo(productId1, amount1, creditCardInfo1);
		
		// 例2: 在庫不足
        int productId2 = 102;
        int amount2 = 10;
        String creditCardInfo2 = "valid-card";
        System.out.println("注文を処理中: 商品ID " + productId2 + " 数量 " + amount2);
        processor.OrderInfo(productId2, amount2, creditCardInfo2);

        // 例3: クレジットカード承認失敗
        int productId3 = 103;
        int amount3 = 2;
        String creditCardInfo3 = "invalid-card";
        System.out.println("注文を処理中: 商品ID " + productId3 + " 数量 " + amount3);
        processor.OrderInfo(productId3, amount3, creditCardInfo3);
	}
}
