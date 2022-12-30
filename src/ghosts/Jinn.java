package ghosts;

import java.util.ArrayList;
import java.util.List;

import ghosts.Interface.Ghost;

public class Jinn implements Ghost {
	private String one = "FINGERPRINTS";
	private String two = "EMF LEVEL 5";
	private String three = "FREEZING TEMPERATURES";
	private List<String> jinn1;

	public Jinn() {
		jinn1 = new ArrayList<String>();
		jinn1.add(one);
		jinn1.add(two);
		jinn1.add(three);
	}

	public List<String> removeJinn(String e1, String e2) {
		if (jinn1.contains(e1)) {
			jinn1.remove(e1);
		}
		if (jinn1.contains(e2)) {
			jinn1.remove(e2);
		}
		return jinn1;
	}

	public boolean checkJinn(String e1, String e2) {
		if (e1.equals(one) && (e2.equals(two)) || (e1.equals(two) && e2.equals(three))
				|| e1.equals(three) && e2.equals(one)) {
			return true;
		}
		return false;
	}
}