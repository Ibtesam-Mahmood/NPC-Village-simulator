package com.village.components;

import java.util.ArrayList;
import java.util.Iterator;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.village.puppets.BaseActor;

public class Village extends BaseActor{

	private ArrayList<Villager> villagers;
	
	public Village(int x, int y, int w, int h) {
		super(x, y, w, h);
		villagers =  new ArrayList<>();
	}
	
	public void draw(Batch batch, float parentAlpha) {
		super.draw(batch, parentAlpha);
		for (Iterator<Villager> iterator = villagers.iterator(); iterator.hasNext();) {
			Villager tempVillager = (Villager) iterator.next();
			tempVillager.draw(batch, parentAlpha);
		}
	}
	
	public void act(float dt) {
		super.act(dt);
		for (Iterator<Villager> iterator = villagers.iterator(); iterator.hasNext();) {
			Villager tempVillager = (Villager) iterator.next();
			tempVillager.act(dt);
		}
	}
	
	public void addVillager(float x, float y) {
		villagers.add( new Villager(x, y, 10) );
	}
	
	
	
	
}
