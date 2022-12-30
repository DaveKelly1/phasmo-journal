package ghosts;

import java.util.ArrayList;
import java.util.List;

import ghosts.Interface.Ghost;

public class Mare implements Ghost {
	private String one = "SPIRIT BOX";
	private String two = "GHOST ORB";
	private String three = "GHOST WRITING";
	private List<String> mare1;

	public Mare() {
		mare1 = new ArrayList<String>();
		mare1.add(one);
		mare1.add(two);
		mare1.add(three);
	}

	public List<String> removeGhost(String e1, String e2) {
		if (mare1.contains(e1)) {
			mare1.remove(e1);
		}
		if (mare1.contains(e2)) {
			mare1.remove(e2);
		}
		return mare1;
	}

	public boolean checkGhost(String e1, String e2) {
		if (e1.equals(one) && (e2.equals(two)) || (e1.equals(two) && e2.equals(three))
				|| e1.equals(three) && e2.equals(one)) {
			return true;
		}
		return false;
	}
}