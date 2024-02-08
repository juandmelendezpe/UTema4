package UT4.Practica_exT4;

import java.util.Random;

public class Matris_simple_randon {
	// creacion de una variable final para el limite
	private static final int Limite = 10;

	public static void main(String[] args) {
		
		int[][] matriz= new int[3][3];
		// ejecucion del metodo rellenar matriz
		rellenarMatriz(matriz);
		// ejecucion del metodo para mostrar matriz
		MostrarArray(matriz, " aqui se muestra la matriz creada");

	}
	public static void rellenarMatriz(int [][] matriz) {
		Random r = new Random();
		for(int i =0 ;i < matriz.length; i++) {
			for( int j = 0; j < matriz.length; j++) {
				matriz[i][j]=r.nextInt(Limite);
				
			}
		}
	}
	public static void MostrarArray(int [][] matriz , String info) {
		System.out.println(info);
		for(int i=0; i < matriz.length; i++) {
			for(int j =0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
	}
	

}
