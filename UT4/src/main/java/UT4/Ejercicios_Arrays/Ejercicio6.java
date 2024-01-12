package UT4.Ejercicios_Arrays;

public class Ejercicio6 {
private static final int TAM = 5;

	
	public static void main(String[] args) {
				
		int[][] mat = new int[TAM][TAM];
		for (int i = 0; i < mat.length; i++) {
			for(int j =0 ; j< mat.length;j++)
			mat[i][i] = 9;
		}
		mostrarArray(mat, "Original");
		
		for (int i = 0; i < mat.length; i++) {
			mat[i][i] = 2;
		}
		mostrarArray(mat, "Relleno");
	}
	public static void mostrarArray(int[][] arr, String info) {
		System.out.println(info);
		for(int[] fila: arr) {
			for(int col: fila) {				
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}