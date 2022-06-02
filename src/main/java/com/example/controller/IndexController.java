package com.example.controller;


import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.controller.entity.Product;
import com.example.controller.form.IndexForm;
import com.example.controller.service.ProductService;



//@Controller
public class IndexController {

    @Autowired
    ProductService productService;
    
    @Autowired
    MessageSource messageSource;
    
    

    @RequestMapping({ "/", "/index"})
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
    	
    	if(product == null) {
    		String errMsg = messageSource.getMessage("select.error", null, Locale.getDefault());
    		model.addAttribute("msg", errMsg);
    		return "top";
    	}
    	
        model.addAttribute("productList", product);
        return "serchResult";
    }
    
    @RequestMapping(value = "/result", params="register", method = RequestMethod.POST)
    public String register(@Validated  @ModelAttribute("index") IndexForm form, BindingResult bindingResult, Model model) {
    	if (bindingResult.hasErrors()) {
    		
            return "top";
        }
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
