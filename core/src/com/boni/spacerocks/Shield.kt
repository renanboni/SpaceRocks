package com.boni.spacerocks

import com.badlogic.gdx.scenes.scene2d.Stage
import com.badlogic.gdx.scenes.scene2d.actions.Actions

class Shield(x: Float, y: Float, stage: Stage) : BaseActor(x, y, stage) {
    init {
        loadTexture("shields.png")
        val pulse = Actions.sequence(
                Actions.scaleTo(1.05f, 1.05f, 1f),
                Actions.scaleTo(0.95f, 1.95f, 1f)
        )
        addAction(Actions.forever(pulse))
    }
}