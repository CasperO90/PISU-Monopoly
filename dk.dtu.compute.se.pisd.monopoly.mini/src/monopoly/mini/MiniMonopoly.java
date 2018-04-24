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
import monopoly.mini.model.cards.CardReceiveMoneyFromBank;
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
	//Alle 40 felter, lavet på den samme måde som ekkarts men med guiMessage i stedet for navn, vi ser om det virker :))
		String [] guiMessages = ReadText.file("fields.txt");
		
		
		Space go = new Space();
		go.setName(guiMessages[0]);
		game.addSpace(go);
		
		Property p = new Property();
		p.setName(guiMessages[1]);
		p.setCost(60);
		p.setRent(?);
		game.addSpace(p);
		
		Chance chance = new Chance();
		chance.setName(guiMessages[2]);
		game.addSpace(chance);
		
		p = new Property();
		p.setName(guiMessages[3]);
		p.setCost(60);
		p.setRent(?);
		game.addSpace(p);
		
		Tax t = new Tax();
		t.setName(guiMessages[4]);
		game.addSpace(t);

		Utility s = new Utility();
		s.setName(guiMessages[5]);
		s.setCost(200);
		s.setRent(?);
		game.addSpace(s);

		p = new Property();
		p.setName(guiMessages[6]);
		p.setCost(100);
		p.setRent(?);
		game.addSpace(p);
		
		chance = new Chance();
		chance.setName(guiMessages[7]);
		game.addSpace(chance);
		
		p = new Property();
		p.setName(guiMessages[8]);
		p.setCost(100);
		p.setRent(?);
		game.addSpace(p);
		
		p = new Property();
		p.setName(guiMessages[9]);
		p.setCost(120);
		p.setRent(?);
		game.addSpace(p);
		
		Space prison = new Space();
		prison.setName(guiMessages[10]);
		game.addSpace(prison);
		
		p = new Property();
		p.setName(guiMessages[11]);
		p.setCost(140);
		p.setRent(?);
		game.addSpace(p);
		
		p = new Property();
		p.setName(guiMessages[13]);
		p.setCost(140);
		p.setRent(?);
		game.addSpace(p);
		
		Utility k = new Utility();
		k.setName(guiMessages[12]);
		k.setCost(150);
		k.setRent(?);
		game.addSpace(k);
		
		p = new Property();
		p.setName(guiMessages[14]);
		p.setCost(160);
		p.setRent(?);
		game.addSpace(p);
		
		Utility l = new Utility();
		l.setName(guiMessages[15]);
		l.setCost(200);
		l.setRent(?);
		game.addSpace(l);
		
		p = new Property();
		p.setName(guiMessages[16]);
		p.setCost(180);
		p.setRent(?);
		game.addSpace(p);
		
		chance = new Chance();
		chance.setName(guiMessages[17]);
		game.addSpace(chance);
		
		p = new Property();
		p.setName(guiMessages[18]);
		p.setCost(180);
		p.setRent(?);
		game.addSpace(p);
		
		
		p = new Property();
		p.setName(guiMessages[19]);
		p.setCost(200);
		p.setRent(?);
		game.addSpace(p);
		
		Space parking = new Space();
		parking.setName(guiMessages[20]);
		game.addSpace(parking);
		
		p = new Property();
		p.setName(guiMessages[21]);
		game.addSpace(p);
		p.setCost(220);
		p.setRent(?);
		
		
		chance = new Chance();
		chance.setName(guiMessages[22]);
		game.addSpace(chance);
		
		p = new Property();
		p.setName(guiMessages[23]);
		p.setCost(220);
		p.setRent(?);
		game.addSpace(p);
		
		p = new Property();
		p.setName(guiMessages[24]);
		p.setCost(240);
		p.setRent(?);
		game.addSpace(p);
		
		Utility m = new Utility();
		m.setName(guiMessages[25]);
		m.setCost(200);
		m.setRent(?);
		game.addSpace(m);
		
		p = new Property();
		p.setName(guiMessages[26]);
		p.setCost(260);
		p.setRent(?);
		game.addSpace(p);
		
		p = new Property();
		p.setName(guiMessages[27]);
		p.setCost(260);
		p.setRent(?);
		game.addSpace(p);
		
		Utility n = new Utility();
		n.setName(guiMessages[28]);
		n.setCost(150);
		n.setRent(?);
		game.addSpace(n);
		
		p = new Property();
		p.setName(guiMessages[29]);
		p.setCost(280);
		p.setRent(?);
		game.addSpace(p);
		
		Space goToPrison = new Space();
		goToPrison.setName(guiMessages[30]);
		game.addSpace(goToPrison);
		
		p = new Property();
		p.setName(guiMessages[31]);
		p.setCost(300);
		p.setRent(?);
		game.addSpace(p);
		
		p = new Property();
		p.setName(guiMessages[32]);
		p.setCost(300);
		p.setRent(?);
		game.addSpace(p);
		
		chance = new Chance();
		chance.setName(guiMessages[33]);
		game.addSpace(chance);
		
		p = new Property();
		p.setName(guiMessages[34]);
		p.setCost(320);
		p.setRent(?);
		game.addSpace(p);
		
		Utility h = new Utility();
		h.setName(guiMessages[35]);
		h.setCost(200);
		h.setRent(?);
		game.addSpace(h);
		
		p = new Property();
		p.setName(guiMessages[36]);
		p.setCost(360);
		p.setRent(?);
		game.addSpace(p);
		
		Tax t2 = new Tax();
		t2.setName(guiMessages[37]);
		game.addSpace(t2);
		
		p = new Property();
		p.setName(guiMessages[38]);
		p.setCost(400);
		p.setRent(?);
		game.addSpace(p);
		
		
		
		
		
		
		
		
		
		
		//Chancekort, mangler
		
		List<Card> cards = new ArrayList<Card>();
		
		CardMoveToSpace move = new CardMoveToSpace();
		move.setTarget(game.getSpaces().get(9));
		move.setText("Move to All�gade!");
		cards.add(move);
		
		PayTax tax = new PayTax();
		tax.setText("Pay 10% income tax!");
		cards.add(tax);
		
		CardReceiveMoneyFromBank b = new CardReceiveMoneyFromBank();
		b.setText("You receive 100$ from the bank.");
		b.setAmount(100);
		cards.add(b);
		game.setCardDeck(cards);
		
		

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
