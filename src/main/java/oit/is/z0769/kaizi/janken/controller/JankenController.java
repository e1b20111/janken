package oit.is.z0769.kaizi.janken.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z0769.kaizi.janken.model.Janken;
import oit.is.z0769.kaizi.janken.model.Entry;

/**
 * JankenController
 *
 * クラスの前に@Controllerをつけていると，HTTPリクエスト（GET/POSTなど）があったときに，このクラスが呼び出される
 */
@Controller
public class JankenController {

  @Autowired
  private Entry entry;

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
<<<<<<< Updated upstream
   *  にPOSTでアクセスされるとこのメソッドが呼び出される
=======
   *
   * @param model Thymeleafにわたすデータを保持するオブジェクト
   * @param prin  ログインユーザ情報が保持されるオブジェクト
   * @return
   */

  @GetMapping("/janken")
  public String LoginUser(Principal prin, ModelMap model) {
    String loginUser = prin.getName();
    this.entry.addUser(loginUser);
    model.addAttribute("myname", entry.getMyName());
    model.addAttribute("entry", this.entry);
    return "janken.html";
  }

  /**
>>>>>>> Stashed changes
   *
   * @param hand
   * @param model
   * @return
   *
   */
  @GetMapping("/jankengame")
  public String JankenGame(@RequestParam String hand, ModelMap model) {

    // じゃんけんゲーム関係の処理
    Janken Janken = new Janken(hand);
    model.addAttribute("me", Janken.getMe());
    model.addAttribute("enemy", Janken.getEne());
    model.addAttribute("result", Janken.getResult());
    return "janken.html";
  }

}
