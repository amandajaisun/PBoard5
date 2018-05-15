package piano;


import java.awt.Graphics;
import java.io.FileInputStream;
import java.awt.*;
import javax.swing.*;
/**
 * This class sets properties of a Piano's Key object. 
 * @author rithika, amanda, and keertana
 *4/5/18 V1
 */
public class Key {
	
	private String pianoLetter;
	private Sound sound;
	private boolean isPressed;
	private boolean isBlack;
	private int width, height;
	
	
	/**
	 * Creates a piano key with a letter and sound.
	 * @param l the letter that identifies the key
	 * @param s the sound specified by the key
	 * 
	 */
	public Key(String l, Sound s, boolean isBlack) {
		pianoLetter = l;
		sound = s; 
		isPressed = false;
		this.isBlack = isBlack;
		if(isBlack) {
			width = (int) (0.5 * 75);
			height = (int) (3.5 * 75);
			//change width and height
		}
		else {
			width = (int) (0.8 *75);
			height = (int) (5.5 * 75);
			//change width and height
		}
	}
	
	
	
	/**
	 * Sets isPressed to true when this piano key is pressed
	 */
	public void keyPressed() {
		isPressed = true;
	}
	
	/**
	 * Set isPressed to false when this piano key is not pressed
	 */
	public void keyReleased() {
		isPressed = false;
	}
	
	/**
	 * Returns the identifying letter of the key.
	 * @return the letter as a String
	 */
	public String getLetter() {
		return pianoLetter;
	}
	
	/**
	 * Returns the identifying sound of the key.
	 * @return the sound as a String
	 */
	public Sound getSound() {
		return sound;
	}
	
	/**
	 * @return width of key
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * @return height of key
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Returns String version of the key.
	 * @return letter as a String
	 */
	public String toString() {
		return pianoLetter;
	}
	
	
	/**
	 * Draws one key.
	 * @param g the Graphics object the method is acting on.
	 * @param x the x-value of the key's top left corner 
	 * @param y the y-value of the key's top left corner 
	 * @post calls super.paintComponent, makes rectangle of (x,y,width, height) to draw key, 
	 * has sharp notes filled in black and normal notes filled in white, outline color of key is black.
	 */
		public void draw(Graphics g, int x, int y)  
		{

			/*
			super.paintComponent(g);
=======
			
			
			if(isPressed)
				g.setColor(Color.YELLOW);
			else if(!isBlack) 
				g.setColor(Color.WHITE);
			else
				g.setColor(Color.BLACK); 
			
			g.fillRect(x, y, width, height); 
				

			
			g.setColor(Color.BLACK); 
			g.drawRect(x, y, width, height); //black outline for each key
			
			
		
			
 
			*/
			
			if(isPressed)
				g.setColor(Color.YELLOW);
			else if(!isBlack)
				g.setColor(Color.WHITE);
			else
				g.setColor(Color.BLACK);
			g.fillRect(x, y, width, height);
			
			g.setColor(Color.BLACK);
			g.drawRect(x, y, width, height); //black outline for each key
		}
	
	
	

}
