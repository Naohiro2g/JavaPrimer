# 練習問題#13


## 問題（１）

- 練習#13で作成したLIBSVM形式のデータに対してsvm_scaleを実行し、正規化を行え。
 - 以下のパラメータを変化させながら複数回、svm_trainを実行するJavaプログラムを実装せよ。
 （グリッドサーチという。）
  - -c（コスト）を2<sup>-5</sup>から2<sup>15</sup>まで指数を2刻み
  - -g（ガンマ）を2<sup>-5</sup>から2<sup>15</sup>まで指数を2刻み
- Accuracyの変化を観察せよ。
  

## 問題（２）

問題(1)のグリッドサーチを、並列処理で行うようにせよ。

コードのどこかで匿名クラスを使ってみよ。

(オプション)
コードのどこかでラムダ式を使ってみよ。


## 目的

SVMの性能を上げてみよう！

上げるのに手っ取り早い方法
 - 特徴量を増やす
 - 正規化
 - c(コスト)とg(ガンマ)の最適化