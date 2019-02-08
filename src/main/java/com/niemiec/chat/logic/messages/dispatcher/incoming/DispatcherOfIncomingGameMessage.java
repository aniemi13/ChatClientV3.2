package com.niemiec.chat.logic.messages.dispatcher.incoming;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.messages.game.battleship.BattleshipGameInterface;

public class DispatcherOfIncomingGameMessage {
	private DispatcherOfIncomingBattleshipMessage dispatcherOfIncomingBattleshipMessage;

	public DispatcherOfIncomingGameMessage(ChatData chatData) {
		dispatcherOfIncomingBattleshipMessage = new DispatcherOfIncomingBattleshipMessage(chatData);
	}

	public void receiveTheObject(Object object) {
		if (object instanceof BattleshipGameInterface) {
			dispatcherOfIncomingBattleshipMessage.receiveTheObject(object);
		}
	}

}
