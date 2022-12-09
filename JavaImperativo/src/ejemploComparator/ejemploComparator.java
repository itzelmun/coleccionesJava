package ejemploComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ejemploCollections.EjercicioCollections;

public class ejemploComparator {

	public static void main(String[]args) {
		
		EjercicioCollections ej= new EjercicioCollections();
		ej.ordenarLista();
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
}
