package com.niemiec.games.battleship.command.game;

import com.niemiec.chat.messages.game.battleship.BattleshipGameInterface;

import javafx.event.ActionEvent;

public class ShooterMovement implements BattleshipGameInterface {
	private String opponentPlayerNick;
	private ActionEvent event;

	public ShooterMovement(String opponentPlayerNick, ActionEvent event) {
		this.opponentPlayerNick = opponentPlayerNick;
		this.event = event;
	}

	public String getOpponentPlayerNick() {
		return opponentPlayerNick;
	}

	public ActionEvent getEvent() {
		return event;
	}
}
