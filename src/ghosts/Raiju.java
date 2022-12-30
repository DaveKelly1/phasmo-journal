package ghosts;

import java.util.ArrayList;
import java.util.List;

import ghosts.Interface.Ghost;

public class Raiju implements Ghost {
	private String one = "EMF LEVEL 5";
	private String two = "GHOST ORB";
	private String three = "DOTS PROJECTOR";
	private List<String> raiju1;

	public Raiju() {
		raiju1 = new ArrayList<String>();
		raiju1.add(one);
		raiju1.add(two);
		raiju1.add(three);
	}

	public List<String> removeGhost(String e1, String e2) {
		if (raiju1.contains(e1)) {
			raiju1.remove(e1);
		}
		if (raiju1.contains(e2)) {
			raiju1.remove(e2);
		}
		return raiju1;
	}

	public boolean checkGhost(String e1, String e2) {
		if (e1.equals(one) && (e2.equals(two)) || (e1.equals(two) && e2.equals(three))
				|| e1.equals(three) && e2.equals(one)) {
			return true;
		}
		return false;
	}
}