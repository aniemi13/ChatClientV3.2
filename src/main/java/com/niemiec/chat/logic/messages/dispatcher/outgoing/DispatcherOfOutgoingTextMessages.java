package com.niemiec.chat.logic.messages.dispatcher.outgoing;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.logic.messages.processing.data.MessageProcessorsData;
import com.niemiec.chat.messages.text.GroupMessage;
import com.niemiec.chat.messages.text.PrivateMessage;

public class DispatcherOfOutgoingTextMessages {
	private MessageProcessorsData messageProcessorsData;

	public DispatcherOfOutgoingTextMessages(ChatData chatData) {
		this.messageProcessorsData = chatData.getMessageProcessorsData();
	}

	public void setTheCommand(Object object) {
		if (object instanceof GroupMessage) {
			messageProcessorsData.getGroupChatMessageProcessor().setTheCommand(object);
		} else if (object instanceof PrivateMessage) {
			messageProcessorsData.getPrivateMessageProcessor().setTheCommand(object);
		}
	}

}
