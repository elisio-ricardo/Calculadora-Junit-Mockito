package com.estudos.junit.controller;

import com.estudos.junit.facade.CalculadoraFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @Autowired
    CalculadoraFacade calculadoraFacade;

    @GetMapping("/somar")
    public ResponseEntity<Integer> somar(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(this.calculadoraFacade.sum(a, b));
    }

    @GetMapping("/subtrair")
    public ResponseEntity<Integer> subtrair(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(this.calculadoraFacade.subtract(a, b));
    }

    @GetMapping("/multiplicar")
    public ResponseEntity<Integer> multiplicar(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(this.calculadoraFacade.multiply(a, b));
    }

    @GetMapping("/dividir")
    public ResponseEntity<Integer> dividir(@RequestParam int a, @RequestParam int b) {
        return ResponseEntity.ok(this.calculadoraFacade.divide(a, b));
    }

    @GetMapping("/somaMultiplica")
    public ResponseEntity<Integer> somaMultiplica(@RequestParam int a, @RequestParam int b,
                                                  @RequestParam int c) {
        return ResponseEntity.ok(this.calculadoraFacade.sumAndMultiply(a, b, c));
    }


}
