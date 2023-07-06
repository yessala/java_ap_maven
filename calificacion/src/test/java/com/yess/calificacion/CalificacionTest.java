package com.yess.calificacion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class CalificacionTest {

	private final InputStream originIn = System.in;

	private final PrintStream originOut = System.out;
	private final ByteArrayOutputStream formatOut = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(formatOut));
	}

	@AfterEach
	public void tearDown() {
		System.setOut(originOut);
		System.setIn(originIn);
	}

	@Test
	public void testMain() {

		ByteArrayInputStream in = new ByteArrayInputStream("95\n".getBytes());
		System.setIn(in);

		Calificacion.main(new String[1]);

		String out = formatOut.toString();
		String[] outs = out.split("\r\n");
		
		assertEquals("Ingrese una puntuación para calificarla (0-100)", outs[0]);
		assertEquals("La calificación es 'A'", outs[1]);

	}
}
