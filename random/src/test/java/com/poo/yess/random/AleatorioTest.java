package com.poo.yess.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;

class AleatorioTest {

    @RepeatedTest(10)
    void testMain() {
    	
    	int salida = Aleatorio.obtenerNumero();
        assertTrue(salida>=0  && salida<=100);
    }
}
