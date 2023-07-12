package com.poo.yess.figuras.entidades;

/**
 * @author yessa
 *
 */
public class Rectangulo {

		private int base;
		private int altura;
//		static int numero=0;
		/**
		 * 
		 */
		public Rectangulo() {
//			numero++;
		}
		/**
		 * @param base
		 * @param altura
		 */
		public Rectangulo(int base, int altura) {
			this.base = base;
			this.altura = altura;
//			numero++;
		}
		
		
		
		public int getBase() {
			return base;
		}
		public void setBase(int base) {
			this.base = base;
		}
		public int getAltura() {
			return altura;
		}
		public void setAltura(int altura) {
			this.altura = altura;
		}
		public void area() {
			int area = this.base*this.altura;
			
			System.out.println("El area del rectangulo es: "+ area+".");
		}
		
		public void perimetro() {
			int perimetro = 2*this.base+2*this.altura;
			System.out.println("El perimetro del rectangulo es: "+perimetro+".");
		}
//		public static void devolverNumero() {
//			System.out.println("La cantidad de rectangulos creados es: "+numero);
//		}
		@Override
		public String toString() {
			return "Rectangulo [base=" + base + ", altura=" + altura + "]";
		}

}
