package com.example.controller.form;

import javax.validation.constraints.NotEmpty;


public class updateForm {
	
	@NotEmpty
    private String id;
    
    @NotEmpty
    private String name;
    
    @NotEmpty
    private String price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

