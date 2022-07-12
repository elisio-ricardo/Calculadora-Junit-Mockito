package com.estudos.junit.facadeTeste;


import com.estudos.junit.facade.CalculadoraFacade;
import com.estudos.junit.service.CalculadoraService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CalculadoraFacadeTeste {

    @Mock
    private CalculadoraService calculadoraService;

    @InjectMocks
    private CalculadoraFacade calculadoraFacade;

    @Test
    public void somaTesteDoisParametrosPositivos() {
        int a = 7;
        int b = 8;
        int resultadoEsperado = 15;

        Mockito.when(calculadoraService.sum(a, b)).thenReturn(resultadoEsperado);

        Integer resultado = calculadoraFacade.sum(a, b);

        assertEquals(resultado, resultadoEsperado);
        Mockito.verify(calculadoraService, Mockito.times(1)).sum(a, b);
    }

    @Test
    public void somaTesteUmParametroNegativo() {
        int a = -5;
        int b = 10;

        int resultadoEsperado = 5;
        Mockito.when(calculadoraService.sum(a, b)).thenReturn(resultadoEsperado);

        Integer resultado = calculadoraFacade.sum(a, b);

        assertEquals(resultado, resultadoEsperado);
        Mockito.verify(calculadoraService, Mockito.times(1)).sum(a, b);

    }

    @Test
    public void somaTesteDoisParametrosNegativos() {
        int a = -5;
        int b = -10;

        int resultadoEsperado = -15;
        Mockito.when(calculadoraService.sum(a, b)).thenReturn(resultadoEsperado);

        Integer resultado = calculadoraFacade.sum(a, b);

        assertEquals(resultado, resultadoEsperado);
        Mockito.verify(calculadoraService, Mockito.times(1)).sum(a, b);
    }

    @Test
    public void subtrairTeste() {
        int a = 10;
        int b = 5;

        int resultadoEsperado = 5;
        Mockito.when(calculadoraService.subtract(a, b)).thenReturn(resultadoEsperado);

        Integer resultado = calculadoraFacade.subtract(a, b);

        assertEquals(resultado, resultadoEsperado);
        Mockito.verify(calculadoraService, Mockito.times(1)).subtract(a, b);
    }

    @Test
    public void multiplicacaoTeste() {
        int a = 5;
        int b = 2;

        int resultadoEsperado = 10;
        Mockito.when(calculadoraService.multiply(a, b)).thenReturn(resultadoEsperado);

        Integer resultado = calculadoraFacade.multiply(a, b);

        assertEquals(resultado, resultadoEsperado);
        Mockito.verify(calculadoraService, Mockito.times(1)).multiply(a, b);
    }

    @Test
    public void dividirTeste() {
        int a = 10;
        int b = 2;
        int resultadoEsperado = 5;

        Mockito.when(calculadoraService.divide(a, b)).thenReturn(resultadoEsperado);

        Integer resultado = calculadoraFacade.divide(a, b);

        assertEquals(resultado, resultadoEsperado);
        Mockito.verify(calculadoraService, Mockito.times(1)).divide(a, b);
    }

    @Test
    public void somaEMultiplicaTeste() {
        int a = 5;
        int b = 2;
        int soma = 7;
        int c = 5;
        int resultadoEsperado = 35;

        Mockito.when(calculadoraService.sum(a, b)).thenReturn(soma);
        Mockito.when(calculadoraService.multiply(soma, c)).thenReturn(resultadoEsperado);

        Integer resultado = calculadoraFacade.sumAndMultiply(a, b, c);

        assertEquals(resultado, resultadoEsperado);

        Mockito.verify(calculadoraService, Mockito.times(1)).sum(a, b);
        Mockito.verify(calculadoraService, Mockito.times(1)).multiply(soma, c);
    }
}
