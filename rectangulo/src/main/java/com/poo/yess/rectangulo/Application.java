package com.poo.yess.rectangulo;

public class Application {

    public static void main(String[] args) {
    	
    	Rectangulo r1 = new Rectangulo(2,6);
    	Rectangulo r2 = new Rectangulo(6,4);
    	Rectangulo r3 = new Rectangulo(5,3);
    	Rectangulo r4 = new Rectangulo(4,9);
    	
    	r1.area();
    	
    	r2.perimetro();
    	
    	r3.area();
    	
    	r4.perimetro();
    	
    	Rectangulo.devolverNumero();
    }
}
