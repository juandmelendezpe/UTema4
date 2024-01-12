package UT4.Ejercicios_Arrays;
import java.util.Random;

public class Ejercicio5 {
	
	private static final int TAM = 50;
	private static final int LIM = 100;
	
	public static void main(String[] args) {
				
		int[] numeros = new int[TAM]; 
		
		Random r = new Random();
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = r.nextInt(LIM) + 1;
		}
		
		mostrarArray(numeros, "Array numeros: ");
		//mostrarArray(indices, "Array de índices");
		
		System.out.println("Faltan los siguientes números: ");
		
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
/*	//juan estaba intentando dearrollar el ejercicio
	Scanner sc = new Scanner(System.in);
	int[] datos = new int[50];
	Random r = new Random();
	for (int i = 0;  i < datos.length ; i++) {
		datos[i] = r.nextInt(100);
	}
	
	System.out.println("Contenido del array: ");		
	for(int elem: datos) {
		System.out.print(elem + " ");
	}
	int contador =0;
	
	int[] num = new int[datos.length];
	int[]aux = new int [datos.length];
	
	for (int j = 0; j < datos.length; j++) {
		aux[j] = datos[j];
	
}
}
}**/