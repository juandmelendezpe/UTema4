package UT4.Practica_exT4;

import java.util.Arrays;

public class ArrayFila1 {	
	
	public static int[] fila1(int[][] matriz) {
		return matriz[0];
	}
	public static void MostrarFila1(int[] fila,String info ) {
		System.out.println(info);
		System.out.println(Arrays.toString(fila) );
			
		}
	public static void sumaFila1(int[] fila) {
		int suma =0;
		for(int i=0; i < fila.length; i++) {
			 suma += fila[i];
		}
		System.out.println("suma de los elementos : " + suma);
	}
	public static void ExtraerMenor(int[] Array) {
		for(int i=0; i < Array.length;i++) {
			if(Array[i] <= Array[1]) {
				System.out.println("elemento menor:" + Array[i]);
			}else {
				System.out.println("elemento menor:" + Array[1]);

			}
		}
	}
		
	}

