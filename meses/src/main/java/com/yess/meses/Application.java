package com.yess.meses;

import java.util.Scanner;

public class Application {
	
	static Scanner leer = new Scanner(System.in);
	
    public static void main(String[] args) {
    	int numeroMes = obtenerNumero();
    	System.out.println(obtenerMes(numeroMes));
    }
	public static int obtenerNumero() {
		System.out.println("Ingrese el numero de mes");
		return leer.nextInt();

	}
	
	public static String obtenerMes(int num) {
		
		return switch (num) {
		case 1 -> "Enero";
		case 2 -> "Febrero";
		case 3 -> "Marzo";
		case 4 -> "Abril";
		case 5 -> "Mayo";
		case 6 -> "Junio";
		case 7 -> "Julio";
		case 8 -> "Agosto";
		case 9 -> "Septiembre";
		case 10 -> "Octubre";
		case 11 -> "Noviembre";
		case 12 -> "Diciembre";
		default -> "No corresponde a un mes";
		};
	}
	
	public static String mensaje(int num) {
		return "El mes "+num+" es "+obtenerMes(num);
	}

}
