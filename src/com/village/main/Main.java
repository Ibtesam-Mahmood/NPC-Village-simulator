package com.village.main;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {

	public static final int WIDTH = 1024;
	public static final int HEIGHT = 576;

	public static void main(String[] args) {
		Game game = new Game();
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		
		config.height = Main.HEIGHT;
		config.width = Main.WIDTH;
		config.resizable = false;

        new LwjglApplication( game , config);
	}
	

	
}
