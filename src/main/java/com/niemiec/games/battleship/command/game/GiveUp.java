package com.niemiec.games.battleship.command.game;

import com.niemiec.chat.messages.game.battleship.BattleshipGameInterface;

public class GiveUp implements BattleshipGameInterface {
	public static final int GIVE_UP = 0;
	public static final int CANCEL = 1;
	
	private String opponentPlayerNick;
	private int resignation;

	public GiveUp(String opponentPlayerNick, int resignation) {
		this.opponentPlayerNick = opponentPlayerNick;
		this.resignation = resignation;
	}

	public String getOpponentPlayerNick() {
		return opponentPlayerNick;
	}

	public int getResignation() {
		return resignation;
	}
}
