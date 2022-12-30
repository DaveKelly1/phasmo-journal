import java.util.HashSet;
import java.util.Scanner;

public class journal {
	
	String evidence1;
	String evidence2;
	
	journal(String e1, String e2){
		evidence1 = e1;
		evidence2 = e2;
	}

	 public boolean getEvidence1() {
		if(!(evidence1==null)) return true;
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

	void Banshee(String e1, String e2) {
		HashSet <String> banshee = new HashSet <String>();
		banshee.add("FINGERPRINTS");
		banshee.add("GHOST ORB");
		banshee.add("DOTS PROJECTOR");
		
		if(banshee.contains(e1)) {
			banshee.remove(e1);
		}
		if(banshee.contains(e2)) {
			banshee.remove(e2);
		}
		System.out.println("The remaining evidence required for Banshee is: " + banshee);
	}
	 
	 void Demon(String e1, String e2) {
			HashSet <String> demon = new HashSet <String>();
			demon.add("FINGERPRINTS");
			demon.add("GHOST WRITING");
			demon.add("FREEZING TEMPERATURES");
			
			if(demon.contains(e1)) {
				demon.remove(e1);
			}
			if(demon.contains(e2)) {
				demon.remove(e2);
			}
			System.out.println("The remaining evidence required for Demon is: " + demon);
		}
	 
	 void Goryo (String e1, String e2) {
			HashSet <String> goryo = new HashSet <String>();
			goryo.add("FINGERPRINTS");
			goryo.add("EMF LEVEL 5");
			goryo.add("DOTS PROJECTOR");
			
			if(goryo.contains(e1)) {
				goryo.remove(e1);
			}
			if(goryo.contains(e2)) {
				goryo.remove(e2);
			}
			System.out.println("The remaining evidence required for Goryo is: " + goryo);
		}
	 void Phantom(String e1, String e2) {
			HashSet <String> phantom = new HashSet <String>();
			phantom.add("FINGERPRINTS");
			phantom.add("SPIRIT BOX");
			phantom.add("DOTS PROJECTOR");
			
			if(phantom.contains(e1)) {
				phantom.remove(e1);
			}
			if(phantom.contains(e2)) {
				phantom.remove(e2);
			}
			System.out.println("The remaining evidence required for Phantom is: " + phantom);
		}
	 
	 void Hantu(String e1, String e2) {
			HashSet <String> hantu = new HashSet <String>();
			hantu.add("FINGERPRINTS");
			hantu.add("GHOST ORB");
			hantu.add("FREEZING TEMPERATURES");
			
			if(hantu.contains(e1)) {
				hantu.remove(e1);
			}
			if(hantu.contains(e2)) {
				hantu.remove(e2);
			}
			System.out.println("The remaining evidence required for Hantu is: " + hantu);
		}
	 
	 void Jinn(String e1, String e2) {
			HashSet <String> jinn = new HashSet <String>();
			jinn.add("FINGERPRINTS");
			jinn.add("EMF LEVEL 5");
			jinn.add("FREEZING TEMPERATURES");
			
			if(jinn.contains(e1)) {
				jinn.remove(e1);
			}
			if(jinn.contains(e2)) {
				jinn.remove(e2);
			}
			System.out.println("The remaining evidence required for Jinn is: " + jinn);
		}
	 
	 void Mare(String e1, String e2) {
			HashSet <String> mare = new HashSet <String>();
			mare.add("GHOST ORB");
			mare.add("SPIRIT BOX");
			mare.add("GHOST WRITING");
			
			if(mare.contains(e1)) {
				mare.remove(e1);
			}
			if(mare.contains(e2)) {
				mare.remove(e2);
			}
			System.out.println("The remaining evidence required for Mare is: " + mare);
		}
	 
	 void Myling(String e1, String e2) {
			HashSet <String> myling = new HashSet <String>();
			myling.add("FINGERPRINTS");
			myling.add("EMF LEVEL 5");
			myling.add("GHOST WRITING");
			
			if(myling.contains(e1)) {
				myling.remove(e1);
			}
			if(myling.contains(e2)) {
				myling.remove(e2);
			}
			System.out.println("The remaining evidence required for Myling is: " + myling);
		}
	 
	 void Obake(String e1, String e2) {
			HashSet <String> obake = new HashSet <String>();
			obake.add("FINGERPRINTS");
			obake.add("EMF LEVEL 5");
			obake.add("GHOST ORB");
			
			if(obake.contains(e1)) {
				obake.remove(e1);
			}
			if(obake.contains(e2)) {
				obake.remove(e2);
			}
			System.out.println("The remaining evidence required for Obake is: " + obake);
		}
	 
	 void Oni(String e1, String e2) {
			HashSet <String> oni = new HashSet <String>();
			oni.add("EMF LEVEL 5");
			oni.add("FREEZING TEMPERATURES");
			oni.add("DOTS PROJECTOR");
			
			if(oni.contains(e1)) {
				oni.remove(e1);
			}
			if(oni.contains(e2)) {
				oni.remove(e2);
			}
			System.out.println("The remaining evidence required for Oni is: " + oni);
		}
	 
	 void Onryo(String e1, String e2) {
			HashSet <String> onryo = new HashSet <String>();
			onryo.add("GHOST ORB");
			onryo.add("SPIRIT BOX");
			onryo.add("FREEZING TEMPERATURES");
			
			if(onryo.contains(e1)) {
				onryo.remove(e1);
			}
			if(onryo.contains(e2)) {
				onryo.remove(e2);
			}
			System.out.println("The remaining evidence required for Onryo is: " + onryo);
		}
	 
	 void Poltergeist(String e1, String e2) {
			HashSet <String> poltergeist = new HashSet <String>();
			poltergeist.add("FINGERPRINTS");
			poltergeist.add("SPIRIT BOX");
			poltergeist.add("GHOST WRITING");
			
			if(poltergeist.contains(e1)) {
				poltergeist.remove(e1);
			}
			if(poltergeist.contains(e2)) {
				poltergeist.remove(e2);
			}
			System.out.println("The remaining evidence required for Poltergeist is: " + poltergeist);
		}
	 
	 void Raiju(String e1, String e2) {
			HashSet <String> raiju = new HashSet <String>();
			raiju.add("EMF LEVEL 5");
			raiju.add("GHOST ORB");
			raiju.add("DOTS PROJECTOR");
			
			if(raiju.contains(e1)) {
				raiju.remove(e1);
			}
			if(raiju.contains(e2)) {
				raiju.remove(e2);
			}
			System.out.println("The remaining evidence required for Raiju is: " + raiju);
		}
	 
	 void Revenant(String e1, String e2) {
			HashSet <String> revenant = new HashSet <String>();
			revenant.add("GHOST ORB");
			revenant.add("GHOST WRITING");
			revenant.add("FREEZING TEMPERATURES");
			
			if(revenant.contains(e1)) {
				revenant.remove(e1);
			}
			if(revenant.contains(e2)) {
				revenant.remove(e2);
			}
			System.out.println("The remaining evidence required for Revenant is: " + revenant);
		}
	 
	 void Shade(String e1, String e2) {
			HashSet <String> shade = new HashSet <String>();
			shade.add("EMF LEVEL 5");
			shade.add("GHOST WRITING");
			shade.add("FREEZING TEMPERATURES");
			
			if(shade.contains(e1)) {
				shade.remove(e1);
			}
			if(shade.contains(e2)) {
				shade.remove(e2);
			}
			System.out.println("The remaining evidence required for Shade is: " + shade);
		}
	 
	 void Spirit(String e1, String e2) {
			HashSet <String> spirit = new HashSet <String>();
			spirit.add("EMF LEVEL 5");
			spirit.add("SPIRIT BOX");
			spirit.add("GHOST WRITING");
			
			if(spirit.contains(e1)) {
				spirit.remove(e1);
			}
			if(spirit.contains(e2)) {
				spirit.remove(e2);
			}
			System.out.println("The remaining evidence required for Spirit is: " + spirit);
		}
	 
	 void theMimic(String e1, String e2) {
			HashSet <String> theMimic = new HashSet <String>();
			theMimic.add("FINGERPRINTS");
			theMimic.add("SPIRIT BOX");
			theMimic.add("FREEZING TEMPERATURES");
			
			if(theMimic.contains(e1)) {
				theMimic.remove(e1);
			}
			if(theMimic.contains(e2)) {
				theMimic.remove(e2);
			}
			System.out.println("The remaining evidence required for the Mimic is: " + theMimic);
		}
	 
	 void theTwins(String e1, String e2) {
			HashSet <String> theTwins = new HashSet <String>();
			theTwins.add("EMF LEVEL 5");
			theTwins.add("SPIRIT BOX");
			theTwins.add("FREEZING TEMPERATURES");
			
			if(theTwins.contains(e1)) {
				theTwins.remove(e1);
			}
			if(theTwins.contains(e2)) {
				theTwins.remove(e2);
			}
			System.out.println("The remaining evidence required for the Twins is: " + theTwins);
		}
	 
	 void Yokai(String e1, String e2) {
			HashSet <String> yokai = new HashSet <String>();
			yokai.add("GHOST ORB");
			yokai.add("SPIRIT BOX");
			yokai.add("DOTS PROJECTOR");
			
			if(yokai.contains(e1)) {
				yokai.remove(e1);
			}
			if(yokai.contains(e2)) {
				yokai.remove(e2);
			}
			System.out.println("The remaining evidence required for Yokai is: " + yokai);
		}
	 
	 void Wraith(String e1, String e2) {
			HashSet <String> wraith = new HashSet <String>();
			wraith.add("EMF LEVEL 5");
			wraith.add("SPIRIT BOX");
			wraith.add("DOTS PROJECTOR");
			
			if(wraith.contains(e1)) {
				wraith.remove(e1);
			}
			if(wraith.contains(e2)) {
				wraith.remove(e2);
			}
			System.out.println("The remaining evidence required for Wraith is: " + wraith);
		}
	 
	 void Yurei(String e1, String e2) {
			HashSet <String> yurei = new HashSet <String>();
			yurei.add("GHOST ORB");
			yurei.add("FREEZING TEMPERATURES");
			yurei.add("DOTS PROJECTOR");
			
			if(yurei.contains(e1)) {
				yurei.remove(e1);
			}
			if(yurei.contains(e2)) {
				yurei.remove(e2);
			}
			System.out.println("The remaining evidence required for Yurei is: " + yurei);
		}
	 
	 void voodooDoll() {
		 System.out.println("Regarding VOODOO DOLLS");
		 System.out.println("Interacting with the voodoo doll will cause one of the 10 pins stuck in the doll to be pushed into it at random. This will cause the ghost to perform an interaction, and will drop the user's sanity by 5%. These forced interactions can include evidence sources past EMF Level 5, such as making the ghost interact with Ghost Writing Books, create silhouettes in D.O.T.S. Projectors, and touch doors, windows, and light switches for Fingerprints.\r\n"
		 		+ "\r\n"
		 		+ "If the heart pin is pressed down, the user's sanity will drop by 10%, and the ghost will initiate a cursed hunt. Additionally, if the user's sanity is less than the sanity that the pressed pin would drain, all remaining pins will also get pushed in and a cursed hunt will also occur. ");
		}
	 
	 void hauntedMirror() {
		 System.out.println("Regarding the HAUNTED MIRROR");
		 System.out.println("The mirror must be toggled while inside the investigation area. When activated, the haunted mirror will show a view of a part of the ghost room as a sweeping panorama, allowing players to locate the room by cross-reference. This view is a live feed of the room, so any lights turned on, items moved, and equipment or players present in the room will be visible. The only exception is if the player using the mirror is within its view; neither the player nor the mirror will be visible.\r\n"
		 		+ "\r\n"
		 		+ "Using the haunted mirror will rapidly drain the sanity of the player at a rate of about 7.5%/s or 10%/s,[verify] including the animation of raising and lowering the mirror. If the user's sanity reaches zero, the mirror will break, and the ghost will start a cursed hunt from its current position. When the mirror breaks, the front of the mirror will become smashed, and a cracking noise will be emitted. ");
	 }
	 
	 void musicBox() {
		 System.out.println("Regarding the MUSIC BOX");
		 System.out.println("The music box will make the ghost sing along while remaining invisible, broadcasting its location. If the music box is 5 meters or less from the ghost, it will manifest and start walking towards the box. If the ghost touches the player holding the box, walks for more than 5 seconds, or the box is dropped while the tune is playing, the music box will stop and the ghost will initiate a cursed hunt. If the player reaches 0% sanity or the ghost decides to hunt naturally (i.e., unrelated to the music box), a normal hunt will occur instead. The music box can be handheld or placed on the floor, the latter being the only safe way to discard the box without triggering a cursed hunt while it's playing. In all cases, the box will close once it stops playing.\r\n"
		 		+ "\r\n"
		 		+ "Listening to the music will drop the player's sanity. A player holding the music box and listening to the complete song loses approximately 75% of their sanity. A player's sanity will drop only if the player can hear the song, and the sanity drop decreases the further a player is from the music box. This applies to all players regardless of whether they were the one to activate the music box.");
	 }
	 
	 void ouijaBoard() {
		 System.out.println("Regarding the OUIJA BOARD");
		 System.out.println("The Ouija Board can be activated by holding left click on it, or toggling it directly if holding the board. Once activated, the planchette will appear. This will also cancel the setup phase if it is ongoing. The Ouija Board will then respond to voice input within 3 metres of it. The player asking the question must be within the investigation area to ask questions. The Ouija Board does not have to be in the ghost room (nor the ghost's current room) to relay responses.\r\n"
		 		+ "\r\n"
		 		+ "To deactivate the Ouija Board, any nearby player must say \"Goodbye\", which will make the planchette disappear. If the player who activated the board walks away from an active Ouija Board, or the player currently asking questions or saying goodbye has insufficient sanity to \"pay\" for the question, the board will burn and break itself up, activating a cursed hunt. ");
	 }
	 
	 void tarotCards() {
		 System.out.println("Regarding the TAROT CARDS");
		 System.out.println("Tarot cards can be picked up and one card can be drawn at a time. Each Tarot cards deck contains 10 randomly generated cards. There are various possible cards the player can draw from the deck, each having a unique effect on either the player or the ghost. After being used, each card will burn up and vanish in a colored flame that is dependent on its type. The cards must be drawn inside the investigation area for them to work.\r\n"
		 		+ "\r\n"
		 		+ "There are 10 possible cards that can be drawn. A single card type can appear more than once in the deck, and various card types have different, independent chances to be drawn. The following table lists all cards that can be drawn: ");
	 }
	 
	 void summoningCircle() {
		 System.out.println("Regarding the SUMMONING CIRCLE");
		 System.out.println("The summoning circle can be used by lighting all five red candles with a lighter. Each candle deducts 16% sanity for nearby players, leading to a total of 80% being deducted for all candles. Summoning circle candles can extinguish after a while or be blown out by the ghost, in the same way as regular candles. Once all five candles are lit, the ghost is summoned and fully materialized, except a Shade, which has a chance[verify] of appearing as a transparent shadow. The summoned ghost stays motionless for about 5[verify] seconds, unable to kill players. This stationary period is considered a ghost event. However, the front door will lock immediately after lighting the last candle. After this \"grace period\", it immediately initiates a cursed hunt on the spot, without the additional 1 second grace period. Once the summoning circle is activated, it cannot be used again. ");
	 }
	 
	 
	 
	}



