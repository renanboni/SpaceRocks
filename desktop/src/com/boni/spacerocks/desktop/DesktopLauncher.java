package com.boni.spacerocks.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.boni.spacerocks.SpaceGame;
import com.boni.spacerocks.SpaceRocks;

public class DesktopLauncher {
	public static void main (String[] arg) {
		new LwjglApplication(new SpaceGame(), "Space Rocks", 800, 600);
	}
}
