package com.boni.spacerocks

import com.badlogic.gdx.scenes.scene2d.Stage

class Thrusters(x: Float, y: Float, stage: Stage) : BaseActor(x, y, stage) {
    init {
        loadTexture("fire.png")
    }
}