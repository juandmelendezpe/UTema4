package UT4.Ejercicios_Arrays;
public class Ejercicio2 {
	public static void main(String[] args) {
		
//		int[] datos = {2, 3, 4, 5, 6}; // Prueba ordenado
//		int[] datos = {8, 3, 4, 5, 6}; // Prueba no ordenado
//		int[] datos = {3, 3, 4, 5, 6}; // Prueba ordenado con iguales
		
		int[] datos = {3, 3, 8, 5, 6}; // Prueba NO ordenado entre medias
		
		boolean ordenado = true;
		
		// en este bucle se verifica si los elementos de array estan ordenados 
		for (int i = 1; i < datos.length; i++) {
			if(datos[i] < datos[i-1]) {
				ordenado = false;
				break;
			}
		}
		
		System.out.println(ordenado ? "Está ordenado." : "NO está ordenado.");
		
	}

}
