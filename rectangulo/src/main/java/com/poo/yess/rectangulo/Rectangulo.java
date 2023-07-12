package com.poo.yess.rectangulo;

/**
 * @author yessa
 *
 */
public class Rectangulo {
	private int base;
	private int altura;
	static int numero=0;
	/**
	 * 
	 */
	public Rectangulo() {
		numero++;
	}
	/**
	 * @param base
	 * @param altura
	 */
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
		numero++;
	}
	
	public void area() {
		int area = this.base*this.altura;
		
		System.out.println("El area del rectangulo es: "+ area+".");
	}
	
	public void perimetro() {
		int perimetro = 2*this.base+2*this.altura;
		System.out.println("El perimetro del rectangulo es: "+perimetro+".");
	}
	public static void devolverNumero() {
		System.out.println("La cantidad de rectangulos creados es: "+numero);
	}
}
