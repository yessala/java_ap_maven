package com.poo.yess.vehiculo;

public class Application {

    public static void main(String[] args) {
    	
    	Auto a1 = new Auto();
    	Auto a2 = new Auto("Ford", "Escape", 2006);
    	Auto a3 = new Auto();
    	    	
    	a1.marca = "Toyota";
    	a1.modelo = "Fortuner";
    	a1.anio = 2015;
    	
    	a3.marca = "Mitsubishi";
    	a3.modelo = "Lanser Limit";
    	a3.anio = 2001;
    	
    	a1.imprimirDatos();
    	a2.imprimirDatos();
    	a3.imprimirDatos();
    }
}
