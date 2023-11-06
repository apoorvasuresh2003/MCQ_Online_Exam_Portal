package com.acharya.mcq.data.model;

import java.io.Serializable;

public class AuthoritiesID implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
    private String authority;
    
    public AuthoritiesID() {
    }
    public AuthoritiesID(String username, String authority) {
        this.username = username;
        this.authority = authority;
    }  
}
