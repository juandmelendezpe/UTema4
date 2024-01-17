package UT4.Ejercicios_Arrays;

public class Ejercicio6 {
private static final int TAM = 5;
	public static void main(String[] args) {
				
		int[][] mat = new int[TAM][TAM];
		
		
		mostrarArray(mat, "Original");
		for (int i = 0; i < mat.length; i++) {
			mat[i][i] = 1;
		}
		mostrarArray(mat, "Modificado");
	
		}

	public static void mostrarArray(int[][] mat, String info) {
		System.out.println(info);
		for (int i = 0; i < mat.length; i++) {
			for(int j =0 ; j< mat[0].length;j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
			
		}		
	}
}