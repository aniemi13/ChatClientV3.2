package com.niemiec.chat.logic.messages.dispatcher.incoming;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.logic.messages.processing.data.MessageProcessorsData;
import com.niemiec.chat.messages.condition.CheckNickMessage;
import com.niemiec.chat.messages.condition.UsersListMessage;

public class DispatcherOfIncomingConditionMessages {
	private MessageProcessorsData messageProcessorsData;
	
	public DispatcherOfIncomingConditionMessages(ChatData chatData) {
		this.messageProcessorsData = chatData.getMessageProcessorsData();
	}

	public void receiveTheObject(Object object) {
		if (object instanceof CheckNickMessage ) {
			messageProcessorsData.getCheckNickMessageProcessor().receiveTheCheckNickMessage(object);
		} else if (object instanceof UsersListMessage) {

			messageProcessorsData.getUsersListMessageProcessor().receiveTheUsersListMessage(object);
		}
	}

}
