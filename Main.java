package hashEjemplo;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Persona lorena = new Persona("Lorena", "Fiordelmondo", "Argentina", 41348526, 23, "Soltero","lorefior526@gmail.com");
		Persona alan = new Persona("Alan", "Tafel", "Polaca", 32093786, 33, "Soltero", "alantafel@gmail.com");
		HashMap<String, Integer> dni = new HashMap<String, Integer>();

		dni.put(lorena.getNombre(), lorena.getDni());
		dni.put(alan.getNombre(), alan.getDni());

		System.out.println("Dni Lorena: " + dni.get(lorena.getNombre()));
		System.out.println("Dni Alan: " + dni.get(alan.getNombre()));
		HashMap<String, String> nacionalidad = new HashMap<String, String>();

		nacionalidad.put(lorena.getNombre(), lorena.getNacionalidad());
		nacionalidad.put(alan.getNombre(), alan.getNacionalidad());

		System.out.println("Nacionalidad Lorena: " + nacionalidad.get(lorena.getNombre()));
		System.out.println("Nacionalidad Alan: " + nacionalidad.get(alan.getNombre()));

		HashMap<String, String> apellido = new HashMap<String, String>();

		apellido.put(lorena.getNombre(), lorena.getApellido());

		System.out.println("Apellido: " + apellido.get(lorena.getNombre()));

		HashMap<String, Integer> edad = new HashMap<String, Integer>();

		edad.put(lorena.getNombre(), lorena.getEdad());

		System.out.println("Edad: " + edad.get(lorena.getNombre()));

	}

}
