package ghosts;

import java.util.ArrayList;
import java.util.List;
import ghosts.Interface.Ghost;

public class Demon implements Ghost {
	private String evidenceOne = "fingerprints";
	private String evidenceTwo = "ghost writing";
	private String evidenceThree = "freezing temperatures";
	private List<String> demon;

	public Demon() {
		demon = new ArrayList<String>();
		demon.add(evidenceOne);
		demon.add(evidenceTwo);
		demon.add(evidenceThree);
	}

	public List<String> removeGhost(String evidenceOne, String evidenceTwo) {
		if (demon.contains(evidenceOne)) {
			demon.remove(evidenceOne);
		}

		if (demon.contains(evidenceTwo)) {
			demon.remove(evidenceTwo);
		}
		return demon;
	}

	public boolean checkGhost(String e1, String e2) {
		return (e1.equals(evidenceOne) && (e2.equals(evidenceTwo))
				|| (e1.equals(evidenceTwo) && e2.equals(evidenceThree))
				|| e1.equals(evidenceThree) && e2.equals(evidenceOne));
	}
}