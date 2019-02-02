package com.niemiec.chat.logic.messages.dispatcher.incoming;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.messages.condition.ConditionMessage;
import com.niemiec.chat.messages.game.GameMessage;
import com.niemiec.chat.messages.text.TextMessage;

public class DispatcherOfIncomingMessages {
	private DispatcherOfIncomingTextMessages dispatcherOfIncomingTextMessages;
	private DispatcherOfIncomingConditionMessages dispatcherOfIncomingConditionMessages;
	private DispatcherOfIncomingGameMessage dispatcherOfIncomingGameMessage;

	public DispatcherOfIncomingMessages(ChatData chatData) {
		dispatcherOfIncomingTextMessages = new DispatcherOfIncomingTextMessages(chatData);
		dispatcherOfIncomingConditionMessages = new DispatcherOfIncomingConditionMessages(chatData);
		dispatcherOfIncomingGameMessage = new DispatcherOfIncomingGameMessage(chatData);
	}

	public void receiveTheObject(Object object) {
		if (object instanceof TextMessage) {
			dispatcherOfIncomingTextMessages.receiveTheObject(object);
		} else if (object instanceof GameMessage) {
			dispatcherOfIncomingGameMessage.receiveTheObject(object);
		} else if (object instanceof ConditionMessage) {
			dispatcherOfIncomingConditionMessages.receiveTheObject(object);
		}
	}
}
