package com.village.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.village.puppets.BaseActor;

public class Food extends BaseActor{

	public Food(float x, float y) {
		super(x, y, 5);
		setTexture( new Texture(Gdx.files.internal("resources/food.png")) );
	}

	
}
