package ghosts;

import java.util.ArrayList;
import java.util.List;

import ghosts.Interface.Ghost;

public class Revenant implements Ghost {
	private String one = "GHOST ORB";
	private String two = "GHOST WRITING";
	private String three = "FREEZING TEMPERATURES";
	private List<String> revenant1;

	public Revenant() {
		revenant1 = new ArrayList<String>();
		revenant1.add(one);
		revenant1.add(two);
		revenant1.add(three);
	}

	public List<String> removeRevenant(String e1, String e2) {
		if (revenant1.contains(e1)) {
			revenant1.remove(e1);
		}
		if (revenant1.contains(e2)) {
			revenant1.remove(e2);
		}
		return revenant1;
	}

	public boolean checkRevenant(String e1, String e2) {
		if (e1.equals(one) && (e2.equals(two)) || (e1.equals(two) && e2.equals(three))
				|| e1.equals(three) && e2.equals(one)) {
			return true;
		}
		return false;
	}
}