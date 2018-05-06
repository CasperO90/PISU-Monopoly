package monopoly.mini.model.exceptions;

import monopoly.mini.model.Player;
@SuppressWarnings("serial")
public class PlayerDoesntOwnAll extends Exception {

		private Player player;
		
		public PlayerDoesntOwnAll(Player player) {
			super("Player does not own all required properties");
			this.player = player;
		}

		Player getPlayer() {
			return player;
		}

	}


