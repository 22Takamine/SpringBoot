package com.example.controller.form;

import javax.validation.constraints.NotEmpty;


public class deleteForm {

	@NotEmpty
    private String id;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

