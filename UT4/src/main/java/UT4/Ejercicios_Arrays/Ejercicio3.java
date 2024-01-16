package UT4.Ejercicios_Arrays;
import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		
		/*Persona[] agenda = {
				new Persona("Fran", "C/Salamanca nº1, 1ºA"),
				new Persona("Manu", "C/Ávila nº2, 2ºA"),
				new Persona("Fitipaldi", "C/Gracias a Dios nº3, 3ºA"),
				new Persona("Madera", "C/Pino nº4, 4ºA"),
				new Persona("Fran", "C/Jaén nº5, 5ºA")
		};*/
		
		persona_ejercicio3[] agenda = new persona_ejercicio3[5];
		agenda[0] = new persona_ejercicio3("Persona1", "C/Salamanca nº1, 1ºA",30);
		agenda[1] = new persona_ejercicio3("Persona2", "C/Ávila nº2, 2ºA",31);
		agenda[2] = new persona_ejercicio3("Persona3", "C/Gracias a Dios nº3, 3ºA",32);
		agenda[3] = new persona_ejercicio3("Persona4", "C/Pino nº4, 4ºA",33);
		agenda[4] = new persona_ejercicio3("Persona5", "C/Jaén nº5, 5ºA",34);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*******************************************************");

		 System.out.println("Introduzca el nombre de la persona a buscar: ");
		 
		String nombreBuscar = sc.nextLine();
		sc.close();
		
		for (int i = 0; i < agenda.length; i++) {
			if(agenda[i].getNombre().equalsIgnoreCase(nombreBuscar)) {
				
				System.out.println("Su Nombre es: " + agenda[i].getNombre());
				System.out.println("Su edad es: " + agenda[i].getedad());


			}
		}
		
}
}
		