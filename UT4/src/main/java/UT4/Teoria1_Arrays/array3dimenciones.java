package UT4.Teoria1_Arrays;

public class array3dimenciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] numeros = new int [3][3][3];
		int num = 1 ;
		for(int i=0 ;i < numeros.length; i++) {
			for(int j =0; j< numeros[i].length;j++) {
				for(int k =0; k< numeros[j].length;k++) {
				numeros[i][j][k]= num++;
				}
			}
		}
		for(int i=0 ;i < numeros.length; i++) {
			for(int j =0; j< numeros[i].length;j++) {
				for(int k =0; k< numeros[j].length;k++) {
					
				System.out.print(numeros[i][j][k] + "");
				System.out.print(" ");
			}
				System.out.println(" ");
			}
				System.out.println(" "); 


}
}
}