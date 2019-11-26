package mape;

import java.util.HashMap;
import java.util.Map;
public class GlavneMape {

	public static void main(String[] args) {

		Map<Integer, String> mojaMapa = new HashMap<Integer, String>();
		
		mojaMapa.put(3, "Djordje");
		mojaMapa.put(3, "Igor");
		mojaMapa.put(69, "Stefan");
		mojaMapa.put(96, "Visnja");
		
		String imePolaznika = mojaMapa.get(53);
		System.out.println(imePolaznika);
		
		System.out.println("Map preko for petlje: ");
		
		for(Object o: mojaMapa.entrySet()) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
