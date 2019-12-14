package com.boni.spacerocks

class LevelScreen: BaseScreen() {

    private lateinit var spaceShip: SpaceShip

    override fun initialize() {
        val space = BaseActor(0f, 0f, mainStage).apply {
            loadTexture("space.png")
            setSize(800f, 600f)
        }
        BaseActor.setWorldBounds(space)

        spaceShip = SpaceShip(400f, 300f, mainStage)
    }

    override fun update(dt: Float) {

    }
}