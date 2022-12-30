import java.util.ArrayList;
import java.util.List;

public class Oni {
	private String one = "EMF LEVEL 5";
	private String two = "DOTS PROJECTOR";
	private String three = "FREEZING TEMPERATURES";
	private List<String> oni1;
	
	public Oni() {		
		oni1 = new ArrayList<String>();
		oni1.add(one);
		oni1.add(two);
		oni1.add(three);
	}
	
		public List<String> removeOni(String e1, String e2) {
			if(oni1.contains(e1)) {
				oni1.remove(e1);
			}
			if(oni1.contains(e2)) {
				oni1.remove(e2);
			}	
			return oni1;
		}
		
		public boolean checkOni(String e1, String e2){
			if(e1.equals(one) && (e2.equals(two))||(e1.equals(two)&&e2.equals(three))||e1.equals(three)&&e2.equals(one)) {
				return true;
			}
				return false;
		}
	}