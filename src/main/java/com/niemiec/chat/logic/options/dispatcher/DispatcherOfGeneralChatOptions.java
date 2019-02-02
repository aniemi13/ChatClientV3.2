package com.niemiec.chat.logic.options.dispatcher;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.logic.options.processing.data.OptionChatProcessorData;
import com.niemiec.chat.options.classes.UpdaterActualInterlocutor;

public class DispatcherOfGeneralChatOptions {
	private OptionChatProcessorData optionChatData;

	public DispatcherOfGeneralChatOptions(ChatData chatData) {
		optionChatData = chatData.getOptionChatData();
	}

	public void setTheCommand(Object object) {
		if (object instanceof UpdaterActualInterlocutor) {
			optionChatData.getUpdaterOpponentPlayerNickProcessor().setTheCommandUpdatePlayerNick(object);
		}
	}

}
