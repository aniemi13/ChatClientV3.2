package com.niemiec.chat.logic.messages.processing;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.messages.condition.UsersListMessage;

public class UsersListMessageProcessor {
	private ChatData chatData;
	private UsersListMessage usersListMessage;

	public UsersListMessageProcessor(ChatData chatData) {
		this.chatData = chatData;
	}

	public void receiveTheUsersListMessage(Object object) {
		updateUsersListMessage(object);
		viewUsersList();
	}

	private void viewUsersList() {
		chatData.getChatView().getGeneralChatView().updateUsersList(usersListMessage.getUsersArrayList());
	}

	private void updateUsersListMessage(Object object) {
		this.usersListMessage = (UsersListMessage) object;
	}

	
}
