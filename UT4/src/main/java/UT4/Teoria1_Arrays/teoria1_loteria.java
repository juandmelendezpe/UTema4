package UT4.Teoria1_Arrays;

import java.util.Random;

public class teoria1_loteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []loteria = new int [5];
		Random r = new Random();
		
		for(int i =0 ;i < loteria.length;i++) {
		loteria[i]=r.nextInt(10);
		
		System.out.println("POSICION  = "+i+ " : "+ loteria[i]);
		System.out.println();
				
		}
		int suma = 0;
		for(int i =0; i< loteria.length;i++) {
			suma+=loteria[i];
		}

		System.out.println("suma de los numeros de la loteria es : "+ suma);
	}

}
