package UT4.Ejercicios_Arrays;

import java.util.Objects;
public class persona_ejercicio3 {

		private String nombre;

		private String direccion;
		
		private int edad;

	public persona_ejercicio3(String nombre, String direccion,int edad) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getedad() {
		return edad;
	}
	public void setedad(int edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, nombre,edad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		persona_ejercicio3 other = (persona_ejercicio3) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(nombre, other.nombre)&& Objects.equals(edad, other.edad) ;
	}
	@Override
	public String toString() {
		return "persona_ejercicio3 [nombre=" + nombre + ", direccion=" + direccion + "edad= "+ edad +"]";
	}
	}