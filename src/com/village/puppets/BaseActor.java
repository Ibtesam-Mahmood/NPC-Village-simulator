package com.village.puppets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.village.main.Main;


public class BaseActor extends Actor
{
    protected TextureRegion region;
	
    protected Rectangle boundary;
    protected float velocityX;
    protected float velocityY;


    public BaseActor()
    {
        super();
        region = new TextureRegion();
        boundary = new Rectangle();
        velocityX = 0;
        velocityY = 0;
    }
    
    public BaseActor(float x, float y, float w, float h)
    {
        super();
        region = new TextureRegion();
        boundary = new Rectangle();
        velocityX = 0;
        velocityY = 0;
        setPosition(x, y);
        setBounds(w, h);
        setTexture( new Texture(Gdx.files.internal("resources/box.png")) );
    }
    
    public BaseActor(float x, float y, float r)
    {
        super();
        region = new TextureRegion();
        boundary = new Rectangle();
        velocityX = 0;
        velocityY = 0;
        setPosition(x, y);
        setBounds(r*2, r*2);
        setTexture( new Texture(Gdx.files.internal("resources/circle.png")) );
    }
        
    
    public void setTexture(Texture t){
    	if(t != null)
    		region.setRegion( t );
    	else
    		System.out.println("Null Texture");
    }
    
    public void setBounds(float w, float h){
    	setWidth(w);
    	setHeight(h);
    }
    

    public void act(float dt)
    {
        super.act( dt );
        moveBy( velocityX * dt, velocityY * dt );
    }
    
    public void draw(Batch batch, float parentAlpha) {        
        super.draw(batch, parentAlpha);
        batch.draw(region, getX(), getY(), getWidth(), getHeight());
    	
    }
    
    public float getVelocityX() {
		return velocityX;
	}

	public void setVelocity(float velocityX, float velocityY) {
		this.velocityX = velocityX;
		this.velocityY = velocityY;
	}

	public float getVelocityY() {
		return velocityY;
	}
	
	public float getCenterX(){
		return getX() + getWidth()/2;
	}
	
	public float getCenterY(){
		return this.getY() + getHeight()/2;
	}

}