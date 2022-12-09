package operacion;

import java.util.ArrayList;
import java.util.Collections;

import ejemploCollections.EjercicioCollections;

public class Ejemplo {

	public static void main(String[]args) {
		
		Ejemplo ej= new Ejemplo();
		ej.ordenarLista();
		ej.obtenerProm();
	}
	
	public void ordenarLista() {
		ArrayList<String> listaNombres = new ArrayList<>();
		listaNombres.add("Itzel");
		listaNombres.add("Guadalupe");
		listaNombres.add("Sanchez");
		listaNombres.add("Munguia");
		
		Collections.sort(listaNombres, (String elemento1, String elemento2)->elemento1.compareTo(elemento2));
		System.out.println(listaNombres);
}
	
	
	public void obtenerProm() {
		//clase anónima
		Operacion opera= new Operacion() {

			@Override
			public double obtenerPromedio(double numero1, double numero2) {
				// TODO Auto-generated method stub
				return (numero1+numero2)/2;
			}
		};
		System.out.println(opera.obtenerPromedio(2,5));
	}
	
}
