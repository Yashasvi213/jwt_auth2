package com.example.demo.model;

import java.util.List;

public class JwtResponse {
    private String jwtToken;
    private String username;
    private List<String> roles;  // Add the roles field to store user roles

    public JwtResponse() {
        super();
    }

    public JwtResponse(String jwtToken, String username, List<String> roles) {
        super();
        this.jwtToken = jwtToken;
        this.username = username;
        this.roles = roles;  // Initialize roles
    }

    @Override
    public String toString() {
        return "JwtResponse [jwtToken=" + jwtToken + ", username=" + username + ", roles=" + roles + "]";
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
}
