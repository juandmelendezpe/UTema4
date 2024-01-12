package UT4.Teoria1_Arrays;

public class inicializaMatrices {
	
	public static void main(String[] args) {
		Matrices();
	}

	public static void Matrices() {
		// TODO Auto-generated method stub
		int[][] mat = new int [][] {
			
			{1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5},
			{1, 2, 3, 4, 5}

		};
		
		for(int i=0 ;i < mat.length; i++) {
			for(int j =0; j< mat[i].length;j++) {
				
				System.out.print(mat[i][j]);
			}
			System.out.println();
			}
		}
	
	
}

