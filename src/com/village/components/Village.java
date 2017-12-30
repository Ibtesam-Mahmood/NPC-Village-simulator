package com.village.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.village.puppets.BaseActor;

public class Village extends BaseActor{

	public Village(int x, int y, int w, int h) {
		super(x, y, w, h, new Texture(Gdx.files.internal("resources/box.png")) );
	}
	
	
	
	
}
