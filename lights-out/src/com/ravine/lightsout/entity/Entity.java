package com.ravine.lightsout.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created with IntelliJ IDEA.
 * User: Brandon
 * Date: 8/16/13
 * Time: 1:51 PM
 */
public class Entity {
    private int x, y, width, height;
    private Texture image;
    private Animation animation;
    private TextureRegion[] frames;
    private TextureRegion curFrame;
    private String name;

    public Entity(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        width = 0;
        height = 0;
    }

    public int getX() { return  x; }
    public int getY() { return y; }
    public void setPosition(int x, int y) { this.x = x; this.y = y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y  = y; }

    public int getWidth() { return  width; }
    public int getHeight() { return  height; }
    public void setSize(int w, int h) { width = w; height = h; }
    public void setWidth(int w) { width = w; }
    public void setHeight(int h) { height = h; }

    public void addImage(String file) {
        image = new Texture(Gdx.files.internal(file));
        curFrame = new TextureRegion(image);
    }
    public void addImage(String file, int frameW, int frameH) {
        addImage(file);
        curFrame.setRegion(0, 0, frameW, frameH);
        frames = (new TextureRegion(image)).split(frameW, frameH)[0];
        animation = new Animation(0.15f, frames);
    }

    public void update(float delta) {

    }

    public void draw(SpriteBatch batch) {
        batch.draw(curFrame, x, y);
    }




}
