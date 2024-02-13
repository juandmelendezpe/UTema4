package UT4.Examen;

import java.util.Random;


public class Init_examen {

	private static final int COLUMNAS = 3;
	
	public static void main(String[] args) {
		int [][] matriz = ejercicio1();
		//ejercicio2(matriz);
		
		ejercicio3(matriz, ejercicio2(matriz));
		
	}
	
	public static int [][] ejercicio1(){
		System.out.println("Ejercicio 1");
		Random r = new Random();
		
		int dimFilas = r.nextInt(6)+6;
		
		System.out.println("Numero de filas : " + dimFilas);
		
		int[][]mat = new int[dimFilas][COLUMNAS];
		
		for(int i=0; i< mat.length; i++) {
			for(int j =0; j < mat[0].length; j++) {
				mat[i][j]=r.nextInt(9)+1;
				
			}
		}
	
	/**
	 * realizar un for para mostrar la matriz creada.
	 */
	
	
		for(int i=0; i< mat.length;i++) {
			for(int j =0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
				System.out.println();
			}
		return mat;
		}
	public static int []ejercicio2(int [][]mat){
		System.out.println("Ejercicio 2 ");
		int [] ArraySumas = new int[mat.length];
		for(int i =0; i < mat.length;i ++) {
			for(int j =0 ;j < mat[0].length; j++) {
				ArraySumas[i]+=mat[i][j];
			}
		}
		// mostrar arrary recogido
		for(int i =0 ; i < mat.length; i++) {
				System.out.println(ArraySumas[i]+ " ");
			}
			return ArraySumas;
		}
	public static int[]ejercicio3 ( int [][]mat , int [] arrSuma){
		System.out.println(" Ejercicio 3 ");
		int indiceMayor =0;
		for( int i=1; i < arrSuma.length;i++) {
			if(arrSuma[i] > arrSuma[indiceMayor]) {
				indiceMayor = i ;
			}
		}
		System.out.println("El indice mayor es : " + indiceMayor);
		
		int [] arrayMayor = mat[indiceMayor];
		System.out.println("MUESTRA EL ARRAY MAYOR");
		for(int i =0 ; i< arrayMayor.length;i++) {
			System.out.print(arrayMayor[i]+ " ");
				
				
			}
		return arrayMayor;
	
		}
	
		

}
