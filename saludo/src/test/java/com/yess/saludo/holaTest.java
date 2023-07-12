package com.yess.saludo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class holaTest {

	private final PrintStream startOut = System.out;
	private final ByteArrayOutputStream outTest = new ByteArrayOutputStream();
	
	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outTest));
	}
	
	@AfterEach
	public void tearDown() {
		System.setOut(startOut);
	}
		
	@Test
    public void testMain() {
		
		hola.main(new String[1]);
		
		String salida = outTest.toString();
		
		assertEquals("Hola Mundo!\r\n", salida);
    }
}
