package com.Nabin.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("myFav")
public class ContraGame implements GamingConsole{
	public void up() {
		System.out.println("up");
	}
	public void down() {
		System.out.println("roll");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("fire");
	}

}
