package com.niemiec.chat.logic.messages.dispatcher.outgoing;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.messages.game.battleship.BattleshipGameInterface;

public class DispatcherOfOutgoingGameMessages {
	private DispatcherOfOutgoingBattleshipMessage dispatcherOfOutgoingBattleshipMessage;
	
	public DispatcherOfOutgoingGameMessages(ChatData chatData) {
		dispatcherOfOutgoingBattleshipMessage = new DispatcherOfOutgoingBattleshipMessage(chatData);
	}

	public void setTheCommand(Object object) {
		if (object instanceof BattleshipGameInterface) {
			dispatcherOfOutgoingBattleshipMessage.setTheCommand(object);
		}
	}

}
