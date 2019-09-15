package com.example.hackthonproject;

public class Login {
    String n;
    String m;
    String num;
    String id;
    public Login() {

    }

    public Login(String n, String m, String num, String id) {
        this.n = n;
        this.m = m;
        this.num = num;
        this.id = id;
    }
    public String getN() {
        return n;
    }

    public String getM() {
        return m;
    }

    public String getNum() {
        return num;
    }

    public String getId() {
        return id;
    }
}
