package com.poo.yess.personas;

public class Application {

    public static void main(String[] args) {
    	Persona p1 = new Persona();
    	Persona p2 = new Persona();
    	
    	p1.name= "Manuel";
    	p1.age = 30;
    	
    	p2.name = "Linda";
    	p2.age = 25;
    	
    	p1.imprimir();
    	p2.imprimir();
    	
    	imprimir(p1);
    	imprimir(p2);
    	
    }
    
    public static void imprimir(Persona person) {
    	System.out.println("Mi nombre es " + person.name + " y tengo " + person.age + " años.");
    }
}
