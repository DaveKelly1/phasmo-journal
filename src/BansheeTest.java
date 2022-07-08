import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BansheeTest {

	private Banshee banshee;

	@Test
	final void test() {
		banshee = new Banshee();
		assertEquals(true, banshee.checkBanshee("FINGERPRINTS", "GHOST ORB"));
		assertEquals(false, banshee.checkBanshee("FINGERPRINTS", "GHOST WRITING"));

	}

}
