
import java.util.ArrayList;
import java.util.List;

public class Onryo {
	private String one = "GHOST ORB";
	private String two = "SPIRIT BOX";
	private String three = "FREEZING TEMPERATURES";
	private List<String> onryo1;
	
	public Onryo() {		
		onryo1 = new ArrayList<String>();
		onryo1.add(one);
		onryo1.add(two);
		onryo1.add(three);
	}
	
		public List<String> removeOnryo(String e1, String e2) {
			if(onryo1.contains(e1)) {
				onryo1.remove(e1);
			}
			if(onryo1.contains(e2)) {
				onryo1.remove(e2);
			}	
			return onryo1;
		}
		
		public boolean checkOnryo(String e1, String e2){
			if(e1.equals(one) && (e2.equals(two))||(e1.equals(two)&&e2.equals(three))||e1.equals(three)&&e2.equals(one)) {
				return true;
			}
				return false;
		}
	}