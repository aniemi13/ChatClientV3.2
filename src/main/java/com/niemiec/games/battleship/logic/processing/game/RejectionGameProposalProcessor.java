package com.niemiec.games.battleship.logic.processing.game;

import com.niemiec.chat.data.ChatData;
import com.niemiec.games.battleship.manager.BattleshipGame;
import com.niemiec.games.battleship.manager.BattleshipGamesManager;

public class RejectionGameProposalProcessor {
	private BattleshipGamesManager battleshipGamesManager;
	private BattleshipGame battleshipGame;

	public RejectionGameProposalProcessor(ChatData chatData) {
		this.battleshipGamesManager = chatData.getBattleshipGamesManager();
	}

	public void receiveTheObject(Object object) {
		updateBattleshipGame(object);
		closeWaitingWindow();
		showWindowWithAnUnacceptableGame();
	}

	private void showWindowWithAnUnacceptableGame() {
		battleshipGamesManager.getBattleshipView(battleshipGame).getWindowWithAnUnacceptableGameView().show();
	}

	private void closeWaitingWindow() {
		battleshipGamesManager.getBattleshipView(battleshipGame).getWindowOfWaitingForConfirmationOfTheGameView().close();
	}

	private void updateBattleshipGame(Object object) {
		battleshipGame = (BattleshipGame) object;
	}

}
