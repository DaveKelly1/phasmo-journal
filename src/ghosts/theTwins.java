package ghosts;

import java.util.ArrayList;
import java.util.List;

import ghosts.Interface.Ghost;

public class TheTwins implements Ghost {
	private String one = "EMF LEVEL 5";
	private String two = "SPIRIT BOX";
	private String three = "FREEZING TEMPERATURES";
	private List<String> theTwins1;

	public TheTwins() {
		theTwins1 = new ArrayList<String>();
		theTwins1.add(one);
		theTwins1.add(two);
		theTwins1.add(three);
	}

	public List<String> removeGhost(String e1, String e2) {
		if (theTwins1.contains(e1)) {
			theTwins1.remove(e1);
		}
		if (theTwins1.contains(e2)) {
			theTwins1.remove(e2);
		}
		return theTwins1;
	}

	public boolean checkGhost(String e1, String e2) {
		if (e1.equals(one) && (e2.equals(two)) || (e1.equals(two) && e2.equals(three))
				|| e1.equals(three) && e2.equals(one)) {
			return true;
		}
		return false;
	}
}