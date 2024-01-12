package UT4.Teoria1_Arrays;

public class matriz_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = { { 1, 2, 3, 4 },
				{ 4, 6, 7, 8 },
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 }
				};
		/*// en esta forma se declara la matriz de forma clasica
		for (int i = 0; i < 4; i++) {
			System.out.println();
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + " ");
			*/
		// en esta parte se realiza con for each - 
		// donde indice es el array indice y 
		//elementos  es el array de cantidad de elementos
		for(int[] indice:matriz) {
			System.out.println();
			for( int elementos : indice){
				System.out.print(elementos +" ");
		}
	
		}
	}

}
