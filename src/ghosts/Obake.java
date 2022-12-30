package ghosts;

import java.util.ArrayList;
import java.util.List;

import ghosts.Interface.Ghost;

public class Obake implements Ghost {
	private String one = "FINGERPRINTS";
	private String two = "EMF LEVEL 5";
	private String three = "GHOST ORB";
	private List<String> obake1;

	public Obake() {
		obake1 = new ArrayList<String>();
		obake1.add(one);
		obake1.add(two);
		obake1.add(three);
	}

	public List<String> removeObake(String e1, String e2) {
		if (obake1.contains(e1)) {
			obake1.remove(e1);
		}
		if (obake1.contains(e2)) {
			obake1.remove(e2);
		}
		return obake1;
	}

	public boolean checkObake(String e1, String e2) {
		if (e1.equals(one) && (e2.equals(two)) || (e1.equals(two) && e2.equals(three))
				|| e1.equals(three) && e2.equals(one)) {
			return true;
		}
		return false;
	}
}