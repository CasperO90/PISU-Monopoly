package monopoly.mini;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import monopoly.mini.model.Card;
import monopoly.mini.model.Chance;
import monopoly.mini.model.Game;
import monopoly.mini.model.GoToJail;
import monopoly.mini.model.Player;
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
import monopoly.mini.model.cards.CardGoToJail;
import monopoly.mini.GameController;

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
		
		
		Game game = new Game();
	//Implementering af felterne @Elisa
		String [] guiMessages = ReadText.file("fields.txt");
		
		    
		List <Utility> utilities = new ArrayList<Utility>();
		List <Property> properties  = new ArrayList<Property>();
		
		
		Space go = new Space();
		go.setName(guiMessages[0]);
		game.addSpace(go);
		
		Property p1 = new Property();
		p1.setName(guiMessages[1]);
		p1.setCost(60);
		p1.setRent(5);
		p1.setColorcode(1);
		game.addSpace(p1);
		properties.add(p1);
		
		Chance chance = new Chance();
		chance.setName(guiMessages[2]);
		game.addSpace(chance);
		
		Property p2 = new Property();
		p2.setName(guiMessages[3]);
		p2.setCost(60);
		p2.setRent(5);
		p2.setColorcode(1);
		game.addSpace(p2);
		properties.add(p2);
		
		Tax t = new Tax();
		t.setName(guiMessages[4]);
		game.addSpace(t);

		Utility s = new Utility();
		s.setName(guiMessages[5]);
		s.setCost(200);
		s.setRent(20);
		s.setColorcode(11);
		game.addSpace(s);
		utilities.add(s);

		Property p3 = new Property();
		p3.setName(guiMessages[6]);
		p3.setCost(100);
		p3.setRent(10);
		p3.setColorcode(2);
		game.addSpace(p3);
		properties.add(p3);
		
		chance = new Chance();
		chance.setName(guiMessages[7]);
		game.addSpace(chance);
		
		Property p4 = new Property();
		p4.setName(guiMessages[8]);
		p4.setCost(100);
		p4.setRent(10);
		p4.setColorcode(2);
		game.addSpace(p4);
		properties.add(p4);
		
		Property p5 = new Property();
		p5.setName(guiMessages[9]);
		p5.setCost(120);
		p5.setRent(12);
		p5.setColorcode(2);
		game.addSpace(p5);
		properties.add(p5);
		
		Space prison = new Space();
		prison.setName(guiMessages[10]);
		game.addSpace(prison);
		
		Property p6 = new Property();
		p6.setName(guiMessages[11]);
		p6.setCost(140);
		p6.setRent(14);
		p6.setColorcode(3);
		game.addSpace(p6);
		properties.add(p6);
		
		Utility k = new Utility();
		k.setName(guiMessages[12]);
		k.setCost(150);
		k.setRent(15);
		k.setColorcode(12);
		game.addSpace(k);
		utilities.add(k);
		
		Property p7 = new Property();
		p7.setName(guiMessages[13]);
		p7.setCost(140);
		p7.setRent(14);
		p7.setColorcode(3);
		game.addSpace(p7);
		properties.add(p7);
		
		Property p8 = new Property();
		p8.setName(guiMessages[14]);
		p8.setCost(160);
		p8.setRent(16);
		p8.setColorcode(3);
		game.addSpace(p8);
		properties.add(p8);
		
		Utility l = new Utility();
		l.setName(guiMessages[15]);
		l.setCost(200);
		l.setRent(20);
		l.setColorcode(11);
		game.addSpace(l);
		utilities.add(l);
		
		Property p9 = new Property();
		p9.setName(guiMessages[16]);
		p9.setCost(180);
		p9.setRent(18);
		p9.setColorcode(4);
		game.addSpace(p9);
		properties.add(p9);
		
		chance = new Chance();
		chance.setName(guiMessages[17]);
		game.addSpace(chance);
		
		Property p10 = new Property();
		p10.setName(guiMessages[18]);
		p10.setCost(180);
		p10.setRent(18);
		p10.setColorcode(4);
		game.addSpace(p10);
		properties.add(p10);
		
		
		Property p11 = new Property();
		p11.setName(guiMessages[19]);
		p11.setCost(200);
		p11.setRent(20);
		p11.setColorcode(4);
		game.addSpace(p11);
		properties.add(p11);
		
		Space parking = new Space();
		parking.setName(guiMessages[20]);
		game.addSpace(parking);
		
		Property p12 = new Property();
		p12.setName(guiMessages[21]);
		game.addSpace(p12);
		p12.setCost(220);
		p12.setRent(22);
		p12.setColorcode(5);
		properties.add(p12);
		
		
		chance = new Chance();
		chance.setName(guiMessages[22]);
		game.addSpace(chance);
		
		Property p13 = new Property();
		p13.setName(guiMessages[23]);
		p13.setCost(220);
		p13.setRent(22);
		p13.setColorcode(5);
		game.addSpace(p13);
		properties.add(p13);
		
		Property p14 = new Property();
		p14.setName(guiMessages[24]);
		p14.setCost(240);
		p14.setRent(24);
		p14.setColorcode(5);
		game.addSpace(p14);
		properties.add(p14);
		
		Utility m = new Utility();
		m.setName(guiMessages[25]);
		m.setCost(200);
		m.setRent(20);
		m.setColorcode(11);
		game.addSpace(m);
		utilities.add(m);
		
		Property p15 = new Property();
		p15.setName(guiMessages[26]);
		p15.setCost(260);
		p15.setRent(26);
		p15.setColorcode(6);
		game.addSpace(p15);
		properties.add(p15);
		
		Property p16 = new Property();
		p16.setName(guiMessages[27]);
		p16.setCost(260);
		p16.setRent(26);
		p16.setColorcode(6);
		game.addSpace(p16);
		properties.add(p16);
		
		Utility n = new Utility();
		n.setName(guiMessages[28]);
		n.setCost(150);
		n.setRent(15);
		n.setColorcode(12);
		game.addSpace(n);
		utilities.add(n);
		
		Property p17 = new Property();
		p17.setName(guiMessages[29]);
		p17.setCost(280);
		p17.setRent(28);
		p17.setColorcode(6);
		game.addSpace(p17);
		properties.add(p17);
		
		Space goToJail = new GoToJail();
		goToJail.setName(guiMessages[30]);
		game.addSpace(goToJail);
		
		
		Property p18 = new Property();
		p18.setName(guiMessages[31]);
		p18.setCost(300);
		p18.setRent(30);
		p18.setColorcode(7);
		game.addSpace(p18);
		properties.add(p18);
		
		Property p19 = new Property();
		p19.setName(guiMessages[32]);
		p19.setCost(300);
		p19.setRent(30);
		p19.setColorcode(7);
		game.addSpace(p19);
		properties.add(p19);
		
		chance = new Chance();
		chance.setName(guiMessages[33]);
		game.addSpace(chance);
		
		Property p20 = new Property();
		p20.setName(guiMessages[34]);
		p20.setCost(320);
		p20.setRent(32);
		p20.setColorcode(7);
		game.addSpace(p20);
		properties.add(p20);
		
		Utility h = new Utility();
		h.setName(guiMessages[35]);
		h.setCost(200);
		h.setRent(20);
		h.setColorcode(11);
		game.addSpace(h);
		utilities.add(h);
	
		chance = new Chance();
		chance.setName(guiMessages[36]);
		game.addSpace(chance);
		
		Property p21 = new Property();
		p21.setName(guiMessages[37]);
		p21.setCost(360);
		p21.setRent(36);
		p21.setColorcode(8);
		game.addSpace(p21);
		properties.add(p21);
		
		Tax t2 = new Tax();
		t2.setName(guiMessages[38]);
		game.addSpace(t2);
		
		Property p22 = new Property();
		p22.setName(guiMessages[39]);
		p22.setCost(400);
		p22.setRent(40);
		p22.setColorcode(8);
		game.addSpace(p22);
		properties.add(p22);
		
		//Chancekort - @Elisa, Casper
		
		String [] chancekort = ReadText.file("funktioner.txt");
		
		List<Card> cards = new ArrayList<Card>();
		
		//Kort der flytter dig til et bestemt felt
		
		CardMoveToSpace move = new CardMoveToSpace();
		move.setTarget(game.getSpaces().get(9));
		move.setText(chancekort[7]);
		cards.add(move);
		
		CardMoveToSpace move2 = new CardMoveToSpace();
		move2.setTarget(game.getSpaces().get(39));
		move2.setText(chancekort[8]);
		cards.add(move2);
		
		CardMoveToSpace move3 = new CardMoveToSpace();
		move3.setTarget(game.getSpaces().get(12));
		move3.setText(chancekort[9]);
		cards.add(move3);
		
		CardMoveToSpace move4 = new CardMoveToSpace();
		move4.setTarget(game.getSpaces().get(28));
		move4.setText(chancekort[10]);
		cards.add(move4);
		
		CardMoveToSpace move5 = new CardMoveToSpace();
		move5.setTarget(game.getSpaces().get(35));
		move5.setText(chancekort[14]);
		cards.add(move5);
		
		CardMoveToSpace move6 = new CardMoveToSpace();
		move6.setTarget(game.getSpaces().get(5));
		move6.setText(chancekort[11]);
		cards.add(move6);
		
		CardMoveToSpace move7 = new CardMoveToSpace();
		move7.setTarget(game.getSpaces().get(15));
		move7.setText(chancekort[12]);
		cards.add(move7);
		
		CardMoveToSpace move8 = new CardMoveToSpace();
		move8.setTarget(game.getSpaces().get(25));
		move8.setText(chancekort[13]);
		cards.add(move8);
		
		CardMoveToSpace move9 = new CardMoveToSpace();
		move9.setTarget(game.getSpaces().get(0));
		move9.setText(chancekort[5]);
		cards.add(move9);
		
		//Fængselskort
		CardMoveToSpace move10 = new CardMoveToSpace();
		move10.setTarget(game.getSpaces().get(30));
		move10.setText(chancekort[30]);
		cards.add(move10);
		
		//Kort- betal skat
		
		PayTax tax = new PayTax();
		tax.setText("Betal 10% i skat!");
		cards.add(tax);
		
		//Kort hvor du får penge fra banken
		CardReceiveMoneyFromBank b1 = new CardReceiveMoneyFromBank();
		b1.setText(chancekort[15]);
		b1.setAmount(50);
		cards.add(b1);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b2 = new CardReceiveMoneyFromBank();
		b2.setText(chancekort[17]);
		b2.setAmount(5);
		cards.add(b2);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b3 = new CardReceiveMoneyFromBank();
		b3.setText(chancekort[16]);
		b3.setAmount(20);
		cards.add(b3);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b4 = new CardReceiveMoneyFromBank();
		b4.setText(chancekort[18]);
		b4.setAmount(15);
		cards.add(b4);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b5 = new CardReceiveMoneyFromBank();
		b5.setText(chancekort[19]);
		b5.setAmount(20);
		cards.add(b5);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b6 = new CardReceiveMoneyFromBank();
		b6.setText(chancekort[20]);
		b6.setAmount(25);
		cards.add(b6);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b7 = new CardReceiveMoneyFromBank();
		b7.setText(chancekort[21]);
		b7.setAmount(15);
		cards.add(b7);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b8 = new CardReceiveMoneyFromBank();
		b8.setText(chancekort[22]);
		b8.setAmount(10);
		cards.add(b8);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b9 = new CardReceiveMoneyFromBank();
		b9.setText(chancekort[23]);
		b9.setAmount(5);
		cards.add(b9);
		game.setCardDeck(cards);
		
		CardReceiveMoneyFromBank b10 = new CardReceiveMoneyFromBank();
		b10.setText(chancekort[24]);
		b10.setAmount(10);
		cards.add(b10);
		game.setCardDeck(cards);
		
		//Kort hvor du skal betale til banken
		
		CardPayMoneyToBank pay1 = new CardPayMoneyToBank();
		pay1.setText(chancekort[27]);
		pay1.setAmount(10);
		cards.add(pay1);
		game.setCardDeck(cards);
		
		CardPayMoneyToBank pay2 = new CardPayMoneyToBank();
		pay2.setText(chancekort[26]);
		pay2.setAmount(10);
		cards.add(pay2);
		game.setCardDeck(cards);
		
		CardPayMoneyToBank pay3 = new CardPayMoneyToBank();
		pay3.setText(chancekort[28]);
		pay3.setAmount(15);
		cards.add(pay3);
		game.setCardDeck(cards);
		
		CardPayMoneyToBank pay4 = new CardPayMoneyToBank();
		pay4.setText(chancekort[32]);
		pay4.setAmount(20);
		cards.add(pay4);
		game.setCardDeck(cards);
		
		CardMoveSpaces moveS1 = new CardMoveSpaces();
		moveS1.setSpaceMove(-3);
		moveS1.setText(chancekort[6]);
		cards.add(moveS1);
		
		CardMoveSpaces moveS2 = new CardMoveSpaces();
		moveS2.setSpaceMove(+3);
		moveS2.setText(chancekort[42]);
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
