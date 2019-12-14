package com.boni.spacerocks

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.scenes.scene2d.Stage

class SpaceShip(x: Float, y: Float, stage: Stage) : BaseActor(x, y, stage) {

    private var thrusters: Thrusters = Thrusters(0f, 0f, stage)

    init {
        loadTexture("spaceship.png")
        setBoundaryPolygon(8)

        setAcceleration(200f)
        setMaxSpeed(100f)
        setDeceleration(10f)

        addActor(thrusters)
        thrusters.setPosition(-thrusters.width, height * .5f - thrusters.height * .5f)
    }

    override fun act(delta: Float) {
        super.act(delta)

        val degreesPerSecond = 120

        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            rotateBy(degreesPerSecond * delta)
        }
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            rotateBy(-degreesPerSecond * delta)
        }
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            accelerateAtAngle(rotation)
            thrusters.isVisible = true
        } else {
            thrusters.isVisible = false
        }

        applyPhysics(delta)
        wrapAroundWorld()
    }
}