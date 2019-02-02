package com.niemiec.chat.data;

import com.niemiec.chat.connection.Connection;
import com.niemiec.chat.logic.messages.processing.data.MessageProcessorsData;
import com.niemiec.chat.logic.options.processing.data.OptionChatProcessorData;
import com.niemiec.chat.objects.GeneralChat;
import com.niemiec.chat.objects.managers.InterlocutorsManager;
import com.niemiec.chat.view.ChatView;

public class ChatData {
	private Connection connection;
	private ChatView chatView;
	private MessageProcessorsData messageProcessorsData;
	private OptionChatProcessorData optionChatData;
	private InterlocutorsManager interlocutorsManager;
	private GeneralChat generalChat;
	private String nick;
	private String actualInterlocutor;

	public ChatData() {
		messageProcessorsData = new MessageProcessorsData(this);
		optionChatData = new OptionChatProcessorData(this);
		interlocutorsManager = new InterlocutorsManager();
		generalChat = new GeneralChat();
	}

	public void setChatView(ChatView chatView) {
		this.chatView = chatView;
	}

	public ChatView getChatView() {
		return chatView;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void sendTheObject(Object object) {
		connection.sendTheObject(object);
	}

	public MessageProcessorsData getMessageProcessorsData() {
		return messageProcessorsData;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return nick;
	}
	
	public void addMessageToGeneralChat(String message) {
		generalChat.addMessage(message);
	}
	
	public OptionChatProcessorData getOptionChatData() {
		return optionChatData;
	}

	public void setActualInterlocutor(String actualInterlocutor) {
		this.actualInterlocutor = actualInterlocutor;
	}

	public String getActualInterlocutor() {
		return actualInterlocutor;
	}

	public InterlocutorsManager getInterlocutorsManager() {
		return interlocutorsManager;
	}
}