package ejemploCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EjercicioCollections {

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
		
		Collections.sort(listaNombres, new Comparator <String>() {
			public int compare(String elemento1, String elemento2) {
				return elemento1.compareTo(elemento2);
			}
		});

		System.out.println(listaNombres);
}
}
