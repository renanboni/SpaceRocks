package com.boni.spacerocks

import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.actions.Actions

class Rock(x: Float, y: Float, stage: Stage) : BaseActor(x, y, stage) {
    init {
        loadTexture("rock.png")
        val random = MathUtils.random(30f)

        addAction(Actions.forever(Actions.rotateBy(30 + random , 1f)))

        setSpeed(50 + random)
        setMaxSpeed(50 + random)
        setDeceleration(0f)
    }

    override fun act(delta: Float) {
        super.act(delta)
        applyPhysics(delta)
        wrapAroundWorld()
    }
}