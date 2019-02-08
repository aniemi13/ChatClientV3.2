package com.niemiec.chat.logic.messages.processing;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.messages.condition.ExitMessage;

public class ExitMessageProcessor {
	private ChatData chatData;
	private ExitMessage exitMessage;

	public ExitMessageProcessor(ChatData chatData) {
		this.chatData = chatData;
	}

	public void setTheCommandExit(Object object) {
		updateExitMessage(object);
		exitMessage.setNick(chatData.getNick());
		chatData.sendTheObject(exitMessage);
		chatData.interruptConnection();
		chatData.getChatView().getGeneralChatView().close();
		System.exit(0);
	}

	private void updateExitMessage(Object object) {
		exitMessage = (ExitMessage) object;
	}

}
