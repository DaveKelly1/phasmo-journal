import java.util.ArrayList;
import java.util.List;

public class Hantu {
	private String one = "FINGERPRINTS";
	private String two = "GHOST ORB";
	private String three = "FREEZING TEMPERATURES";
	private List<String> phantom1;
	
	public Hantu() {		
		phantom1 = new ArrayList<String>();
		phantom1.add(one);
		phantom1.add(two);
		phantom1.add(three);
	}
	
		public List<String> removeHantu(String e1, String e2) {
			if(phantom1.contains(e1)) {
				phantom1.remove(e1);
			}
			if(phantom1.contains(e2)) {
				phantom1.remove(e2);
			}	
			return phantom1;
		}
		
		public boolean checkHantu(String e1, String e2){
			if(e1.equals(one) && (e2.equals(two))||(e1.equals(two)&&e2.equals(three))||e1.equals(three)&&e2.equals(one)) {
				return true;
			}
				return false;
		}
	}