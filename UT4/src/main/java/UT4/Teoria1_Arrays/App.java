package UT4.Teoria1_Arrays;

import java.util.Objects;
import java.util.Random;


public class App {

	public static void main(String[] args) {
		String[] nombres = { "Fran", "Alejandra", "Alberto", "Candela" };
		App[] alumnos = new App[20];
		
		// se llama a la clase ramdom 
		
		Random rand = new Random();
		private Alumno alu = new Alumno(null, 0);

		for (int i = 0; i < 20; i++) {
			String nombre = nombres[rand.nextInt(nombres.length)];
			
			int edad = rand.nextInt(6) + 10; // Edad entre 10 y 15
			alumnos[i] = new Alumno(nombres, edad);
		}

		// Imprimir el array de alumnos
		
		for (App alumno : alumnos) {
			System.out.println("Nombre: " + alumno.getNombre() + ", Edad: " + alumno.getEdad());
		}
	}

}
