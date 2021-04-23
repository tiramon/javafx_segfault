package de.tiramon;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Recreate extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		WebView wv = new WebView();
		wv.setContextMenuEnabled(false);
		WebEngine we = wv.getEngine();
		String authUrl = "https://discord.com/oauth2/authorize?response_type=code&client_id=10&scope=identify&redirect_uri=https://www.blub.de/";
		we.load(authUrl);
		Scene scene = new Scene(wv, 500, 750);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
