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
		
		int Arraysuma_col[] = calculaSumaCol(mat);
		mostrarArray_Dimencional(Arraysuma_col, "suma x columnas");
		
		
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
		int [] ArraySuma = new int [mat[0].length];
		
		for(int y = 0; y < mat[0].length; y++) {
			for ( int x =0 ; x < mat[0].length; x++) {
				ArraySuma[y]+= mat[y][x] +i;
			}
		}
		return ArraySuma;
	}
	private static int [] calculaSumaCol( int [][] mat) {
		
		int[] suma = new int[mat[0].length];
		
		for (int y=0 ;y< mat[0].length;y++) {
			for(int x =0; x < mat.length;x++) {
				suma[y] += mat[x][y];;
			}
		}
		return suma;
	}

}
