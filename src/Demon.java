import java.util.ArrayList;
import java.util.List;

public class Demon {
	private String one = "FINGERPRINTS";
	private String two = "GHOST WRITING";
	private String three = "FREEZING TEMPERATURES";
	private List<String> demon1;
	
	public Demon() {		
		demon1 = new ArrayList<String>();
		demon1.add(one);
		demon1.add(two);
		demon1.add(three);
	}
	
		public List<String> removeDemon(String e1, String e2) {
			if(demon1.contains(e1)) {
				demon1.remove(e1);
			}
			if(demon1.contains(e2)) {
				demon1.remove(e2);
			}	
			return demon1;
		}
		
		public boolean checkDemon(String e1, String e2){
			if(e1.equals(one) && (e2.equals(two))||(e1.equals(two)&&e2.equals(three))||e1.equals(three)&&e2.equals(one)) {
				return true;
			}
				return false;
		}
	}