package UT4.Ejercicios_Arrays;
import java.util.Random;

public class Ejercicio7 {
	
	private static final int TAM = 3;
	private static final int LIM = 10;
	private static final int VERTICAL = 0;
	private static final int HORIZONTAL = 1;
	
	public static void main(String[] args) {
				
		int[][] mat = new int[TAM][TAM];
		
		rellenaMatriz(mat);
		
		mostrarMatriz(mat, "Matriz original");
		
		
		int[] sumaFilas = calculaSumaFilas(mat);
		mostrarArray(sumaFilas, "Array filas", VERTICAL);
		
		int[] sumaColumnas = calculaSumaColumnas(mat);
		mostrarArray(sumaColumnas, "Array columnas", HORIZONTAL);
		
	}
	
	private static int[] calculaSumaColumnas(int[][] mat) {
		int[] suma = new int[mat[0].length];
		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat.length; j++) {
				suma[i] += mat[j][i];
			}
		}
		return suma;
	}

	private static int[] calculaSumaFilas(int[][] mat) {
		int[] suma = new int [mat.length];
		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				suma[i] += mat[i][j];
			}
		}
		return suma;
	}
	

	private static void rellenaMatriz(int[][] mat) {
		Random r = new Random();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = r.nextInt(LIM);
			}
		}
	}

	public static void mostrarMatriz(int[][] arr, String info) {
		System.out.println(info);
		for(int[] fila: arr) {
			for(int col: fila) {				
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	public static void mostrarArray(int[] arr, String info, int dir) {
		System.out.println(info);
		for(int item: arr) {
			if(dir == VERTICAL) {				
				System.out.println(item);
			} else {
				System.out.print(item + " ");
			}
		}
	}

}