package com.estudos.junit.service;


import org.springframework.stereotype.Component;

@Component
public class CalculadoraService {

    public Integer sum(int a, int b) {
        return a + b;
    }

    public Integer subtract(int a, int b) {
        return a - b;
    }

    public Integer multiply(int a, int b) {
        return a * b;
    }

    public Integer divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
