package com.poo.yess.random;


public class Aleatorio {

    public static void main(String[] args) {
    	
    	System.out.println(obtenerNumero());
    	
    }
    
    public static int obtenerNumero() {
    	return (int) (Math.random() *100+1);
    }
}
