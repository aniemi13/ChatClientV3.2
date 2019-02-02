package com.niemiec.chat.view;

import com.niemiec.chat.logic.dispatchers.DispatcherOfOutgoingRequest;

public class ChatView {
	private GetNickView getNickView;
	private GeneralChatView generalChatView;

	public ChatView(DispatcherOfOutgoingRequest dispatcherOfOutgoingRequest) {
		getNickView = new GetNickView(dispatcherOfOutgoingRequest);
		generalChatView = new GeneralChatView(dispatcherOfOutgoingRequest);
	}

	public GetNickView getGetNickWindow() {
		return getNickView;
	}

	public GeneralChatView getGeneralChatView() {
		return generalChatView;
	}
}
