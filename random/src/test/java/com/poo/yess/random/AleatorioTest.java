package com.poo.yess.random;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AleatorioTest {

    @Test
    void testMain() {
    	
    	int salida = Aleatorio.obtenerNumero();
        assertEquals(salida>=0  && salida<=100, true);
    }
}
