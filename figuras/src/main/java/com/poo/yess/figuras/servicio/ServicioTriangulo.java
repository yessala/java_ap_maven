package com.poo.yess.figuras.servicio;

import java.util.Scanner;

import com.poo.yess.figuras.entidades.Triangulo;

public class ServicioTriangulo {
	static Scanner leer = new Scanner(System.in);
	
	public Triangulo crearTriangulo() {
		Triangulo tri = new Triangulo();
		
		System.out.println("Ingrese la base del triángulo");
		tri.setBase(leer.nextInt());
		System.out.println("Ingrese la altura del triángulo");
		tri.setAltura(leer.nextInt());
		System.out.println("Ingrese un lado del triángulo");
		tri.setAltura(leer.nextInt());
		
		
		tri.area();
		System.out.println();
		tri.perimetro();
		
		return tri;
		
	}
}
