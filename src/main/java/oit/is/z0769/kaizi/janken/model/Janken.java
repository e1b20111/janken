package oit.is.z0769.kaizi.janken.model;

/**
 * Spring BootでModelとして扱われるクラス フレームワークがフィールドに値を代入したり，取得したりするため，getter/setterが必要
 */

public class Janken {
  String enemy;
  String me;
  String result;

  // コンストラクタ
  public Janken(String hand) {
    this.enemy = "gu";
    this.me = hand;
    if (hand.equals("gu")) {
      this.result = "Draw";
    }
    if (hand.equals("choki")) {
      this.result = "You Lose";
    }
    if (hand.equals("pa")) {
      this.result = "You Win";
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
