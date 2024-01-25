package UT4.Ejercicios_Arrays;

public class Ejercicio9B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrayA = {4,8,15,22,25,40};
		int [] arrayB = {3,6,18,21,25,47};
		
		int[ ]arrayC = new int [arrayA.length + arrayB.length];
		
		/**
		 * FUNCION PARA RECORRER Y RELLENAR EL ARRAY A
		 */
		
		System.out.println("Array A");
		for(int i =0; i< arrayA.length;i++) {
			arrayC[i]=arrayA[i];
			System.out.print(arrayA[i]+" ");
			
		}
		System.out.println();
		/**
		 * FUNCION PARA RECORRER Y RELLENAR EL ARRAYS B
		 */
		
		System.out.println("Array B :");
		for( int i =0;i < arrayB.length; i++ ) {
			arrayC[arrayA.length + i]= arrayB[i];
			System.out.print(arrayB[i]+" ");
		}
		System.out.println();
		/**
		 * FUNCION PARA ORDENAR EL ARRAYS c , Y MOSTRAR 
		 */
		int []ARRAY_AUX = new int[arrayC.length];
		System.out.println("Array C");
		
		for(int i = arrayC.length - 1; i >=0;i--) {
			int comparador = 0;
			
			for(int j =0 ;j < ARRAY_AUX.length;j++) {
				if(arrayC[j] > arrayC[comparador]) {
					comparador = j;
				}
			}
			ARRAY_AUX[i]= arrayC[comparador];
			
			arrayC[comparador]= 0;
			System.out.print(ARRAY_AUX[i]+" - ");

		}
		
		/**
		 * OTRA FORMA DE ORDENAR EL ARRAY C
		 */
		System.out.println();
		
		int indexA =0 , indexB=0;
		for(int indexC =0; indexC < arrayC.length;indexC++) {
			if(indexA == arrayA.length) {
				arrayC[indexC]= arrayB[indexB];
				indexB++;
			}else if(indexB == arrayB.length) {
				arrayC[indexC]= arrayA[indexA];
				indexA++;
			}else if(arrayA[indexA] < arrayB[indexB]) {
				arrayC[indexC]= arrayA[indexA];
				indexA++;
			}else {
				arrayC[indexC] = arrayB[indexB];
				indexB++;
			}
		}
		for(int i =0;i < arrayC.length;i++) {
			System.out.print(arrayC[i]+ " ");
			
		}
	}

}
