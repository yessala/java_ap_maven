package com.poo.yess.figuras.entidades;

/**
 * @author yessa
 */
public class Paralelogramo {
	private int base;
	private int altura;
	private int ladoA;
	private int ladoB;
	/**
	 * 
	 */

	public Paralelogramo() {
	}
	/**
	 * @param base
	 * @param altura
	 * @param ladoA
	 * @param ladoB
	 */
	public Paralelogramo(int base, int altura, int ladoA, int ladoB) {
		this.base = base;
		this.altura = altura;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
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
	/**
	 * @return the ladoA
	 */
	public int getLadoA() {
		return ladoA;
	}
	/**
	 * @param ladoA the ladoA to set
	 */
	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}
	/**
	 * @return the ladoB
	 */
	public int getLadoB() {
		return ladoB;
	}
	/**
	 * @param ladoB the ladoB to set
	 */
	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}
	
	
}
