/**
 * 
 */
package com.poo.yess.figuras.entidades;

/**
 * @author yessa
 *
 */
public class Circulo {
	private double radio;

	/**
	 * 
	 */
	public Circulo() {
	}

	/**
	 * @param radio
	 */
	public Circulo(double radio) {
		this.radio = radio;
	}

	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public void area() {
		double area= Math.PI*Math.pow(radio,2);
		System.out.println("El area del circulo es: "+String.format("%.2f", area) );
	}
	
	public void perimetro() {
		double perimetro = 2*Math.PI*radio;
		System.out.println("El perimetro del circulo es: "+ String.format("%.2f", perimetro));
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	
}
