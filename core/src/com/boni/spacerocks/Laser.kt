package com.boni.spacerocks

import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.actions.Actions

class Laser(x: Float, y: Float, stage: Stage) : BaseActor(x, y, stage) {
    init {
        loadTexture("laser.png")

        addAction(Actions.delay(1f))
        addAction(Actions.after(Actions.fadeOut(0.5f)))
        addAction(Actions.after(Actions.removeActor()))

        setSpeed(400f)
        setMaxSpeed(400f)
        setAcceleration(0f)
    }

    override fun act(delta: Float) {
        super.act(delta)
        applyPhysics(delta)
        wrapAroundWorld()
    }
}