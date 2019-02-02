package com.niemiec.chat.controllers;


import com.niemiec.chat.logic.dispatchers.DispatcherOfOutgoingRequest;
import com.niemiec.chat.messages.condition.CheckNickMessage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GetNickController {
	@FXML
	private Stage stage;

	@FXML
	private VBox mainVBox;

	@FXML
	private TextField textAreaNick;

	@FXML
	private Label informationLabel;

	@FXML
	private Button saveNickButton;

	private DispatcherOfOutgoingRequest dispatcherOfOutgoingRequest;

	private String nick = null;

	@FXML
	void saveNick(ActionEvent event) {
		getNick();
		dispatcherOfOutgoingRequest.setTheCommand(new CheckNickMessage(nick));
	}

	private void getNick() {
		nick = textAreaNick.getText();
		if (nick == null) {
			nick = "";
		}
	}

	public void setTextInformation(String info) {
		informationLabel.setText(info);
	}

	public void setDisDispatcherOfOutgoingMessages(DispatcherOfOutgoingRequest dispatcherOfOutgoingRequest) {
		this.dispatcherOfOutgoingRequest = dispatcherOfOutgoingRequest;
	}
}
