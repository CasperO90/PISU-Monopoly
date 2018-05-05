package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import monopoly.mini.model.Player;

public class Player_Test {

	
			@Test
			public void test() {
					Player player = new Player();
					player.setName("Mathias");
					String resultat = "Mathias";
					assertEquals(player.getName(),resultat);
			}
			
			@Test
			public void test2() {
					Player player = new Player();
					player.setId(1);
					int resultat = 1;
					assertEquals(player.getId(),resultat);
			}
			
				
			
			@Test
			public void test3() {
				Player player = new Player();
				boolean resultat = false;
				assertEquals(player.isInPrison(),resultat);
		}
			

		
	}

