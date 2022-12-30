package ghosts;

import java.util.ArrayList;
import java.util.List;

import ghosts.Interface.Ghost;

public class Myling implements Ghost {
	private String one = "FINGERPRINTS";
	private String two = "GHOST WRITING";
	private String three = "EMF LEVEL 5";
	private List<String> myling1;

	public Myling() {
		myling1 = new ArrayList<String>();
		myling1.add(one);
		myling1.add(two);
		myling1.add(three);
	}

	public List<String> removeMyling(String e1, String e2) {
		if (myling1.contains(e1)) {
			myling1.remove(e1);
		}
		if (myling1.contains(e2)) {
			myling1.remove(e2);
		}
		return myling1;
	}

	public boolean checkMyling(String e1, String e2) {
		if (e1.equals(one) && (e2.equals(two)) || (e1.equals(two) && e2.equals(three))
				|| e1.equals(three) && e2.equals(one)) {
			return true;
		}
		return false;
	}
}