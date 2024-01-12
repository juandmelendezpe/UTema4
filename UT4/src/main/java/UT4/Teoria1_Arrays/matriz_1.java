package UT4.Teoria1_Arrays;

public class matriz_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matriz = new int[3][4];
		
		matriz[0][0]=10;
		matriz[0][1]=20;
		matriz[0][2]=30;
		matriz[0][3]=40;

		
		matriz[1][0]=40;
		matriz[1][1]=50;
		matriz[1][2]=60;
		matriz[1][3]=300;

		
		matriz[2][0]=70;
		matriz[2][1]=80;
		matriz[2][2]=90;
		matriz[2][3]=400;

		// esto es para sacar un valor especifico de una posicion de la matriz
		//System.out.println("valor almacenado en la posicion 2 ,3 : " +matriz[2][3]);

		//se comienza a recorrer la matriz con el bucle for la cual empieza en el 
		// indice 0 y llega hasta < 2 " ya que la matriz tiene 2 dimenciones
		for(int i =0 ; i < 3;i++) {
			// se ingresa un system , ya que tiene que cortar la impresion
			System.out.println();
			//aca comienza a recorrer el segundo array en su indice 0 y llega hasta
			// < 3 ya que el array interno tiene 4 elementos
			for ( int j= 0 ; j < 4;j++) {
				// al final se imprime la matriz con su indice variable
				System.out.print(matriz[i][j]+" ");
			}
		
		}
	}

}
