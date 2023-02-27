package com.Nabin.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	public void run() {
		System.out.println("game is running "+game);
		game.up();
		game.down();		
		game.left();
		game.right();
	}

}
