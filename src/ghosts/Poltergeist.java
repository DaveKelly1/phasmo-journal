import java.util.ArrayList;
import java.util.List;

public class Poltergeist {
	private String one = "FINGERPRINTS";
	private String two = "SPIRIT BOX";
	private String three = "GHOST WRITING";
	private List<String> poltergeist1;
	
	public Poltergeist() {		
		poltergeist1 = new ArrayList<String>();
		poltergeist1.add(one);
		poltergeist1.add(two);
		poltergeist1.add(three);
	}
	
		public List<String> removePoltergeist(String e1, String e2) {
			if(poltergeist1.contains(e1)) {
				poltergeist1.remove(e1);
			}
			if(poltergeist1.contains(e2)) {
				poltergeist1.remove(e2);
			}	
			return poltergeist1;
		}
		
		public boolean checkPoltergeist(String e1, String e2){
			if(e1.equals(one) && (e2.equals(two))||(e1.equals(two)&&e2.equals(three))||e1.equals(three)&&e2.equals(one)) {
				return true;
			}
				return false;
		}
	}