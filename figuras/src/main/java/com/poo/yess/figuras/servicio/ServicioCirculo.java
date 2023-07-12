package com.poo.yess.figuras.servicio;

import java.util.Scanner;

import com.poo.yess.figuras.entidades.Circulo;

public class ServicioCirculo {
	static Scanner leer = new Scanner(System.in);
	
	public Circulo crearCirculo() {
		Circulo clo = new Circulo();
		
		System.out.println("Ingrese la base del rectángulo");
		clo.setRadio(leer.nextInt());
		
		clo.area();
		System.out.println();
		clo.perimetro();
		
		return clo;
		
	}
	
}
