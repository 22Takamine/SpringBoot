package com.example.controller.form;

import javax.validation.constraints.NotEmpty;


public class IndexForm {

    private Integer id;
    
    @NotEmpty//(message="nameは必須です。")
    private String name;
    
    @NotEmpty//(message="priceは必須です。")
    private String price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}

