package hashMap;

import java.util.HashMap;

public class MainHash {
	public static void main(String[] args) {

		HashMap<String, Integer> mapa = new HashMap<>();
		mapa.put("Lorena Fiordelmondo", 41348526);
		mapa.put("Katherinne Fiordelmondo", 41348525);
		mapa.put("Pepe Fiordelmondo", 2810732);
		System.out.println("el mapa: " + mapa.entrySet());

		mapa.replace("Pepe Fiordelmondo", 12154);
		System.out.println("el mapa con el reemplazo: " + mapa.entrySet());

		mapa.forEach((String, Integer) -> System.out.println("Nombre: " + String + "  DNI: " + Integer));

	}
}
