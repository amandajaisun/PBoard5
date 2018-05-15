package piano;


import java.awt.Color;

import java.awt.Graphics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.awt.Graphics;

import gui.GamePanel;


import javax.swing.JPanel;
/**
 * 
 * This class draws the piano and initializes the Keys 
 * @author Rithika 
 */
public class Piano {
	
	//Key [] keys = new Key [13];
	//Key key;
	
	private Key[] octave;
	private Key[] sharps;
	private Sound s;
	
	
	
	public Piano() {
		
		Key c4 = new Key("c4", s, false);
		
		Key d = new Key("d", s, false);
		Key e = new Key("e", s, false);
		Key f = new Key("f", s, false);
		Key g = new Key("g", s, false);
		Key a = new Key("a", s, false);
		Key b = new Key("b", s, false);
		Key c5 = new Key("c5", s, false);
		
		Key cSharp = new Key("c#", s, true);
		Key dSharp = new Key("d#", s, true);
		
		Key fSharp = new Key("f#", s, true);
		Key gSharp = new Key("g#", s, true);
		Key aSharp = new Key("a#", s, true);
		
		
		Key[] octaveC = {c4,d,e,f,g,a,b,c5};
		octave = octaveC;
		
		Key[] sharpsC = {cSharp,dSharp, fSharp, gSharp, aSharp};
		sharps = sharpsC;
	}
	
	public Key getOctaveKey(int i) {
		//System.out.println(octave[i]);
		return octave[i];
	}
	
	public Key getSharpsKey(int i) {
		return sharps[i];
	}
	
	public void draw(Graphics g) {
		 int x = GamePanel.DRAWING_WIDTH/2 - 230;
		 int y = 150;
		 int width = octave[0].getWidth();
		for(int i = 0; i<octave.length; i++) {
			octave[i].draw(g, x, y);
			x+= width;
		}
		
		int x2 = 2*width/3 + GamePanel.DRAWING_WIDTH/2 - 230;
		for(int i = 0; i<2; i++) {
			sharps[i].draw(g, x2, y);
			x2+= width;
		}
		
		x2 += width;
		for(int i = 2; i<sharps.length; i++) {
			sharps[i].draw(g, x2, y);
			x2+= width;
		}
	}
	
	
	
	

}