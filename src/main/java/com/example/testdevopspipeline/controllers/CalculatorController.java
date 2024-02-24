package com.example.testdevopspipeline.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class CalculatorController {

    @GetMapping("/calculator/addition")
    public double addition(@RequestParam double a, @RequestParam double b) {
        return a + b;
    }

    @GetMapping("/calculator/subtraction")
    public double subtraction(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    @GetMapping("/calculator/multiplication")
    public double multiplication(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    @GetMapping("/calculator/division")
    public double division(@RequestParam double a, @RequestParam double b) {
        return a / b;
    }
}
