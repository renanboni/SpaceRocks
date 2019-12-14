package com.boni.spacerocks

class SpaceGame: BaseGame() {
    override fun create() {
        super.create()
        setActiveScreen(LevelScreen())
    }
}