package UT4.Teoria1_Arrays;

public class teoria2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//otra forma de recorrer los arrays es bucle for-each
		//esta forma al momento de realizr el FOR se declara
		//su tipo variable INT O STRING
		// (int nota : notas )= el arrays se declara dentro del bucle con ":"
		//y en el println se pone el nombre del arrays 
	
		
		int []notas = {4,9,7,5,10};
		for(int nota : notas)
			System.out.println(nota);
		
		System.out.println();
		
		String []diasLaborales = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
		
		for(String dia : diasLaborales )
			
		System.out.println(dia);
	}

}
