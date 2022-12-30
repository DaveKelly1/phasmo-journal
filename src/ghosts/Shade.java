import java.util.ArrayList;
import java.util.List;

public class Shade {
	private String one = "EMF LEVEL 5";
	private String two = "GHOST WRITING";
	private String three = "FREEZING TEMPERATURES";
	private List<String> shade1;
	
	public Shade() {		
		shade1 = new ArrayList<String>();
		shade1.add(one);
		shade1.add(two);
		shade1.add(three);
	}
	
		public List<String> removeShade(String e1, String e2) {
			if(shade1.contains(e1)) {
				shade1.remove(e1);
			}
			if(shade1.contains(e2)) {
				shade1.remove(e2);
			}	
			return shade1;
		}
		
		public boolean checkShade(String e1, String e2){
			if(e1.equals(one) && (e2.equals(two))||(e1.equals(two)&&e2.equals(three))||e1.equals(three)&&e2.equals(one)) {
				return true;
			}
				return false;
		}
	}