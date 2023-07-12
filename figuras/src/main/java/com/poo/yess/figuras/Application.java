package com.poo.yess.figuras;

import java.util.Scanner;

import com.poo.yess.figuras.entidades.Circulo;
import com.poo.yess.figuras.entidades.Rectangulo;
import com.poo.yess.figuras.entidades.Triangulo;
import com.poo.yess.figuras.servicio.ServicioCirculo;
import com.poo.yess.figuras.servicio.ServicioRectangulo;
import com.poo.yess.figuras.servicio.ServicioTriangulo;

public class Application {

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {

		Scanner leer = new Scanner(System.in);
		System.out.println("Seleccione una opcion: ");
		System.out.println("1. Rectángulo.");
		System.out.println("2. Triángulo.");
		System.out.println("3. Círculo.");
		System.out.print("opción: ");
		int option = leer.nextInt();

		switch (option) {
		case 1:
			ServicioRectangulo sr = new ServicioRectangulo();
			Rectangulo rect = sr.crearRectangulo();
			break;
		case 2:
			ServicioTriangulo st = new ServicioTriangulo();
			Triangulo tri = st.crearTriangulo();
			break;
		case 3:
			ServicioCirculo sc = new ServicioCirculo();
			Circulo cir = sc.crearCirculo();
			break;
		default:
			break;
		}

	}

}
