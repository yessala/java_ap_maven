package com.poo.yess.figuras.servicio;

import java.util.Scanner;

import com.poo.yess.figuras.entidades.Rectangulo;

public class ServicioRectangulo {
	
	static Scanner leer = new Scanner(System.in);
	
	public Rectangulo crearRectangulo() {
		Rectangulo rect = new Rectangulo();
		
		System.out.println("Ingrese la base del rectángulo");
		rect.setBase(leer.nextInt());
		System.out.println("Ingrese la altura del rectángulo");
		rect.setAltura(leer.nextInt());
		
		rect.area();
		System.out.println();
		rect.perimetro();
		
		return rect;
		
	}
}
