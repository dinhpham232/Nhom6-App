package com.example.phamg.quanly;

/**
 * Created by phamg on 9/18/2017.
 */

public class NhanVien {
    private String name;
    private String email;
    private String phone;
    private String username;
    private String password;

    public NhanVien() {
    }

    public NhanVien(String name, String email, String phone, String username, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"\r\nEmail: "+this.email+"\r\nPhone: "+this.phone+"\r\nUsername: "+this.username;
    }
}
