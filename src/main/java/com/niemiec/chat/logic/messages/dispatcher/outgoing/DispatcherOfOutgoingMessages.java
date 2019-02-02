package com.niemiec.chat.logic.messages.dispatcher.outgoing;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.messages.condition.ConditionMessage;
import com.niemiec.chat.messages.game.GameMessage;
import com.niemiec.chat.messages.text.TextMessage;

public class DispatcherOfOutgoingMessages {
	private DispatcherOfOutgoingTextMessages dispatcherOfOutgoingTextMessages;
	private DispatcherOfOutgoingGameMessages dispatcherOfOutgoingGameMessages;
	private DispatcherOfOutgoingConditionMessages dispatcherOfOutgoingConditionMessages;

	public DispatcherOfOutgoingMessages(ChatData chatData) {
		dispatcherOfOutgoingTextMessages = new DispatcherOfOutgoingTextMessages(chatData);
		dispatcherOfOutgoingGameMessages = new DispatcherOfOutgoingGameMessages(chatData);
		dispatcherOfOutgoingConditionMessages = new DispatcherOfOutgoingConditionMessages(chatData);
	}

	public void setTheCommand(Object object) {
		if (object instanceof TextMessage) {
			dispatcherOfOutgoingTextMessages.setTheCommand(object);
		} else if (object instanceof GameMessage) {
			
		} else if (object instanceof ConditionMessage) {
			dispatcherOfOutgoingConditionMessages.setTheCommand(object);
		}
	}
}
