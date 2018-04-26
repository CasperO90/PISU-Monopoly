package monopoly.mini;

import java.util.ArrayList;
import java.util.List;

import monopoly.mini.model.Card;
import monopoly.mini.model.Chance;
import monopoly.mini.model.Game;
import monopoly.mini.model.Property;
import monopoly.mini.model.ReadText;
import monopoly.mini.model.Space;
import monopoly.mini.model.Tax;
import monopoly.mini.model.cards.CardMoveToSpace;
import monopoly.mini.model.cards.CardMoveSpaces;
import monopoly.mini.model.cards.CardReceiveMoneyFromBank;
import monopoly.mini.model.cards.CardPayMoneyToBank;
import monopoly.mini.model.cards.PayTax;
import monopoly.mini.model.properties.Utility;

/**
 * Main class for setting up and running a (Mini-)Monoploy game.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class MiniMonopoly {
	
	/**
	 * Creates the initial static situation of a Monopoly game. Note
	 * that the players are not created here, and the chance cards
	 * are not shuffled here.
	 * 
	 * @return the initial game board and (not shuffled) deck of chance cards 
	 */
	
	public static Game createGame() {

		// Create the initial Game set up (note that, in this simple
		// setup, we use only 11 spaces). Note also that this setup
		// could actually be loaded from a file or database instead
		// of creating it programmatically.
		Game game = new Game();
	//Implementering af felterne @Elisa
		String [] guiMessages = ReadText.file("fields.txt");
		
		
		Space go = new Space();
		go.setName(guiMessages[0]);
		game.addSpace(go);
		
		Property p = new Property();
		p.setName(guiMessages[1]);
		p.setCost(60);
		p.setRent(5);
		game.addSpace(p);
		
		Chance chance = new Chance();
		chance.setName(guiMessages[2]);
		game.addSpace(chance);
		
		p = new Property();
		p.setName(guiMessages[3]);
		p.setCost(60);
		p.setRent(5);
		game.addSpace(p);
		
		Tax t = new Tax();
		t.setName(guiMessages[4]);
		game.addSpace(t);

		Utility s = new Utility();
		s.setName(guiMessages[5]);
		s.setCost(200);
		s.setRent(20);
		game.addSpace(s);

		p = new Property();
		p.setName(guiMessages[6]);
		p.setCost(100);
		p.setRent(10);
		game.addSpace(p);
		
		chance = new Chance();
		chance.setName(guiMessages[7]);
		game.addSpace(chance);
		
		p = new Property();
		p.setName(guiMessages[8]);
		p.setCost(100);
		p.setRent(10);
		game.addSpace(p);
		
		p = new Property();
		p.setName(guiMessages[9]);
		p.setCost(120);
		p.setRent(12);
		game.addSpace(p);
		
		Space prison = new Space();
		prison.setName(guiMessages[10]);
		game.addSpace(prison);
		
		p = new Property();
		p.setName(guiMessages[11]);
		p.setCost(140);
		p.setRent(14);
		game.addSpace(p);
		
		p = new Property();
		p.setName(guiMessages[13]);
		p.setCost(140);
		p.setRent(14);
		game.addSpace(p);
		
		Utility k = new Utility();
		k.setName(guiMessages[12]);
		k.setCost(150);
		k.setRent(15);
		game.addSpace(k);
		
		p = new Property();
		p.setName(guiMessages[14]);
		p.setCost(160);
		p.setRent(16);
		game.addSpace(p);
		
		Utility l = new Utility();
		l.setName(guiMessages[15]);
		l.setCost(200);
		l.setRent(20);
		game.addSpace(l);
		
		p = new Property();
		p.setName(guiMessages[16]);
		p.setCost(180);
		p.setRent(18);
		game.addSpace(p);
		
		chance = new Chance();
		chance.setName(guiMessages[17]);
		game.addSpace(chance);
		
		p = new Property();
		p.setName(guiMessages[18]);
		p.setCost(180);
		p.setRent(18);
		game.addSpace(p);
		
		
		p = new Property();
		p.setName(guiMessages[19]);
		p.setCost(200);
		p.setRent(20);
		game.addSpace(p);
		
		Space parking = new Space();
		parking.setName(guiMessages[20]);
		game.addSpace(parking);
		
		p = new Property();
		p.setName(guiMessages[21]);
		game.addSpace(p);
		p.setCost(220);
		p.setRent(22);
		
		
		chance = new Chance();
		chance.setName(guiMessages[22]);
		game.addSpace(chance);
		
		p = new Property();
		p.setName(guiMessages[23]);
		p.setCost(220);
		p.setRent(22);
		game.addSpace(p);
		
		p = new Property();
		p.setName(guiMessages[24]);
		p.setCost(240);
		p.setRent(24);
		game.addSpace(p);
		
		Utility m = new Utility();
		m.setName(guiMessages[25]);
		m.setCost(200);
		m.setRent(20);
		game.addSpace(m);
		
		p = new Property();
		p.setName(guiMessages[26]);
		p.setCost(260);
		p.setRent(26);
		game.addSpace(p);
		
		p = new Property();
		p.setName(guiMessages[27]);
		p.setCost(260);
		p.setRent(26);
		game.addSpace(p);
		
		Utility n = new Utility();
		n.setName(guiMessages[28]);
		n.setCost(150);
		n.setRent(15);
		game.addSpace(n);
		
		p = new Property();
		p.setName(guiMessages[29]);
		p.setCost(280);
		p.setRent(28);
		game.addSpace(p);
		
		Space goToPrison = new Space();
		goToPrison.setName(guiMessages[30]);
		game.addSpace(goToPrison);
		
		
		p = new Property();
		p.setName(guiMessages[31]);
		p.setCost(300);
		p.setRent(30);
		game.addSpace(p);
		
		p = new Property();
		p.setName(guiMessages[32]);
		p.setCost(300);
		p.setRent(30);
		game.addSpace(p);
		
		chance = new Chance();
		chance.setName(guiMessages[33]);
		game.addSpace(chance);
		
		p = new Property();
		p.setName(guiMessages[34]);
		p.setCost(320);
		p.setRent(32);
		game.addSpace(p);
		
		Utility h = new Utility();
		h.setName(guiMessages[35]);
		h.setCost(200);
		h.setRent(20);
		game.addSpace(h);
		

		chance = new Chance();
		chance.setName(guiMessages[36]);
		game.addSpace(chance);
		
		p = new Property();
		p.setName(guiMessages[37]);
		p.setCost(360);
		p.setRent(36);
		game.addSpace(p);
		
		Tax t2 = new Tax();
		t2.setName(guiMessages[38]);
		game.addSpace(t2);
		
		p = new Property();
		p.setName(guiMessages[39]);
		p.setCost(400);
		p.setRent(40);
		game.addSpace(p);
		
		
		
		
		
		
		
		
		
		
		//Chancekort - @Elisa, Casper d. 24/04
		// MoveToSpace er implementeret
		
		String [] chancekort = ReadText.file("funktioner.txt");
		
		List<Card> cards = new ArrayList<Card>();
		
		
		CardMoveToSpace move = new CardMoveToSpace();
		move.setTarget(game.getSpaces().get(9));
		move.setText(chancekort[17]);
		cards.add(move);
		
		CardMoveToSpace move2 = new CardMoveToSpace();
		move.setTarget(game.getSpaces().get(39));
		move.setText(chancekort[19]);
		cards.add(move2);
		
		CardMoveToSpace move3 = new CardMoveToSpace();
		move3.setTarget(game.getSpaces().get(12));
		move3.setText(chancekort[21]);
		cards.add(move3);
		
		CardMoveToSpace move4 = new CardMoveToSpace();
		move4.setTarget(game.getSpaces().get(28));
		move4.setText(chancekort[22]);
		cards.add(move4);
		
		CardMoveToSpace move5 = new CardMoveToSpace();
		move5.setTarget(game.getSpaces().get(35));
		move5.setText(chancekort[26]);
		cards.add(move5);
		
		CardMoveToSpace move6 = new CardMoveToSpace();
		move6.setTarget(game.getSpaces().get(5));
		move6.setText(chancekort[23]);
		cards.add(move6);
		
		CardMoveToSpace move7 = new CardMoveToSpace();
		move7.setTarget(game.getSpaces().get(15));
		move7.setText(chancekort[24]);
		cards.add(move7);
		
		CardMoveToSpace move8 = new CardMoveToSpace();
		move8.setTarget(game.getSpaces().get(25));
		move8.setText(chancekort[25]);
		cards.add(move8);
		
		CardMoveToSpace move9 = new CardMoveToSpace();
		move9.setTarget(game.getSpaces().get(0));
		move9.setText(chancekort[15]);
		cards.add(move9);
		
		CardMoveToSpace move10 = new CardMoveToSpace();
		move10.setTarget(game.getSpaces().get(10));
		move10.setText(chancekort[45]);
		cards.add(move10);
		
		PayTax tax = new PayTax();
		tax.setText("Pay 10% income tax!");
		cards.add(tax);
		
		CardReceiveMoneyFromBank b1 = new CardReceiveMoneyFromBank();
		b1.setText(chancekort[27]);
		b1.setAmount(50);
		cards.add(b1);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b2 = new CardReceiveMoneyFromBank();
		b2.setText(chancekort[29]);
		b2.setAmount(5);
		cards.add(b2);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b3 = new CardReceiveMoneyFromBank();
		b3.setText(chancekort[28]);
		b3.setAmount(20);
		cards.add(b3);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b4 = new CardReceiveMoneyFromBank();
		b4.setText(chancekort[30]);
		b4.setAmount(15);
		cards.add(b4);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b5 = new CardReceiveMoneyFromBank();
		b5.setText(chancekort[31]);
		b5.setAmount(20);
		cards.add(b5);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b6 = new CardReceiveMoneyFromBank();
		b6.setText(chancekort[33]);
		b6.setAmount(25);
		cards.add(b6);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b7 = new CardReceiveMoneyFromBank();
		b7.setText(chancekort[34]);
		b7.setAmount(15);
		cards.add(b7);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b8 = new CardReceiveMoneyFromBank();
		b8.setText(chancekort[35]);
		b8.setAmount(10);
		cards.add(b8);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b9 = new CardReceiveMoneyFromBank();
		b9.setText(chancekort[36]);
		b9.setAmount(5);
		cards.add(b9);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b10 = new CardReceiveMoneyFromBank();
		b10.setText(chancekort[37]);
		b10.setAmount(10);
		cards.add(b10);
		game.setCardDeck(cards);
		
		CardPayMoneyToBank p1 = new CardPayMoneyToBank();
		p1.setText(chancekort[40]);
		p1.setAmount(10);
		cards.add(p1);
		game.setCardDeck(cards);
		
		CardPayMoneyToBank p2 = new CardPayMoneyToBank();
		p2.setText(chancekort[41]);
		p2.setAmount(10);
		cards.add(p2);
		game.setCardDeck(cards);
		
		CardPayMoneyToBank p3 = new CardPayMoneyToBank();
		p3.setText(chancekort[42]);
		p3.setAmount(15);
		cards.add(p3);
		game.setCardDeck(cards);
		
		CardPayMoneyToBank p4 = new CardPayMoneyToBank();
		p4.setText(chancekort[47]);
		p4.setAmount(20);
		cards.add(p4);
		game.setCardDeck(cards);
		
		CardMoveSpaces moveS1 = new CardMoveSpaces();
		moveS1.setSpaceMove(-3);
		moveS1.setText(chancekort[16]);
		cards.add(moveS1);
		
		CardMoveSpaces moveS2 = new CardMoveSpaces();
		moveS2.setSpaceMove(+3);
		moveS2.setText(chancekort[57]);
		cards.add(moveS2);		

		return game;
	}

	/**
	 * The main method which creates a game, shuffles the chance
	 * cards, creates players, and then starts the game.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		Game game = createGame();
		game.shuffleCardDeck();
		
		GameController controller = new GameController(game);
		controller.createPlayers();
		controller.initializeGUI();
		
		controller.play();
	}

}
