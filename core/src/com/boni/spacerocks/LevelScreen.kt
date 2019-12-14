package com.boni.spacerocks

import com.badlogic.gdx.Input

class LevelScreen : BaseScreen() {

    private lateinit var spaceShip: SpaceShip

    override fun initialize() {
        val space = BaseActor(0f, 0f, mainStage).apply {
            loadTexture("space.png")
            setSize(800f, 600f)
        }
        BaseActor.setWorldBounds(space)

        spaceShip = SpaceShip(400f, 300f, mainStage)

        Rock(600f, 500f, mainStage)
        Rock(600f, 300f, mainStage)
        Rock(600f, 100f, mainStage)
        Rock(400f, 100f, mainStage)
        Rock(200f, 100f, mainStage)
        Rock(200f, 300f, mainStage)
        Rock(200f, 500f, mainStage)
        Rock(400f, 500f, mainStage)
    }

    override fun update(dt: Float) {
        BaseActor.getList<Rock>(mainStage).forEach {
            val rock = it as Rock

            if (rock.overlaps(spaceShip)) {
                if (spaceShip.shieldPower <= 0) {
                    Explosion(0f, 0f, mainStage).also {
                        it.centerAtActor(spaceShip)
                    }

                    spaceShip.remove()
                    spaceShip.setPosition(-1000f, -1000f)
                } else {
                    spaceShip.shieldPower -= 34
                    Explosion(0f, 0f, mainStage).also {
                        it.centerAtActor(spaceShip)
                    }
                    rock.remove()
                }
            }

            BaseActor.getList<Laser>(mainStage).forEach {
                val laser = it as Laser

                if (laser.overlaps(rock)) {
                    Explosion(0f, 0f, mainStage).also {
                        it.centerAtActor(rock)
                    }
                    laser.remove()
                    rock.remove()
                }
            }
        }
    }

    override fun keyDown(keycode: Int): Boolean {
        if (keycode == Input.Keys.X) {
            spaceShip.warp()
        }

        if (keycode == Input.Keys.SPACE) {
            spaceShip.shoot()
        }

        return false
    }
}