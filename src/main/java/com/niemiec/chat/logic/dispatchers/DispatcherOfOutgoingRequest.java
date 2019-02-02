package com.niemiec.chat.logic.dispatchers;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.logic.messages.dispatcher.outgoing.DispatcherOfOutgoingMessages;
import com.niemiec.chat.logic.options.dispatcher.DispatcherOfOptions;
import com.niemiec.chat.messages.Message;
import com.niemiec.chat.options.interfaces.Option;

public class DispatcherOfOutgoingRequest {
	private DispatcherOfOutgoingMessages dispatcherOfOutgoingMessages;
	private DispatcherOfOptions dispatcherOfOptions;

	public DispatcherOfOutgoingRequest(ChatData chatData) {
		dispatcherOfOutgoingMessages = new DispatcherOfOutgoingMessages(chatData);
		dispatcherOfOptions = new DispatcherOfOptions(chatData);
	}

	public void setTheCommand(Object object) {
		if (object instanceof Message) {
			dispatcherOfOutgoingMessages.setTheCommand(object);
		} else if (object instanceof Option) {
			dispatcherOfOptions.setTheCommand(object);
		}
	}

}
