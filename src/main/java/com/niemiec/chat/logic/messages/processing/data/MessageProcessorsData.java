package com.niemiec.chat.logic.messages.processing.data;

import com.niemiec.chat.data.ChatData;
import com.niemiec.chat.logic.messages.processing.CheckNickMessageProcessor;
import com.niemiec.chat.logic.messages.processing.GroupChatMessageProcessor;
import com.niemiec.chat.logic.messages.processing.PrivateMessageProcessor;
import com.niemiec.chat.logic.messages.processing.UsersListMessageProcessor;

public class MessageProcessorsData {
	private ChatData chatData;
	private CheckNickMessageProcessor checkNickMessageProcessor;
	private GroupChatMessageProcessor groupChatMessageProcessor;
	private UsersListMessageProcessor usersListMessageProcessor;
	private PrivateMessageProcessor privateMessageProcessor;

	public MessageProcessorsData(ChatData chatData) {
		this.chatData = chatData;
	}

	public CheckNickMessageProcessor getCheckNickMessageProcessor() {
		if (checkNickMessageProcessor == null) {
			checkNickMessageProcessor = new CheckNickMessageProcessor(chatData);
		}
		return checkNickMessageProcessor;
	}

	public GroupChatMessageProcessor getGroupChatMessageProcessor() {
		if (groupChatMessageProcessor == null) {
			groupChatMessageProcessor = new GroupChatMessageProcessor(chatData);
		}
		return groupChatMessageProcessor;
	}

	public UsersListMessageProcessor getUsersListMessageProcessor() {
		if (usersListMessageProcessor == null) {
			usersListMessageProcessor = new UsersListMessageProcessor(chatData);
		}
		return usersListMessageProcessor;
	}

	public PrivateMessageProcessor getPrivateMessageProcessor() {
		if (privateMessageProcessor == null) {
			privateMessageProcessor = new PrivateMessageProcessor(chatData);
		}
		return privateMessageProcessor;
	}
	
	

}
