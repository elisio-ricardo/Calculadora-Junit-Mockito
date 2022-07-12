package com.estudos.junit.controllerTeste;


import com.estudos.junit.controller.CalculadoraController;
import com.estudos.junit.facade.CalculadoraFacade;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CalculadoraControllerTeste {

    @Mock
    private CalculadoraFacade calculadoraFacade;

    @InjectMocks
    private CalculadoraController calculadoraController;

    @Test
    public void somaTeste() {
        int a = 5;
        int b = 7;
        int resultadoEsperado = 12;

        Mockito.when(calculadoraFacade.sum(a, b)).thenReturn(resultadoEsperado);

        ResponseEntity<Integer> resultado = calculadoraController.somar(a, b);

        assertEquals(resultado.getBody(), resultadoEsperado);
        assertEquals(resultado.getStatusCodeValue(), 200);

        Mockito.verify(calculadoraFacade, Mockito.times(1)).sum(a, b);
    }

    @Test
    public void subtrairTeste() {
        int a = 10;
        int b = 5;
        int resultadoEsperado = 5;

        Mockito.when(calculadoraFacade.subtract(a, b)).thenReturn(resultadoEsperado);

        ResponseEntity<Integer> resultado = calculadoraController.subtrair(a, b);

        assertEquals(resultado.getBody(), resultadoEsperado);
        assertEquals(resultado.getStatusCodeValue(), 200);

        Mockito.verify(calculadoraFacade, Mockito.times(1)).subtract(a, b);
    }

    @Test
    public void multiplicarTeste() {
        int a = 5;
        int b = 3;
        int resultadoEsperado = 15;

        Mockito.when(calculadoraFacade.multiply(a, b)).thenReturn(resultadoEsperado);

        ResponseEntity<Integer> resultado = calculadoraController.multiplicar(a, b);

        assertEquals(resultado.getBody(), resultadoEsperado);
        assertEquals(resultado.getStatusCodeValue(), 200);

        Mockito.verify(calculadoraFacade, Mockito.times(1)).multiply(a, b);
    }

    @Test
    public void dividirTeste() {
        int a = 25;
        int b = 5;
        int resultadoEsperado = 5;

        Mockito.when(calculadoraFacade.divide(a, b)).thenReturn(resultadoEsperado);

        ResponseEntity<Integer> resultado = calculadoraController.dividir(a, b);

        assertEquals(resultado.getBody(), resultadoEsperado);
        assertEquals(resultado.getStatusCodeValue(), 200);

        Mockito.verify(calculadoraFacade, Mockito.times(1)).divide(a, b);
    }

    @Test
    public void somaEMultiplica() {
        int a = 5;
        int b = 3;
        int soma = 8;
        int c = 10;
        int resultadoEsperado = 80;

        Mockito.when(calculadoraFacade.sumAndMultiply(a, b, c)).thenReturn(resultadoEsperado);

        ResponseEntity<Integer> resultado = calculadoraController.somaMultiplica(a, b, c);

        assertEquals(resultado.getBody(), resultadoEsperado);
        assertEquals(resultado.getStatusCodeValue(), 200);

        Mockito.verify(calculadoraFacade, Mockito.times(1)).sumAndMultiply(a, b, c);
    }
}
