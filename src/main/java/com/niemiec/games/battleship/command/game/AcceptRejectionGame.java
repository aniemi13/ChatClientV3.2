package com.niemiec.games.battleship.command.game;

import com.niemiec.chat.messages.game.battleship.BattleshipGameInterface;

public class AcceptRejectionGame implements BattleshipGameInterface {
	private String opponentPlayerNick;
	
	public AcceptRejectionGame(String opponentPlayerNick) {
		this.opponentPlayerNick = opponentPlayerNick;
	}

	public String getOpponentPlayerNick() {
		return opponentPlayerNick;
	}
}
