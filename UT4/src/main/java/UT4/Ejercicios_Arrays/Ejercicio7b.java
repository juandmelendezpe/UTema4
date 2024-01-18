package UT4.Ejercicios_Arrays;

public class Ejercicio7b {

	public static void main(String[] args) {
		
		int [][]mat = {
				{1,5,3},
				{2,5,8},
				{5,6,1}
				};
		Ejercicio7.mostrarMatriz(mat, "array original");
		
		int ArraySuma_fila[] = calcularSuma_Fila(mat,0);
		mostrarArray_Dimencional(ArraySuma_fila," Suma x filas ");
	}

	private static void mostrarArray_Dimencional(int []arraySuma_fila, String info) {
		System.out.println(info);
		for (int i=0; i < arraySuma_fila.length; i++) {
			System.out.println(arraySuma_fila[i]+ "");
	
		}
		System.out.println();
	
	}

	private static int[] calcularSuma_Fila(int[][] mat, int i) {
		// TODO Auto-generated method stub
		int [] ArraySuma = new int [mat.length];
		for(int k = 0; k < mat.length; k++) {
			for ( int l =0 ; l < mat.length; l++) {
				ArraySuma[k]+=mat[k][l] +i;
			}
		}
		return ArraySuma;
	}

}
