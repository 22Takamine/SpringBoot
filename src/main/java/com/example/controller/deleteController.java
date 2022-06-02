package com.example.controller;


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
import com.example.controller.form.deleteForm;
import com.example.controller.service.ProductService;



//@Controller
public class deleteController {

    @Autowired
    ProductService productService;
    
    @Autowired
    MessageSource messageSource;
    
    

    @RequestMapping({ "/", "/index"})
    public String index(@ModelAttribute("index") deleteForm form, Model model) {
        return "delete";
    }

    @RequestMapping(value = "/delete",  method = RequestMethod.POST)
    public String delete(@Validated @ModelAttribute("index") deleteForm form, BindingResult bindingResult, Model model) {
    	if (bindingResult.hasErrors()) {
            return "delete";
        }
    	
    	Integer id = Integer.valueOf(form.getId());
    	Product product = productService.findById(id);
    	
    	if(product == null) {
    		String errMsg = messageSource.getMessage("select.error", null, Locale.getDefault());
    		model.addAttribute("msg", errMsg);
    		return "delete";
    	}
    
    	productService.delete(id);
    		
        return "deleteResult";
    }
    


}
