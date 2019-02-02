package com.niemiec.chat.logic.messages.dispatcher.incoming;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.logic.messages.processing.data.MessageProcessorsData;
import com.niemiec.chat.messages.text.GroupMessage;
import com.niemiec.chat.messages.text.PrivateMessage;

public class DispatcherOfIncomingTextMessages {
	private MessageProcessorsData messageProcessorsData;

	public DispatcherOfIncomingTextMessages(ChatData chatData) {
		this.messageProcessorsData = chatData.getMessageProcessorsData();
	}

	public void receiveTheObject(Object object) {
		if (object instanceof GroupMessage) {
			messageProcessorsData.getGroupChatMessageProcessor().receiveTheGroupMessage(object);
		} else if (object instanceof PrivateMessage) {
			messageProcessorsData.getPrivateMessageProcessor().receiveThePrivateMessage(object);
		}
	}
}
