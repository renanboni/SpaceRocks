package com.boni.spacerocks

import com.badlogic.gdx.scenes.scene2d.Stage

class Explosion(x: Float, y: Float, stage: Stage) : BaseActor(x, y, stage) {
    init {
        loadAnimationFromSheet("explosion.png", 6, 6, 0.03f, false)
    }

    override fun act(delta: Float) {
        super.act(delta)

        if (isAnimationFinished()) {
            remove()
        }
    }
}