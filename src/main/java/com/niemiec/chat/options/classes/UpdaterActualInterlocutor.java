package com.niemiec.chat.options.classes;

import com.niemiec.chat.options.interfaces.GeneralChatOption;

public class UpdaterActualInterlocutor implements GeneralChatOption {
	private String actualInterlocutor;

	public UpdaterActualInterlocutor(String actualInterlocutor) {
		this.actualInterlocutor = actualInterlocutor;
	}

	public String getActualInterlocutor() {
		return actualInterlocutor;
	}
}
