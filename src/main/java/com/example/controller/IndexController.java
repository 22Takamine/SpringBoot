package com.example.controller;

<<<<<<< HEAD
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.controller.entity.Product;
import com.example.controller.form.IndexForm;
import com.example.controller.service.ProductService;



@Controller
public class IndexController {

    @Autowired
    ProductService productService;

    @RequestMapping({ "/", "/index" })
    public String index(@ModelAttribute("index") IndexForm form, Model model) {
        return "top";
    }

    @RequestMapping(value = "/result", params="seach", method = RequestMethod.POST)
    public String seach(@ModelAttribute("index") IndexForm form, Model model) {
    	List<Product> product;
    	String name = form.getName();
    	String price = form.getPrice();
    	Integer priceNum = null;
    	if(!price.isEmpty()) {
    		priceNum = Integer.valueOf(price);
    	}
    	//Integer priceNum = Integer.valueOf(price);
    	
    	if(name.isEmpty() && price.isEmpty()) {
    		product = productService.findAll();
    		
    	}else if(!name.isEmpty() && !price.isEmpty()) {
    		product = productService.findByNameAndPrice(name, priceNum);
    		
    	}else {
    		product = productService.findByNameOrPrice(name, priceNum);
    	}
    	
        model.addAttribute("productList", product);
        return "serchResult";
    }
    
    @RequestMapping(value = "/result", params="register", method = RequestMethod.POST)
    public String register(@ModelAttribute("index") IndexForm form, Model model) {
    	String name = form.getName();
    	String price = form.getPrice();
    	Integer priceNum = null;
    	if(!price.isEmpty()) {
    		priceNum = Integer.valueOf(price);
    	}
    	
    	productService.insert(name, priceNum);
        
        return "insertResult";
    }

}
=======
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.controller.entity.Product;
import com.example.controller.form.IndexForm;

@Controller
public class IndexController {

    // 入力画面
    @RequestMapping("/index")
    public String index(@ModelAttribute("index") IndexForm form, Model model) {
        // プルダウンの内容を作成
        // (実際はDaoを使ってDBから取得)
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(101, "鉛筆", 50));
        productList.add(new Product(102, "消しゴム", 100));

        // プルダウンの内容をmodelにセット
        model.addAttribute("productList", productList);
        // 入力画面へ
        return "index";
    }

    // 結果画面
    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public String result(@ModelAttribute("index") IndexForm form, Model model) {
        // 選択したidを取得
        String name = form.getName();
        Integer productId = form.getProductId();

        // idを元に、userオブジェクトを作成
        // (実際は、DBから取得した値を使う)
        Product product = null;
        switch (productId) {
        case 101:
            product = new Product(101, "鉛筆", 50);
            break;
        case 102:
            product = new Product(102, "消しゴム", 100);
            break;
        }

        // userオブジェクトをmodelにセット
        model.addAttribute("user", name);
        model.addAttribute("product", product);

        // 結果画面へ
        return "result";
    }

}




>>>>>>> branch 'adv/lesson3' of https://github.com/22Takamine/SpringBoot.git
