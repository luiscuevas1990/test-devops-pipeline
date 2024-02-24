package com.example.testdevopspipeline.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorControllerTest {

    private final CalculatorController calculatorController = new CalculatorController();

    @Test
    void testAddition() {
        double result = calculatorController.addition(1,2);
        assertEquals(result, 3);
    }

}
