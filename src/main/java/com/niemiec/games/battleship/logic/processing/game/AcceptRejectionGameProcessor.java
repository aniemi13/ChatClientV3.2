package com.niemiec.games.battleship.logic.processing.game;

import com.niemiec.chat.data.ChatData;
import com.niemiec.games.battleship.command.game.AcceptRejectionGame;
import com.niemiec.games.battleship.manager.BattleshipGamesManager;
import com.niemiec.games.battleship.view.BattleshipView;

public class AcceptRejectionGameProcessor {
	private BattleshipGamesManager battleshipGamesManager;
	private AcceptRejectionGame acceptRejectionGame;

	public AcceptRejectionGameProcessor(ChatData chatData) {
		battleshipGamesManager = chatData.getBattleshipGamesManager();
	}

	public void setTheCommand(Object object) {
		updateAcceptRejectionGame(object);
		closeWindowWithAnUnacceptableGame();
		deleteBattleshipGame();
	}

	private void deleteBattleshipGame() {
		battleshipGamesManager.deleteBattleshipGame(acceptRejectionGame.getOpponentPlayerNick());
	}

	private void closeWindowWithAnUnacceptableGame() {
		BattleshipView view = battleshipGamesManager.getBattleshipView(acceptRejectionGame.getOpponentPlayerNick());
		view.getWindowWithAnUnacceptableGameView().close();
	}

	private void updateAcceptRejectionGame(Object object) {
		acceptRejectionGame = (AcceptRejectionGame) object;
	}

}
