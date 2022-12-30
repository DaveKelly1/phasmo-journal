import java.util.ArrayList;
import java.util.List;

public class Banshee {
	private String one = "FINGERPRINTS";
	private String two = "GHOST ORB";
	private String three = "DOTS PROJECTOR";
	private List<String> banshee1;
	
	public Banshee() {		
		banshee1 = new ArrayList<String>();
		banshee1.add(one);
		banshee1.add(two);
		banshee1.add(three);
	}
	
		public List<String> removeBanshee(String e1, String e2) {
			if(banshee1.contains(e1)) {
				banshee1.remove(e1);
			}
			if(banshee1.contains(e2)) {
				banshee1.remove(e2);
			}	
			return banshee1;
		}
		
		public boolean checkBanshee(String e1, String e2){
			if(e1.equals(one) && (e2.equals(two))||(e1.equals(two)&&e2.equals(three))||e1.equals(three)&&e2.equals(one)) {
			return true;
		}
			return false;
	}
}

