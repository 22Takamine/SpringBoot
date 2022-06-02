package com.example.controller;


import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.controller.entity.Product;
import com.example.controller.form.IndexForm;
import com.example.controller.form.updateForm;
import com.example.controller.service.ProductService;



@Controller
public class updateController {

    @Autowired
    ProductService productService;
    
    @Autowired
    MessageSource messageSource;
    
    

    @RequestMapping({ "/", "/index"})
    public String index(@ModelAttribute("index") IndexForm form, Model model) {
        return "update";
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@Validated  @ModelAttribute("index") updateForm form, BindingResult bindingResult, Model model) {
    	if (bindingResult.hasErrors()) {
            return "update";
        }
    	String id = form.getId();
    	String name = form.getName();
    	String price = form.getPrice();
    	
    	Integer productId = Integer.valueOf(id);
    	Integer productPrice = Integer.valueOf(price);
    	
    	Product product = productService.findById(productId);
    	
    	if(product == null) {
    		String errMsg = messageSource.getMessage("select.error", null, Locale.getDefault());
    		model.addAttribute("msg", errMsg);
    		return "update";
    	}
    	
    	model.addAttribute("productOld", product);
    	
    	productService.update(productId, name, productPrice);
    	
    	product = productService.findById(productId);
    	model.addAttribute("productNew", product);
        
        return "updateResult";
    }

}
