import java.util.ArrayList;
import java.util.List;

public class Phantom {
	private String one = "FINGERPRINTS";
	private String two = "SPIRIT BOX";
	private String three = "DOTS PROJECTOR";
	private List<String> phantom1;
	
	public Phantom() {		
		phantom1 = new ArrayList<String>();
		phantom1.add(one);
		phantom1.add(two);
		phantom1.add(three);
	}
	
		public List<String> removePhantom(String e1, String e2) {
			if(phantom1.contains(e1)) {
				phantom1.remove(e1);
			}
			if(phantom1.contains(e2)) {
				phantom1.remove(e2);
			}	
			return phantom1;
		}
		
		public boolean checkPhantom(String e1, String e2){
			if(e1.equals(one) && (e2.equals(two))||(e1.equals(two)&&e2.equals(three))||e1.equals(three)&&e2.equals(one)) {
				return true;
			}
				return false;
		}
	}