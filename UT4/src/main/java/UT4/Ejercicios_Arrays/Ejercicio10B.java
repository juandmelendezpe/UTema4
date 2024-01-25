package UT4.Ejercicios_Arrays;

public class Ejercicio10B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ejercicio del cuadrado de numeros
		 * 	0 1 2 3 4 
			1 2 3 4 3 
			2 3 4 3 2 
			3 4 3 2 1 
			4 3 2 1 0
		 */
		
		int [][] cuadrado =new int [5][5];
		int contador = 0;
		int contadorDesc =0;
		
		for(int i =0; i < cuadrado.length; i++) {
			for(int j =0; j < cuadrado.length; j++) {
				if(contador > cuadrado.length -1) {
					contadorDesc --;
					cuadrado[i][j]= contadorDesc;
				} else {
					cuadrado[i][j]= contador;
					contador ++;
					contadorDesc = contador -1;
				}
				System.out.print(cuadrado[i][j] + " ");
				}
			contador = i +1 ;
			System.out.println();
			}
		}
		
	}


