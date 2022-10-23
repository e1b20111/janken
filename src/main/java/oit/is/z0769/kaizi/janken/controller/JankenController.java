package oit.is.z0769.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z0769.kaizi.janken.model.Janken;

/**
 * JankenController
 *
 * クラスの前に@Controllerをつけていると，HTTPリクエスト（GET/POSTなど）があったときに，このクラスが呼び出される
 */
@Controller
/**
 * /jankenへのリクエストを扱うクラス authenticateの設定をしていれば， /jankenへのアクセスはすべて認証が必要になる
 */
public class JankenController {

  @GetMapping("/janken")
  public String Janken() {
    return "janken.html";
  }

  /**
   * POSTを受け付ける場合は@PostMappingを利用する /JankenへのPOSTを受け付けて，FormParamで指定された変数(input
   * name)をJanken()メソッドの引数として受け取ることができる
   *
   * @param name
   * @param model
   * @return
   */
  @PostMapping("/janken")
  public String JankenTitle(@RequestParam String name, ModelMap model) {
    model.addAttribute("name", name);
    return "janken.html";
  }

  /**
   * にPOSTでアクセスされるとこのメソッドが呼び出される
   *
   * @param hand
   * @param model
   * @return
   *
   */
  @GetMapping("/jankengame")
  public String JankenGame(@RequestParam String hand, ModelMap model) {
    Janken Janken = new Janken(hand);

    model.addAttribute("me", Janken.getMe());
    model.addAttribute("enemy", Janken.getEne());
    model.addAttribute("result", Janken.getResult());
    return "janken.html";
  }

}
