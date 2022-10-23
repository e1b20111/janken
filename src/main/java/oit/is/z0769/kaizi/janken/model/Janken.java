package oit.is.z0769.kaizi.janken.model;

import java.util.Random;

/**
 * Spring BootでModelとして扱われるクラス フレームワークがフィールドに値を代入したり，取得したりするため，getter/setterが必要
 */

public class Janken {
  String enemy;
  String me;
  String result;

  // コンストラクタ
  public Janken(String hand) {

    // ランダム処理
    Random rand = new Random();
    int num = rand.nextInt(3);
    if (num == 0) {
      this.enemy = "gu";
    }
    if (num == 1) {
      this.enemy = "choki";
    }
    if (num == 2) {
      this.enemy = "pa";
    }

    this.me = hand;

    ResultCheck();

  }

  private void ResultCheck() {
    if (this.me.equals("gu") && this.enemy.equals("gu")) {
      this.result = "Draw";
    }
    if (this.me.equals("gu") && this.enemy.equals("choki")) {
      this.result = "You Win!";
    }
    if (this.me.equals("gu") && this.enemy.equals("pa")) {
      this.result = "You Lose";
    }

    if (this.me.equals("choki") && this.enemy.equals("gu")) {
      this.result = "You Lose";
    }
    if (this.me.equals("choki") && this.enemy.equals("choki")) {
      this.result = "Draw";
    }
    if (this.me.equals("choki") && this.enemy.equals("pa")) {
      this.result = "You Win!";
    }

    if (this.me.equals("pa") && this.enemy.equals("gu")) {
      this.result = "You Win!";
    }
    if (this.me.equals("pa") && this.enemy.equals("choki")) {
      this.result = "You Lose";
    }
    if (this.me.equals("pa") && this.enemy.equals("pa")) {
      this.result = "Draw";
    }

  }

  public String getEne() {
    return enemy;
  }

  public void setEne(String enemy) {
    this.enemy = enemy;
  }

  public String getMe() {
    return me;
  }

  public void setMe(String me) {
    this.me = me;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }
}
