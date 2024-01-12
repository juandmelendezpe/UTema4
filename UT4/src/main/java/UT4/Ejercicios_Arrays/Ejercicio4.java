package UT4.Ejercicios_Arrays;

public class Ejercicio4 {


public static void main(String[] args) {
	
	int[] numero = {34, 54, 12, 85, 45};
	int[] indices = new int[numero.length]; 
	
	int[] aux = new int[numero.length];
	
	for (int i = 0; i < numero.length; i++) {
		aux[i] = numero[i];
	}
	
	// Relleno el array de índices
	for (int i = 0; i < indices.length; i++) {
		int posMayor = 0;
		
		// Busco el mayor por cada índice (cada iteración del bucle superior)
		for (int j = 1; j < numero.length; j++) {
			if(aux[j] > aux[posMayor]) {
				posMayor = j;
			}
		}
		
		indices[i] = posMayor;
		aux[posMayor] = Integer.MIN_VALUE;
	}
	
	mostrarArray(numero, "Array original");
	mostrarArray(indices, "Array de índices");
}

public static void mostrarArray(int[] arr, String info) {
	System.out.println(info);
	for(int item: arr) {
		System.out.print(item + " ");
	}
	System.out.println();
}

}
