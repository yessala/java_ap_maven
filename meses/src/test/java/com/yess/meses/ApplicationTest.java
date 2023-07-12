package com.yess.meses;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

class ApplicationTest {

	private final InputStream startIn = System.in;

	@AfterEach
	public void tearDown() {
		System.setIn(startIn);
	}

	@ParameterizedTest
//    	@CsvSource({"1, Enero","2, Febrero","3, Marzo","4, Abril", "5, Mayo"}) //si son pocos datos
	@CsvFileSource(resources = "/com/yess/csv/meses-numeros.csv", numLinesToSkip = 1)
	public void testObtenerMes(int input, String esperado) {
//        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        Application.leer = new Scanner(System.in);

		String obtenido = Application.obtenerMes(input);

		assertEquals(esperado, obtenido);
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/com/yess/csv/meses-mensaje.csv", numLinesToSkip = 1)
	public void testMensaje(int input, String esperado) {

		String obtenido = Application.mensaje(input);

		assertEquals(esperado, obtenido);
	}

}
