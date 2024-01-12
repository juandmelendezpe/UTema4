package UT4.Teoria1_Arrays;

import java.util.ArrayList;

public class matriz_3_arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//este ejemplo se crea un array de tipo objeto "Empleado"
		//se crea el array y se inicializa
		/*Empleado listaEmpleados[] = new Empleado[3];

		listaEmpleados[0] = new Empleado("ana", 25, 2000);
		listaEmpleados[1] = new Empleado("juan", 23, 3000);
		listaEmpleados[2] = new Empleado("star", 20, 4000);
*/
		// En este ejemplo se crea un array list <Empleado> listaEmpleado
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		// se implementa el array listaEmpleado y se crea los valores de 
		//la clase objeto empleado ("ana", 25, 2000);
		listaEmpleados.add(new Empleado("ana", 25, 2000));
		listaEmpleados.add(new Empleado("juan", 23, 30000));
		listaEmpleados.add(new Empleado("star", 20, 4000));
		// se imprime la cantidad de numeros de elementos del arrayList
		System.out.println("la cantidad de elementos del arrayList es :" + listaEmpleados.size());
		// se recorre con un for each el arrayList
		for (Empleado e : listaEmpleados) {
			// se imprime el arraylist con el metodo dameDatos();
			System.out.println(e.dameDatos());

		}

	}
}

class Empleado{
// declaracion de variables
	private String nombre;
	private int edad;
	private double sueldo;
	// creacion del constructor
	public Empleado(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	// creacion del metodo dame datos
	public String dameDatos() {
		return " el empleado se llama :" + nombre + "  tiene  " + edad + " años y sueldo es :" + sueldo;
	}


}
