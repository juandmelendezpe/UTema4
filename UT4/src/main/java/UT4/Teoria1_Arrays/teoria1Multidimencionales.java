package UT4.Teoria1_Arrays;

public class teoria1Multidimencionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Un array de dos dimensiones tiene forma de tabla. Para indicar la posición de
uno de sus elementos es necesario indicar dos índices, uno para la fila y otro para la
columna. La fila indica la posición en el primer array y la columna la posición en el
segundo array.
Para mostrar los elementos del array notas es necesario utilizar dos bucles for
anidados. 
		 */
		
		int[][]notas = new int [2][3];
		notas[0][0]= 5;
		notas[0][1]= 6;
		notas[0][2]= 7;
		
		notas[1][0]= 8;
		notas[1][1]= 9;
		notas[1][2]= 10;

		
		for(int i=0;i < notas.length;i++)
			for(int j = 0; j <notas[i].length;j++)
				System.out.println("notas["+i+"]["+j+"]"+"es : "+notas[i][j]);
	}

}
  