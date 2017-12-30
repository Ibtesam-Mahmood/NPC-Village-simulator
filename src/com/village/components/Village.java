package com.village.components;

import java.util.ArrayList;
import java.util.Iterator;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.village.puppets.BaseActor;

public class Village extends BaseActor{

	private ArrayList<Villager> villagers;
	
	private ArrayList<Food> visableFood;
	
	public Village(int x, int y, int w, int h) {
		super(x, y, w, h);
		villagers =  new ArrayList<>();
		visableFood =  new ArrayList<>();
		
		visableFood.add( new Food(500, 500) );
	}
	
	public void draw(Batch batch, float parentAlpha) {
		super.draw(batch, parentAlpha);
		for (Iterator<Villager> iterator = villagers.iterator(); iterator.hasNext();) {
			Villager tempVillager = (Villager) iterator.next();
			tempVillager.draw(batch, parentAlpha);
		}
		
		for (Iterator<Food> iterator = visableFood.iterator(); iterator.hasNext();) {
			Food tempVillager = (Food) iterator.next();
			tempVillager.draw(batch, parentAlpha);
		}
	}
	
	public void act(float dt) {
		super.act(dt);
		for (Iterator<Villager> iterator = villagers.iterator(); iterator.hasNext();) {
			Villager tempVillager = (Villager) iterator.next();
			tempVillager.act(dt);
		}
		
		for (Iterator<Food> iterator = visableFood.iterator(); iterator.hasNext();) {
			Food tempVillager = (Food) iterator.next();
			tempVillager.act(dt);
		}
	}
	
	public void addVillager(float x, float y) {
		villagers.add( new Villager(x, y, 10) );
	}
	
	public ArrayList<Food> getVisableFood() {
		return visableFood;
	}
	
	
}
