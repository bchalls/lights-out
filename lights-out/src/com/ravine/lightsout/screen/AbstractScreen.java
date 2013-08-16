package com.ravine.lightsout.screen;

import com.badlogic.gdx.Screen;
import com.ravine.lightsout.entity.EntityManager;

/**
 * Created with IntelliJ IDEA.
 * User: Brandon
 * Date: 8/16/13
 * Time: 1:52 PM
 */
public class AbstractScreen implements Screen {

    protected static EntityManager entityManager = EntityManager.getInstance();

    @Override
    public void render(float delta) {
        entityManager.update(delta);
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}

