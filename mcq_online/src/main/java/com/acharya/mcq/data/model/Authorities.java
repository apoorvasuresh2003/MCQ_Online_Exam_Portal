package com.acharya.mcq.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(AuthoritiesID.class)
public class Authorities {

    @Id
    private String username;
    @Id
    private String authority;

	public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getAuthority() {
        return authority;
    }
    public void setAuthority(String authority) {
        this.authority = authority;
    }
    @Override
    public String toString() {
        return "Authorities [username=" + username + ", authority=" + authority + "]";
    }    
}
