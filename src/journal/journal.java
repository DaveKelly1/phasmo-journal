package journal;

import java.util.HashSet;
import java.util.Scanner;

public class journal {

	String evidence1;
	String evidence2;

	journal(String e1, String e2) {
		evidence1 = e1;
		evidence2 = e2;
	}

	public boolean getEvidence1() {
		if (!(evidence1 == null))
			return true;
		return false;
	}

	public void setEvidence1(String evidence1) {
		this.evidence1 = evidence1;
	}

	public String getEvidence2() {
		return evidence2;
	}

	public void setEvidence2(String evidence2) {
		this.evidence2 = evidence2;
	}

	void voodooDoll() {
		System.out.println("Regarding VOODOO DOLLS");
		System.out.println(
				"Interacting with the voodoo doll will cause one of the 10 pins stuck in the doll to be pushed into it at random. This will cause the ghost to perform an interaction, and will drop the user's sanity by 5%. These forced interactions can include evidence sources past EMF Level 5, such as making the ghost interact with Ghost Writing Books, create silhouettes in D.O.T.S. Projectors, and touch doors, windows, and light switches for Fingerprints.\r\n"
						+ "\r\n"
						+ "If the heart pin is pressed down, the user's sanity will drop by 10%, and the ghost will initiate a cursed hunt. Additionally, if the user's sanity is less than the sanity that the pressed pin would drain, all remaining pins will also get pushed in and a cursed hunt will also occur. ");
	}

	void hauntedMirror() {
		System.out.println("Regarding the HAUNTED MIRROR");
		System.out.println(
				"The mirror must be toggled while inside the investigation area. When activated, the haunted mirror will show a view of a part of the ghost room as a sweeping panorama, allowing players to locate the room by cross-reference. This view is a live feed of the room, so any lights turned on, items moved, and equipment or players present in the room will be visible. The only exception is if the player using the mirror is within its view; neither the player nor the mirror will be visible.\r\n"
						+ "\r\n"
						+ "Using the haunted mirror will rapidly drain the sanity of the player at a rate of about 7.5%/s or 10%/s,[verify] including the animation of raising and lowering the mirror. If the user's sanity reaches zero, the mirror will break, and the ghost will start a cursed hunt from its current position. When the mirror breaks, the front of the mirror will become smashed, and a cracking noise will be emitted. ");
	}

	void musicBox() {
		System.out.println("Regarding the MUSIC BOX");
		System.out.println(
				"The music box will make the ghost sing along while remaining invisible, broadcasting its location. If the music box is 5 meters or less from the ghost, it will manifest and start walking towards the box. If the ghost touches the player holding the box, walks for more than 5 seconds, or the box is dropped while the tune is playing, the music box will stop and the ghost will initiate a cursed hunt. If the player reaches 0% sanity or the ghost decides to hunt naturally (i.e., unrelated to the music box), a normal hunt will occur instead. The music box can be handheld or placed on the floor, the latter being the only safe way to discard the box without triggering a cursed hunt while it's playing. In all cases, the box will close once it stops playing.\r\n"
						+ "\r\n"
						+ "Listening to the music will drop the player's sanity. A player holding the music box and listening to the complete song loses approximately 75% of their sanity. A player's sanity will drop only if the player can hear the song, and the sanity drop decreases the further a player is from the music box. This applies to all players regardless of whether they were the one to activate the music box.");
	}

	void ouijaBoard() {
		System.out.println("Regarding the OUIJA BOARD");
		System.out.println(
				"The Ouija Board can be activated by holding left click on it, or toggling it directly if holding the board. Once activated, the planchette will appear. This will also cancel the setup phase if it is ongoing. The Ouija Board will then respond to voice input within 3 metres of it. The player asking the question must be within the investigation area to ask questions. The Ouija Board does not have to be in the ghost room (nor the ghost's current room) to relay responses.\r\n"
						+ "\r\n"
						+ "To deactivate the Ouija Board, any nearby player must say \"Goodbye\", which will make the planchette disappear. If the player who activated the board walks away from an active Ouija Board, or the player currently asking questions or saying goodbye has insufficient sanity to \"pay\" for the question, the board will burn and break itself up, activating a cursed hunt. ");
	}

	void tarotCards() {
		System.out.println("Regarding the TAROT CARDS");
		System.out.println(
				"Tarot cards can be picked up and one card can be drawn at a time. Each Tarot cards deck contains 10 randomly generated cards. There are various possible cards the player can draw from the deck, each having a unique effect on either the player or the ghost. After being used, each card will burn up and vanish in a colored flame that is dependent on its type. The cards must be drawn inside the investigation area for them to work.\r\n"
						+ "\r\n"
						+ "There are 10 possible cards that can be drawn. A single card type can appear more than once in the deck, and various card types have different, independent chances to be drawn. The following table lists all cards that can be drawn: ");
	}

	void summoningCircle() {
		System.out.println("Regarding the SUMMONING CIRCLE");
		System.out.println(
				"The summoning circle can be used by lighting all five red candles with a lighter. Each candle deducts 16% sanity for nearby players, leading to a total of 80% being deducted for all candles. Summoning circle candles can extinguish after a while or be blown out by the ghost, in the same way as regular candles. Once all five candles are lit, the ghost is summoned and fully materialized, except a Shade, which has a chance[verify] of appearing as a transparent shadow. The summoned ghost stays motionless for about 5[verify] seconds, unable to kill players. This stationary period is considered a ghost event. However, the front door will lock immediately after lighting the last candle. After this \"grace period\", it immediately initiates a cursed hunt on the spot, without the additional 1 second grace period. Once the summoning circle is activated, it cannot be used again. ");
	}

}
