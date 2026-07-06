package com.example;

/**
 * A simple calculator class written by a human.
 * This code has NO AI-generated content.
 */
public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public int add(int x) {
        return value += x;
    }

    public int subtract(int x) {
        return value -= x;
    }

    public int getValue() {
        return value;
    }
}
