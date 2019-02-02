package com.niemiec.chat.logic.options.processing.data;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.logic.options.processing.UpdaterActualInterlocutorProcessor;

public class OptionChatProcessorData {
	private ChatData chatData;

	private UpdaterActualInterlocutorProcessor updaterOpponentPlayerNickProcessor;

	public OptionChatProcessorData(ChatData chatData) {
		this.chatData = chatData;
	}

	public UpdaterActualInterlocutorProcessor getUpdaterOpponentPlayerNickProcessor() {
		if (updaterOpponentPlayerNickProcessor == null) {
			updaterOpponentPlayerNickProcessor = new UpdaterActualInterlocutorProcessor(chatData);
		}
		return updaterOpponentPlayerNickProcessor;
	}

}
