package ghosts;

import java.util.ArrayList;
import java.util.List;
import ghosts.Interface.Ghost;

public class Banshee implements Ghost {
	private String evidenceOne = "fingerprints";
	private String evidenceTwo = "ghost orb";
	private String evidenceThree = "dots projector";
	private List<String> banshee;

	public Banshee() {
		banshee = new ArrayList<String>();
		banshee.add(evidenceOne);
		banshee.add(evidenceTwo);
		banshee.add(evidenceThree);
	}

	public List<String> removeGhost(String eOne, String eTwo) {

		if (banshee.contains(eOne)) {
			banshee.remove(eOne);
		}
		if (banshee.contains(eTwo)) {
			banshee.remove(eTwo);
		}
		return banshee;
	}

	public boolean checkGhost(String eOne, String eTwo) {
		return (eOne.equals(evidenceOne) && (eTwo.equals(evidenceTwo))
				|| (eOne.equals(evidenceTwo) && eTwo.equals(evidenceThree))
				|| eOne.equals(evidenceThree) && eTwo.equals(evidenceOne));
	}

}