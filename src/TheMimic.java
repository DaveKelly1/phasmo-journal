import java.util.ArrayList;
import java.util.List;

public class TheMimic {
	private String one = "FINGERPRINTS";
	private String two = "SPIRIT BOX";
	private String three = "FREEZING TEMPERATURES";
	private List<String> theMimic1;
	
	public TheMimic() {		
		theMimic1 = new ArrayList<String>();
		theMimic1.add(one);
		theMimic1.add(two);
		theMimic1.add(three);
	}
	
		public List<String> removeTheMimic(String e1, String e2) {
			if(theMimic1.contains(e1)) {
				theMimic1.remove(e1);
			}
			if(theMimic1.contains(e2)) {
				theMimic1.remove(e2);
			}	
			return theMimic1;
		}
		
		public boolean checkTheMimic(String e1, String e2){
			if(e1.equals(one) && (e2.equals(two))||(e1.equals(two)&&e2.equals(three))||e1.equals(three)&&e2.equals(one)) {
				return true;
			}
				return false;
		}
	}