package com.ecpe205;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class CalculatorTest {

    Calculator calc;

    @BeforeAll
    void setup(){
        calc = new Calculator();
    }

    @ParameterizedTest
    @ValueSource (ints = {27,16,81,512,10})
    void shouldSolveXPowerY(int value) {
        assertEquals(27, calc.APowerB(3, 3));
        assertEquals(16, calc.APowerB(4, 2));
        assertEquals(81, calc.APowerB(9,2));
        assertEquals(512, calc.APowerB(2, 9));
        assertEquals(10, calc.APowerB(10,1));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,6,24,120})
    void shouldSolveFactorial(int value){
        assertEquals(1, calc.factorial(1));
        assertEquals(2, calc.factorial(2));
        assertEquals(6, calc.factorial(3));
        assertEquals(24, calc.factorial(4));
        assertEquals(120, calc.factorial(5));
    }

    @ParameterizedTest
    @ValueSource (strings = {"nun","bib","madam","noon", "civic" })
    void shouldCheckPalindrome(String value){
        assertEquals(value, calc.palindrome(value));
    }

}