package UT4.Ejercicios_Arrays;
import java.util.Random;

public class Ejercicio5 {
	
	private static final int Total_de_elementos = 50;
	private static final int LIM = 100;
	
	public static void main(String[] args) {
		// CREAR ARRAY 		
		int[] numeros = new int[Total_de_elementos]; 
		
		Random r = new Random();
		// RELLENAR ARRAY
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(LIM) + 1;
		}
		// utilizar metodo para mostrar array
		mostrarArray(numeros, "Array numeros: ");
		//mostrarArray(indices, "Array de índices");
		
		System.out.println("Faltan los siguientes números: ");
		// SE RECORRE ARRAY , COMPARANDO CADA ELEMENTO -- 
		for (int i = 1; i <= LIM; i++) {
			boolean encontrado = false;
			for (int j = 0; j < numeros.length; j++) {
				if(numeros[j] == i) {
					encontrado = true;
					break;
				}
			}
			if(!encontrado) {
				System.out.print(i +" ");
			}
		}
	}
	
	public static void mostrarArray(int[] arr, String info) {
		System.out.println(info);
		for(int item: arr) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
}
