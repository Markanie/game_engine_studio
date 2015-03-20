/**
 * This is the starting point of your game.
 * 
 * Please rename this class and the project to your own game name.
 * To rename the class and the project,
 * right click on the class or the project, and go to 'Refractor -> rename'
 * or select the project or class and press Alt+Shift+R
 * 
 * (you can delete this comment)
 */
package game;

import com.android.vissenspel.Vissenkom;

import android.content.Intent;
import android.gameengine.icadroids.engine.GameEngine;

import fallingbird.FallingBird;


public class MyAndroidGame extends GameEngine {
	
@Override
protected void initialize() {

	Intent intent = new Intent(this, FallingBird.class);
	startActivity(intent);

}

@Override
	public void update() {
		super.update();
	//put your update code here
	}

}
