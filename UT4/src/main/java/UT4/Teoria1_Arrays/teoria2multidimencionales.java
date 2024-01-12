package UT4.Teoria1_Arrays;

public class teoria2multidimencionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]notas = new int [3][3];
		notas[0][0]= 5;
		notas[0][1]=6;
		notas[0][2]= 7;
		
		notas[1][0]= 8;
		notas[1][1]= 9;
		notas[1][2]= 10;
		
		notas[2][0]= 1;
		notas[2][1]= 2;
		notas[2][2]= 3;



		{
		for(int[] fila : notas)
			for(int nota : fila)
			System.out.println("la nota es " +nota);
	}
}

}

