package Liste;
import java.util.ArrayList;
import java.util.List; 
public class GlavneListe {

	public static void main(String[] args) {
	
		
	List lista = new ArrayList();
	
	// dodavanje elemenata u listu
	
	lista.add("Stevo");
	lista.add(1987);
	lista.add(3.14);
	lista.add(false);
	lista.add("Stevo");
	// "hvatanje" elemenata liste
	
	System.out.println("Treci element liste je: " + lista.get(2));
		
	double x = (double)lista.get(2);
	String y = (String)lista.get(4);
	System.out.println(y);	
	
	// genericke liste
	
	List <String> imena = new ArrayList<String>();
	
	imena.add("Djordje");
	imena.add("Marina");
	imena.add("Bojan");
	
	
	
	
	System.out.println("Polaznici su: ");
	
	for(int i = 0; i<imena.size(); i++) {
		String imePolaznika = imena.get(i);
		System.out.println(imePolaznika);
		
	}
		
	
	imena.remove(0); // uklanja element iz liste
	
	for(String imePolaznika: imena) {
		System.out.println(imePolaznika);
		
	}
	
	
	
		
		

	}

}
