package UT4.Teoria1_Arrays;

import javax.swing.JOptionPane;

public class teoria1_1 {
	public static void main(String[] args) {
		// tienes que crear el array  - 
		String [] paises = new String[8];
		// recorres el array -  en esta ejemplo pides que sea ingresado por pantalla
		for (int i = 0 ; i < 8 ; i++) {
			paises [i] = JOptionPane.showInputDialog("INTRODUCE PAIS" + ( i+ 1));
			
		}
		// ahora se crea un for each para recorrer los elementos ingresados
		for (String elementos : paises) {
			
			//  se muestra los paises elementos del array paises
			System.out.println("Los paises son :" + elementos);
		}
	
}
}
