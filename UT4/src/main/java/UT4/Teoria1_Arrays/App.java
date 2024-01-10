package UT4.Teoria1_Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

	private final static String[] NOMBRES = { "Fran", "Alejandra", "Alberto", "Candela" };

	public static void main(String[] args) {

		Alumno[] datos = new Alumno[5];
		int contador = 0;

		// se llama a la clase ramdom

		Random rand = new Random();
		
		// se llama a los metodos

		rellenarArray(datos);
		RecogerNombres(datos);
		MostrarListaNombres();
		
		/**
		 * se inicia la clase scaner y se crea un objeto tipo scanner.
		 * es para recoger los datos por consola
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("\nIntroduce el nombre : ");
		String nombreBuscar = sc.next();
		System.out.println("Introduce la edad");
		int edadBuscar = Integer.valueOf(sc.next());
		sc.close();
/**
 * SE INICIALIZA LA CLASE ALUMNO 
 */
		Alumno alumnoBuscar = new Alumno(nombreBuscar, edadBuscar);
				
		/**
		 * SE RECORREEL ARRAY BUSCANDO LOS NOMBRES Y LAS EDADES
		 */

		for (int i = 0; i < datos.length; i++) {
			//if (datos[i].equals(alumnoBuscar)) {

			if (datos[i].getNombre().equals(alumnoBuscar.getNombre()) 
			&& datos[i].getEdad() == alumnoBuscar.getEdad()) {
				contador++;

			}

		}
		System.out.printf("Aparece %d veces ", contador);
	
	}

	/**
	 * crear metodo para rellenar el array alumno con datos
	 */
	private static void rellenarArray(Alumno[] datos) {

		Random rand = new Random();

		for (int i = 0; i < datos.length; i++) {
			datos[i] = new Alumno(NOMBRES[rand.nextInt(NOMBRES.length)], rand.nextInt(6) + 10);
			System.out.println(datos[i] + "");
		}

	}
	/**
	 * METODO PARA RECOGER  3 NOMBRES DE FORMA ALEATORIA DEL ARRAY "NOMBRES"
	 * @param datos
	 */
	private static void RecogerNombres(Alumno[]datos) {
		Random  r = new Random();
		for(int i =0; i < 3; i++) {
			datos[i]= new Alumno(NOMBRES[r.nextInt(NOMBRES.length)]);
			System.out.println("---------------");
			
			System.out.println(datos[i]+"");
		}
	}
	/**
	 * SE CREA METODO PARA MOSTRAR LA LISTA DE NOMBRES DEL ARRAY [] NOMBRES 
	 * - SE RECORRE CON FOR EACH 
	 */
	private static void MostrarListaNombres( ) {
		for(String nombresList:NOMBRES) {
			System.out.println(nombresList);
		}
		
	}
	

}
