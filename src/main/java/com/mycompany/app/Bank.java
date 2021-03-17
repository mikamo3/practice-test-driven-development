package com.mycompany.app;

public class Bank {
    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
