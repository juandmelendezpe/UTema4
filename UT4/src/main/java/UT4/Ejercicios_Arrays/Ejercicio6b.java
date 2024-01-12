package UT4.Ejercicios_Arrays;
import java.util.Arrays;

public class Ejercicio6b {

	private static final int TAM = 10;
	private static final int NUM_DIAGONAL = 7;
	private static final int NUM_RELLENO = 8;
	
	public static void main(String[] args) {
				
		int[][] mat = new int[TAM][TAM];
		
		for (int i = 0; i < mat.length; i++) {
			Arrays.fill(mat[i], NUM_RELLENO);
			mat[i][i] = NUM_DIAGONAL;
			System.out.println(Arrays.toString(mat[i]));
		}
		//mostrarArray(mat, "Relleno");
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