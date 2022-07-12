package com.estudos.junit.serviceTest;


import com.estudos.junit.service.CalculadoraService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class CalculadoraServiceTeste {

    private CalculadoraService calculadoraService;

    @BeforeEach
    public void init() {
        this.calculadoraService = new CalculadoraService();
    }

    @Test
    public void somaTeste() {
        int a = 7;
        int b = 8;
        int resultadoExperado = 15;

        Integer resultado = calculadoraService.sum(a, b);

        assertEquals(resultado, resultadoExperado);
    }

    @Test
    public void subtrairTeste() {
        int a = 8;
        int b = 7;
        int resultadoEsperado = 1;
        Integer resultado = calculadoraService.subtract(a, b);

        assertEquals(resultado, resultadoEsperado);
    }

    @Test
    public void multiplicarTeste() {
        int a = 2;
        int b = 5;

        int resultadoEsperado = 10;

        Integer resultado = calculadoraService.multiply(a, b);

        assertEquals(resultado, resultadoEsperado);
    }

    @Test
    public void divideTest() {
        int a = 10;
        int b = 2;

        int resultadoEsperado = 5;

        Integer resultado = calculadoraService.divide(a, b);

        assertEquals(resultado, resultadoEsperado);
    }

    @Test
    public void dividePorZeroTeste() {
        int a = 10;
        int b = 0;
        Exception exception = assertThrows(ArithmeticException.class, () ->
                calculadoraService.divide(a, b));

        assertEquals("Division by zero", exception.getMessage());
    }
}

