package com.village.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.village.components.Village;

public class Game implements ApplicationListener{
	
	private Village village;
	
	private Stage stage;
	
	public void create() {
		village =  new Village(40, 40, 40, 40);
		stage =  new Stage();
		
		stage.addActor(village);
		
		village.addVillager(100,  100);
	}

	public void tick(float dt) {
		
		stage.act(dt);
		
	}
	
	public void render() {
		
		tick(Gdx.graphics.getDeltaTime());
		
    	Gdx.gl.glClearColor(0.39f, 0.79f, 0, 1);
    	Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    	
    	
    	stage.draw();
		
	}
	
	public void dispose() {
		
	}

	
	
	public void pause() {}

	public void resize(int arg0, int arg1) {}

	public void resume() {}

}
