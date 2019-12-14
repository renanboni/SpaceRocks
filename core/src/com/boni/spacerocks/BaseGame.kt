package com.boni.spacerocks

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.InputMultiplexer

abstract class BaseGame : Game() {

    init {
        game = this
    }

    override fun create() {
        Gdx.input.inputProcessor = InputMultiplexer()
    }

    companion object {
        private lateinit var game: BaseGame

        fun setActiveScreen(s: BaseScreen) {
            game.setScreen(s)
        }
    }
}