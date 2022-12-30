package ghosts;

import java.util.ArrayList;
import java.util.List;

import ghosts.Interface.Ghost;

public class Wraith implements Ghost {
	private String one = "EMF LEVEL 5";
	private String two = "SPIRIT BOX";
	private String three = "DOTS PROJECTOR";
	private List<String> wraith1;

	public Wraith() {
		wraith1 = new ArrayList<String>();
		wraith1.add(one);
		wraith1.add(two);
		wraith1.add(three);
	}

	public List<String> removeWraith(String e1, String e2) {
		if (wraith1.contains(e1)) {
			wraith1.remove(e1);
		}
		if (wraith1.contains(e2)) {
			wraith1.remove(e2);
		}
		return wraith1;
	}

	public boolean checkWraith(String e1, String e2) {
		if (e1.equals(one) && (e2.equals(two)) || (e1.equals(two) && e2.equals(three))
				|| e1.equals(three) && e2.equals(one)) {
			return true;
		}
		return false;
	}
}