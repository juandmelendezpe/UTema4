package UT4.Teoria1_Arrays;

public class teoria1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* se crea un array de 5 elementos
		 * se recorre con for y el .legth sirve para almacenar el tamaño del  array  {4,9,7,5,10}
		 * con el println se muestra el recorrido
		 * */
		
		int []notas = {4,9,7,5,10};
		for(int i =0;i< notas.length ;i++)
			
			System.out.println("notas["+i + "] es " + notas[i]);
		 	
			System.out.println();
	
	
		String [] Ciudad = {"Avila", "Salamanca","Valladolid"};
		for (int x= 0; x < Ciudad.length; x++)
			System.out.println("Ciudad:"+ x +" " +Ciudad[x]);
	

	
}
}

