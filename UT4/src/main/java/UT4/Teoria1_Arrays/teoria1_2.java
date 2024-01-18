package UT4.Teoria1_Arrays;

import java.util.Random;

public class teoria1_2 {

	public static void main(String[] args) {
	Random r = new Random();
	/**int numeros_aleatorios = r.nextInt(8)+1;
	for(int i=0 ;i <  numeros_aleatorios;i++) {
		System.out.println("numeros"+numeros_aleatorios);
	}
	*/
		int []mun_aleatorios =new int [5];
		
		for(int i=0 ;i < mun_aleatorios.length;i++) {
			mun_aleatorios[i]=r.nextInt(100 );
			System.out.println("item: "+ i + "  precio " + mun_aleatorios[i]);
				
				}
	}
}