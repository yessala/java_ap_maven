package com.poo.yess.vehiculo;

/**
 * @author yessa
 *
 */
public class Auto {

	String marca;
	String modelo;
	int anio;
	/**
	 * 
	 */
	public Auto() {
	}
	/**
	 * @param marca
	 * @param modelo
	 * @param anio
	 */
	public Auto(String marca, String modelo, int anio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	public void imprimirDatos() {
		System.out.println("Marca: "+marca+", Modelo: "+modelo+", Año: "+anio+".");
	}
	
}
