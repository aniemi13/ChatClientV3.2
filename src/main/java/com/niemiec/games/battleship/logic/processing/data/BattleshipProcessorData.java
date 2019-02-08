package com.niemiec.games.battleship.logic.processing.data;

import com.niemiec.chat.data.ChatData;
import com.niemiec.games.battleship.logic.processing.game.AcceptRejectionGameProcessor;
import com.niemiec.games.battleship.logic.processing.game.AnswerToTheGameProposalProcessor;
import com.niemiec.games.battleship.logic.processing.game.EndGameProcessor;
import com.niemiec.games.battleship.logic.processing.game.GameProposalProcessor;
import com.niemiec.games.battleship.logic.processing.game.GiveUpProcessor;
import com.niemiec.games.battleship.logic.processing.game.RejectionGameProposalProcessor;
import com.niemiec.games.battleship.logic.processing.game.ShipsAdderProcessor;
import com.niemiec.games.battleship.logic.processing.game.ShooterMovementProcessor;
import com.niemiec.games.battleship.logic.processing.options.CloseBattleshipWindowProcessor;
import com.niemiec.games.battleship.logic.processing.options.ExitProcessor;

public class BattleshipProcessorData {
	private ChatData chatData;
	private GameProposalProcessor gameProspalProcessor;
	private AnswerToTheGameProposalProcessor answerToTheGameProposalProcessor;
	private RejectionGameProposalProcessor rejectionGameProposalProcessor;
	private AcceptRejectionGameProcessor acceptRejectionGameProcessor;
	private ShipsAdderProcessor shipsAdderProcessor;
	private ShooterMovementProcessor shooterMovementProcessor;
	private EndGameProcessor endGameProcessor;
	private GiveUpProcessor giveUpProcessor;
	private CloseBattleshipWindowProcessor closeBattleshipWindowProcessor;
	private ExitProcessor exitProcessor;

	public BattleshipProcessorData(ChatData chatData) {
		this.chatData = chatData;
	}

	public GameProposalProcessor getGameProposalProcessor() {
		if (gameProspalProcessor == null) {
			gameProspalProcessor = new GameProposalProcessor(chatData);
		}
		return gameProspalProcessor;
	}

	public AnswerToTheGameProposalProcessor getAnswerToTheGameProposalProcessor() {
		if (answerToTheGameProposalProcessor == null) {
			answerToTheGameProposalProcessor = new AnswerToTheGameProposalProcessor(chatData);
		}
		return answerToTheGameProposalProcessor;
	}

	public RejectionGameProposalProcessor getRejectionGameProposalProcessor() {
		if (rejectionGameProposalProcessor == null) {
			rejectionGameProposalProcessor = new RejectionGameProposalProcessor(chatData);
		}
		return rejectionGameProposalProcessor;
	}

	public AcceptRejectionGameProcessor getAcceptRejectionGameProcessor() {
		if (acceptRejectionGameProcessor == null) {
			acceptRejectionGameProcessor = new AcceptRejectionGameProcessor(chatData);
		}
		return acceptRejectionGameProcessor;
	}

	public ShipsAdderProcessor getShipsAdderProcessor() {
		if (shipsAdderProcessor == null) {
			shipsAdderProcessor = new ShipsAdderProcessor(chatData);
		}
		return shipsAdderProcessor;
	}
	
	public ShooterMovementProcessor getShooterMovementProcessor() {
		if (shooterMovementProcessor == null) {
			shooterMovementProcessor = new ShooterMovementProcessor(chatData);
		}
		return shooterMovementProcessor;
	}

	public EndGameProcessor getEndGameProcessor() {
		if (endGameProcessor == null) {
			endGameProcessor = new EndGameProcessor(chatData);
		}
		return endGameProcessor;
	}

	public GiveUpProcessor getGiveUpProcessor() {
		if (giveUpProcessor == null) {
			giveUpProcessor = new GiveUpProcessor(chatData);
		}
		return giveUpProcessor;
	}

	public CloseBattleshipWindowProcessor getCloseBattleshipWindowProcessor() {
		if (closeBattleshipWindowProcessor == null) {
			closeBattleshipWindowProcessor = new CloseBattleshipWindowProcessor(chatData);
		}
		return closeBattleshipWindowProcessor;
	}

	public ExitProcessor getExitProcessor() {
		if (exitProcessor == null) {
			exitProcessor = new ExitProcessor(chatData);
		}
		return exitProcessor;
	}
}