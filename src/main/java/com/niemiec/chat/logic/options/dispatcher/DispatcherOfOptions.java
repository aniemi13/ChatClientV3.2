package com.niemiec.chat.logic.options.dispatcher;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.options.interfaces.GeneralChatOption;

public class DispatcherOfOptions {
	private DispatcherOfGeneralChatOptions dispatcherOfGeneralChatOptions;

	public DispatcherOfOptions(ChatData chatData) {
		dispatcherOfGeneralChatOptions = new DispatcherOfGeneralChatOptions(chatData);
	}

	public void setTheCommand(Object object) {
		if (object instanceof GeneralChatOption) {
			dispatcherOfGeneralChatOptions.setTheCommand(object);
		}
	}

}
