package UT4.Ejercicios_Arrays;

import javax.swing.JOptionPane;

public class Ejercicio10 {
private static final int TAM = 5;
	
	public static void main(String[] args) {
				
		int[][] mat = new int[TAM][TAM];
	
		mostrarArray(mat, "Original");
		
		for (int i = 0; i < mat.length; i++) {
			
			for(int j = 0; j < mat.length ; j++)
			mat[j][i] = 4;
			
		}
		mostrarArray(mat, "Relleno");
	}
	
	public static void mostrarArray(int[][] arr, String info) {
		System.out.println(info);
		for(int[] fila: arr) {
			for(int col: fila) {
			/**	JOptionPane.showMessageDialog(null, info);**
			 */
				System.out.print(col + " ");
				
			}
			System.out.println();
		}
	}

}