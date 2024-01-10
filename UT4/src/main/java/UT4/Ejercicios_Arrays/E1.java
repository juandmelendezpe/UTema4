package UT4.Ejercicios_Arrays;

import java.util.Random;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = {1,2,5,8,5,2,7,6,2,5,8,5};
		
		
		
		Random r = new Random();
		
		
		for(int i = 0; i < numeros.length;i++) 
			System.out.println("posicion : " + i +"--- valor : " + numeros[i]);
		}
		
	}


