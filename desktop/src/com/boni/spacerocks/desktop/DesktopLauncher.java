package com.boni.spacerocks.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.boni.spacerocks.SpaceGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		new LwjglApplication(new SpaceGame(), "Space Rocks", 800, 600);
	}
}
