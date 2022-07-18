
import java.util.ArrayList;
import java.util.List;

public class Spirit {
	private String one = "EMF LEVEL 5";
	private String two = "GHOST WRITING";
	private String three = "SPIRIT BOX";
	private List<String> spirit1;
	
	public Spirit() {		
		spirit1 = new ArrayList<String>();
		spirit1.add(one);
		spirit1.add(two);
		spirit1.add(three);
	}
	
		public List<String> removeSpirit(String e1, String e2) {
			if(spirit1.contains(e1)) {
				spirit1.remove(e1);
			}
			if(spirit1.contains(e2)) {
				spirit1.remove(e2);
			}	
			return spirit1;
		}
		
		public boolean checkSpirit(String e1, String e2){
			if(e1.equals(one) && (e2.equals(two))||(e1.equals(two)&&e2.equals(three))||e1.equals(three)&&e2.equals(one)) {
				return true;
			}
				return false;
		}
	}