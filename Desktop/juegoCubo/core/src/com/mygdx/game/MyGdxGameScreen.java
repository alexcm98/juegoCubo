package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.Actores.Cubito;

/**
 * Created by alex on 12/02/2018.
 */
/*
dfdfgdfgdgfdgdfg
 */
public class MyGdxGameScreen extends  Inicio {

    private Stage stage;
    private Cubito jugador;

    public MyGdxGameScreen(MyGdxGame game) {
        super(game);
    }


    @Override
    public void show() {
       stage = new Stage();
        jugador = new Cubito();
        stage.addActor(jugador);
        jugador.setPosition(101,100);
    }


    @Override
    public void hide() {
        stage.dispose();
    }


    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,10,100,50);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
    }
}
