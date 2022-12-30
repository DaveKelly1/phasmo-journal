package ghosts;

import java.util.ArrayList;
import java.util.List;

import ghosts.Interface.Ghost;

public class Yurei implements Ghost {
	private String one = "GHOST ORB";
	private String two = "DOTS PROJECTOR";
	private String three = "FREEZING TEMPERATURES";
	private List<String> yurei1;

	public Yurei() {
		yurei1 = new ArrayList<String>();
		yurei1.add(one);
		yurei1.add(two);
		yurei1.add(three);
	}

	public List<String> removeGhost(String e1, String e2) {
		if (yurei1.contains(e1)) {
			yurei1.remove(e1);
		}
		if (yurei1.contains(e2)) {
			yurei1.remove(e2);
		}
		return yurei1;
	}

	public boolean checkGhost(String e1, String e2) {
		if (e1.equals(one) && (e2.equals(two)) || (e1.equals(two) && e2.equals(three))
				|| e1.equals(three) && e2.equals(one)) {
			return true;
		}
		return false;
	}
}