package com.niemiec.games.battleship.command.options;

import com.niemiec.chat.messages.game.battleship.BattleshipOptionInterface;

public class Exit implements BattleshipOptionInterface {
	private String opponentPlayerNick;
	
	public Exit(String opponentPlayerNick) {
		this.opponentPlayerNick = opponentPlayerNick;
	}

	public String getOpponentPlayerNick() {
		return opponentPlayerNick;
	}
}
