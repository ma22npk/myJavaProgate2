class Main {
  public static void main(String[] args) {
    // 真偽値のデータ型はblooean型という。
    // boolean型の変数定義
    // boolean = データ型, bool = 変数名, true =値;
    // boolean bool = true;

    // 比較演算子(==)とは値を比較するための記号
    // 6+2 == 5 ...false
    // 6+2 != 5 ...true
    // 6/3 == 2 ...true
    // 6/2 != 2 ...false
    // System.out.println(true);
    // System.out.println(false);
    // System.out.println(6 + 2 == 5);
    // System.out.println(6 / 2 != 2);
    // 大小比較 ============================
    // x < y (yの方が大きいときtrue)
    // x <= y (yの方が大きいときtrue)
    // x > y (yの方が大きいときtrue)
    // x >= y (yの方が大きいときtrue)
    // 4 + 2 > 6 ...false
    // 4 + 2 >= 6 ...true
    // 8 / 4 < 2 ...false
    // 8 / 4 <= 2 ...true

    // 論理演算子 [START] ============================
    // 「かつ」 [START] -----------------------------
    // xが5の時
    // x > 10 && x < 30 ...false
    // xが20の時
    // x > 10 && x < 30 ...true
    // xが35の時
    // x > 10 && x < 30 ...false
    // 「かつ」 [END] -------------------------------
    // または [START] -----------------------------------
    // xが5の時
    // x < 10 || x > 30 ...true
    // xが20の時
    // x < 10 || x > 30 ...false
    // xが35の時
    // x < 10 || x > 30 ...true
    // または [END] -------------------------------------
    // ~ではない [START] --------------------------------
    // !を用いると「~でない」を表現
    // xが20の時
    // x >= 30 ...false
    // !(x >= 30) ...true
    // ~ではない [END] ----------------------------------

    // 論理演算子 [END] =================================

    // 繰り返し処理 [START] ==============================
    // 1〜１０回目のループですと出力する
    // for (int i = 1; i <= 10; i++) {
    // System.out.println(i + "回目のループです");
    // }

    // break処理 [START] -----------------------------------
    // ループを５回で止める
    // for (int i = 1; i <= 10; i++) {
    // if (i > 5) {
    // break;
    // }
    // System.out.println(i + "回目のループです");
    // }
    // break処理 [END] -------------------------------------
    // continue処理 [START] --------------------------------
    // 10の倍数の間で３の倍数の時は処理をスキップして次のループを実行する。
    // 結果:1,2,4,5,7,8,10
    // for (int i = 1; i <= 10; i++) {
    // if (i % 3 == 0) {
    // continue;
    // }
    // System.out.println(i);
    // }
    // continue処理 [END] ----------------------------------
    // 配列 [START] ----------------------------------------
    // int方の要素を持つ配列はint[], String方の要素を持つ配列はString[]と記述
    int[] numbers = { 5, 13, 29 };
    String[] names = { "John", "Kate", "Bob" };
    // 私の名前は Bob です。
    System.out.println("私の名前は" + names[2] + "です");
    // 私の年齢は 13際 です。
    System.out.println("私の年齢は" + numbers[1] + "歳です");
    // 結果:john kate bob
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }
    // 結果:john kate bob（上記と同じでシンプルにかける）
    for (String name : names) {
      System.out.println(name);
    }
    // 配列 [END] ------------------------------------------

    // 繰り返し処理 [END] ====================================
  }
}
