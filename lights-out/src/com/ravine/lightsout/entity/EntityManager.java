package com.ravine.lightsout.entity;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: Brandon
 * Date: 8/16/13
 * Time: 1:51 PM
 */
public final class EntityManager {
    private int curID = 0;
    private HashMap<Integer,Entity> entityMap;
    static private EntityManager instance;

    public EntityManager() {
        entityMap = new HashMap<Integer, Entity>();
    }

    public Entity addEntity(Entity ent) {
        entityMap.put(curID++, ent);
        return ent;
    }

    static public EntityManager getInstance() {
        if( instance == null ) {
            instance = new EntityManager();
        }
        return instance;
    }

    public void update(float delta) {
        for(Entity ent : entityMap.values()) {
            ent.update(delta);
        }
    }

    public void draw(SpriteBatch batch) {
        for(Entity ent : entityMap.values()) {
            ent.draw(batch);
        }
    }
}
