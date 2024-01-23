package UT4.Ejercicios_Arrays;
import java.util.Random;
import java.util.Arrays ;

public class Ejercicio9 {

	private static final int TAM = 3;
	private static final int LIM = 5;

	public static void main(String[] args) {

		int[] array_A= new int[TAM];
		int[] array_B= new int[TAM];
		boolean ordenado = true;
		rellenaMatriz(array_A);
		mostrarMatriz(array_A, "Array A : ");
		rellenaMatriz(array_B);
		mostrarMatrizB(array_B, "Array B : ");
		
		
	//concatenar arrays	
	int lenArray1 = array_A.length;
	int lenArray2 = array_B.length;
	int[] concate = new int[lenArray1 + lenArray2];
		
	System.arraycopy(array_A, 0, concate, 0, lenArray1);  
	System.arraycopy(array_B, 0, concate, lenArray1, lenArray2);  
	System.out.print("Array C: " + Arrays.toString(concate)); 
	
	
	//verificar si esta ordenado
	for (int i = 1; i < concate.length; i++) {
		if(concate[i] < concate[i-1]) {
			ordenado = false;	
		}
	}
	System.out.println(ordenado ? "Está ordenado." : "NO está ordenado.");
	}

	
	
private static void rellenaMatriz(int[] array_A) {
	Random r = new Random();
	for (int i = 0; i < array_A.length; i++) {
			array_A[i] = r.nextInt(LIM);
		}

	}
public static void mostrarMatriz(int[] arr, String info) {
	System.out.println(info);
	for (int fila : arr) {
			System.out.println( fila +",");
	}
	System.out.println();
	}

public static void mostrarMatrizB(int[] arr, String info) {
	System.out.println(info);
	for (int fila : arr) {
		System.out.print( fila +",");
	}
	System.out.println();
}



}