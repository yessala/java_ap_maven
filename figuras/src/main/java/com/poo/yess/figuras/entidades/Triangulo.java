package com.poo.yess.figuras.entidades;

/**
 * @author yessa
 *
 */
public class Triangulo {
	
	private int base;
	private int altura;
	private int lado;
	/**
	 * 
	 */
	public Triangulo() {
	}
	/**
	 * @param base
	 * @param altura
	 */
	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}
	/**
	 * @param base the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}
	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public void area() {
		double area= (base*altura)/2;
		System.out.println("El área del triángulo es: "+ area);
	}
	
	public void perimetro() {
		double perimetro = 3*lado;
		System.out.println("El perimetro del triángulo es: "+perimetro);
	}
	
	
	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	
	
}
