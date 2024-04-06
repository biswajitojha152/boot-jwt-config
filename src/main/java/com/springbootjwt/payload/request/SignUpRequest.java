package com.springbootjwt.payload.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Set;

public class SignUpRequest {
    @NotBlank(message = "Username must not be blank.")
    @Size(min = 3, max = 20, message = "Username must be between 3 and 20.")
    private String username;

    @NotBlank(message = "Email must not be blank.")
    @Size(max = 50, message = "Email must be less than 50.")
    @Email(message = "Email must be valid.")
    private String email;

    private Set<String> role;

    @NotBlank(message = "Password must not be blank.")
    @Size(min = 6, max = 40, message = "Password must be between 6 and 40.")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
