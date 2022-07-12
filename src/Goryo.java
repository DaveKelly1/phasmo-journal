import java.util.ArrayList;
import java.util.List;

public class Goryo {
	private String one = "FINGERPRINTS";
	private String two = "EMF LEVEL 5";
	private String three = "DOTS PROJECTOR";
	private List<String> goryo1;
	
	public Goryo() {		
		goryo1 = new ArrayList<String>();
		goryo1.add(one);
		goryo1.add(two);
		goryo1.add(three);
	}
	
		public List<String> removeGoryo(String e1, String e2) {
			if(goryo1.contains(e1)) {
				goryo1.remove(e1);
			}
			if(goryo1.contains(e2)) {
				goryo1.remove(e2);
			}	
			return goryo1;
		}
		
		public boolean checkGoryo(String e1, String e2){
			if(e1.equals(one) && (e2.equals(two))||(e1.equals(two)&&e2.equals(three))||e1.equals(three)&&e2.equals(one)) {
				return true;
			}
				return false;
		}
	}