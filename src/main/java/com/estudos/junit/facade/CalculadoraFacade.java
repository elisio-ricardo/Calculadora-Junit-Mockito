package com.estudos.junit.facade;


import com.estudos.junit.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculadoraFacade {

    @Autowired
    CalculadoraService calculadoraService;

    public Integer sum(int a, int b) {
        return this.calculadoraService.sum(a, b);
    }

    public Integer subtract(int a, int b) {
        return this.calculadoraService.subtract(a, b);
    }

    public Integer multiply(int a, int b) {
        return this.calculadoraService.multiply(a, b);
    }

    public Integer divide(int a, int b) {
        return this.calculadoraService.divide(a, b);
    }

    public Integer sumAndMultiply(int a, int b, int c) {
        int result = this.sum(a, b);
        return this.multiply(result, c);
    }

}
