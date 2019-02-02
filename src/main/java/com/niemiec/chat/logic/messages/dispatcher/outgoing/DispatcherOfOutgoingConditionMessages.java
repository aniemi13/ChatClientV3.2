package com.niemiec.chat.logic.messages.dispatcher.outgoing;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.logic.messages.processing.data.MessageProcessorsData;
import com.niemiec.chat.messages.condition.CheckNickMessage;
import com.niemiec.chat.messages.condition.ExitMessage;

public class DispatcherOfOutgoingConditionMessages {
	private MessageProcessorsData messageProcessorsData;
	
	public DispatcherOfOutgoingConditionMessages(ChatData chatData) {
		this.messageProcessorsData = chatData.getMessageProcessorsData();
	}

	public void setTheCommand(Object object) {
		if (object instanceof CheckNickMessage) {
			messageProcessorsData.getCheckNickMessageProcessor().setTheCommandCheckNick(object);
		} else if (object instanceof ExitMessage) {
			
		}
	}
}
