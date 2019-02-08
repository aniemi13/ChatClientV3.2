package com.niemiec.games.battleship.dispatchers;

import com.niemiec.chat.data.ChatData;
import com.niemiec.games.battleship.command.options.CloseBattleshipWindow;
import com.niemiec.games.battleship.command.options.Exit;
import com.niemiec.games.battleship.logic.processing.data.BattleshipProcessorData;

public class DispatcherOfBattleshipOption {
	private BattleshipProcessorData battleshipProcessorData;

	public DispatcherOfBattleshipOption(ChatData chatData) {
		battleshipProcessorData = chatData.getBattleshipProcessorData();
	}

	public void setTheCommand(Object object) {
		if (object instanceof CloseBattleshipWindow) {
			battleshipProcessorData.getCloseBattleshipWindowProcessor().setTheCommand(object);
		} else if (object instanceof Exit) {
			battleshipProcessorData.getExitProcessor().setTheCommand(object);
		}
	}
}
