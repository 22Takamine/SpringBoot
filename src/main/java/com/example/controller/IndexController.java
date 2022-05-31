package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.controller.form.IndexForm;

@Controller
public class IndexController {

    // 入力画面
    @RequestMapping("/index")
    public String index(@ModelAttribute("test") IndexForm form, Model model) {
        // 入力画面へ
        return "index";
    }

    // ログイン画面
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(@ModelAttribute("test") IndexForm form, Model model) {

        return "login";
    }
    
 // 結果画面
    @RequestMapping(value = "/menu", params ="menu", method = RequestMethod.POST)
    public String menu(@ModelAttribute("test") IndexForm form, Model model) {
    	String id = form.getId();
    	Integer pass = form.getPass();
    	model.addAttribute("id", id);
    	model.addAttribute("pass", pass);
    	
    	return "menu";
    	
    }
    
    @RequestMapping(value = "/menu", params ="index", method = RequestMethod.POST)
    public String loginBack(@ModelAttribute("test") IndexForm form, Model model) {
    	return "index";
    	
    }	
    	
    	
        // 選択したidを取得
//        String name = form.getName();
//        Integer productId = form.getProductId();
//
//        // idを元に、userオブジェクトを作成
//        // (実際は、DBから取得した値を使う)
//        Product product = null;
//        switch (productId) {
//        case 101:
//            product = new Product(101, "鉛筆", 50);
//            break;
//        case 102:
//            product = new Product(102, "消しゴム", 100);
//            break;
//        }
//
//        // userオブジェクトをmodelにセット
//        model.addAttribute("user", name);
//        m//
//        // 結果画面へ
//        return "result";
//    }odel.addAttribute("product", product);


}




