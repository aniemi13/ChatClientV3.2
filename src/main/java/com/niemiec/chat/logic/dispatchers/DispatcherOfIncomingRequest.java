package com.niemiec.chat.logic.dispatchers;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.logic.messages.dispatcher.incoming.DispatcherOfIncomingMessages;
import com.niemiec.chat.messages.Message;

public class DispatcherOfIncomingRequest {
	private DispatcherOfIncomingMessages dispatcherOfIncomingMessages;

	public DispatcherOfIncomingRequest(ChatData chatData) {
		dispatcherOfIncomingMessages = new DispatcherOfIncomingMessages(chatData);
	}

	public void receiveTheObject(Object object) {
		if (object instanceof Message) {
			dispatcherOfIncomingMessages.receiveTheObject(object);
		}
	}

}
