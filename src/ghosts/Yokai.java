package ghosts;

import java.util.ArrayList;
import java.util.List;

import ghosts.Interface.Ghost;

public class Yokai implements Ghost {
	private String one = "GHOST ORB";
	private String two = "SPIRIT BOX";
	private String three = "DOTS PROJECTOR";
	private List<String> yokai1;

	public Yokai() {
		yokai1 = new ArrayList<String>();
		yokai1.add(one);
		yokai1.add(two);
		yokai1.add(three);
	}

	public List<String> removeGhost(String e1, String e2) {
		if (yokai1.contains(e1)) {
			yokai1.remove(e1);
		}
		if (yokai1.contains(e2)) {
			yokai1.remove(e2);
		}
		return yokai1;
	}

	public boolean checkGhost(String e1, String e2) {
		if (e1.equals(one) && (e2.equals(two)) || (e1.equals(two) && e2.equals(three))
				|| e1.equals(three) && e2.equals(one)) {
			return true;
		}
		return false;
	}
}