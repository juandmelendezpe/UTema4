package UT4.Practica_exT4;

public class Init_mat_simple {
	
	public static void main(String[] args) {
		
		int [][] matriz1 = new int[4][4];
		Matris_simple_randon.rellenarMatriz(matriz1);
		Matris_simple_randon.MostrarArray(matriz1, " se utiliza matris externa !");
		int []fila1 = ArrayFila1.fila1(matriz1);
		
		ArrayFila1.MostrarFila1(fila1, "Estee es la fila 1 de la matriz");
		ArrayFila1.sumaFila1(fila1);
		ArrayFila1.ExtraerMenor(fila1);
	
	}

}
