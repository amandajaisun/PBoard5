package gui;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;


import javax.swing.JPanel;

import javazoom.jl.decoder.JavaLayerException;
import piano.Key;
import piano.Piano;
import piano.Sound;


/**
 * Controls the keyPressed, keyReleased, and different classes' draw methods 
 * @author Rithika, Keertana, Amanda 
 *
 */
public class GamePanel extends JPanel implements KeyListener {

	public static final int DRAWING_WIDTH = 800;
	public static final int DRAWING_HEIGHT = 600;

	
	private Key C4, CSharp, k;
	private Piano piano;
	private Sound sound, smp3;
	private String mp3;
	
	
	
	
	 public GamePanel () {
		 super();
		//C4 = new Key("C", new Sound(""), false);
		//CSharp = new Key("C#", new Sound(""), true);
		 piano = new Piano();
		 sound = new Sound("");
		 
		  setBackground(Color.WHITE);
		 
	  }
	 
	
	 
	 public void paintComponent(Graphics g)
	  {
	    super.paintComponent(g);  // Call JPanel's paintComponent method to paint the background

	    int width = getWidth();
	    int height = getHeight();
	    
	    double ratioX = (double)width/DRAWING_WIDTH;
	    double ratioY = (double)height/DRAWING_HEIGHT;
	    
	    Graphics2D g2 = (Graphics2D)g;
	    AffineTransform at = g2.getTransform();
	    g2.scale(ratioX,ratioY);
	    
	    
//	    int w = 20;
//	    int h = 300;
//	    C4.draw(g, w, h);
//	    CSharp.draw(g, w+15, h);
	    
	    piano.draw(g);
	    
	    g2.setTransform(at);
	  }
	 
	 public void run() {
		  	while(true) {

		  		// SHOW THE CHANGE
		  		
		  		repaint();
		  		
		  		//paintComponent()
		  		
		  		
		  		// WAIT
		  		try {
					Thread.sleep(16);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		  		
		  	}
		  }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//not checking that key's pressed
		
		mp3 = "";
		
		if (e.getKeyCode() == KeyEvent.VK_S) {
			piano.getOctaveKey(0).keyPressed();
			k = piano.getOctaveKey(0);
			mp3 = k.getLetter() + ".mp3";
					
		} 
		if (e.getKeyCode() == KeyEvent.VK_D) {
			piano.getOctaveKey(1).keyPressed();
			k = piano.getOctaveKey(1);
			mp3 = k.getLetter() + ".mp3";
		} 
		if (e.getKeyCode() == KeyEvent.VK_F) {
			piano.getOctaveKey(2).keyPressed();
			k = piano.getOctaveKey(2);
			mp3 = k.getLetter() + ".mp3";
		} 
		if (e.getKeyCode() == KeyEvent.VK_G) {
			piano.getOctaveKey(3).keyPressed();
			k = piano.getOctaveKey(3);
			mp3 = k.getLetter() + ".mp3";
		} 
		if (e.getKeyCode() == KeyEvent.VK_H) {
			piano.getOctaveKey(4).keyPressed();
			k = piano.getOctaveKey(4);
			mp3 = k.getLetter() + ".mp3";
		} 
		if (e.getKeyCode() == KeyEvent.VK_J) {
			piano.getOctaveKey(5).keyPressed();
			k = piano.getOctaveKey(5);
			mp3 = k.getLetter() + ".mp3";
		} 
		if (e.getKeyCode() == KeyEvent.VK_K) {
			piano.getOctaveKey(6).keyPressed();
			k = piano.getOctaveKey(6);
			mp3 = k.getLetter() + ".mp3";
		} 
		if (e.getKeyCode() == KeyEvent.VK_L) {
			piano.getOctaveKey(7).keyPressed();
			k = piano.getOctaveKey(7);
			mp3 = k.getLetter() + ".mp3";
		} 
		
		
		if (e.getKeyCode() == KeyEvent.VK_E) {
			piano.getSharpsKey(0).keyPressed();
			k = piano.getSharpsKey(0);
			mp3 = k.getLetter() + ".mp3";
		} 
		if (e.getKeyCode() == KeyEvent.VK_R) {
			piano.getSharpsKey(1).keyPressed();
			k = piano.getSharpsKey(1);
			mp3 = k.getLetter() + ".mp3";
		}
		if (e.getKeyCode() == KeyEvent.VK_Y) {
			piano.getSharpsKey(2).keyPressed();
			k = piano.getSharpsKey(2);
			mp3 = k.getLetter() + ".mp3";
		}
		if (e.getKeyCode() == KeyEvent.VK_U) {
			piano.getSharpsKey(3).keyPressed();
			k = piano.getSharpsKey(3);
			mp3 = k.getLetter() + ".mp3";
		}
		if (e.getKeyCode() == KeyEvent.VK_I) {
			piano.getSharpsKey(4).keyPressed();
			k = piano.getSharpsKey(4);
			mp3 = k.getLetter() + ".mp3";
		}
		
		
	    
	   // System.out.println("mp3 :" + mp3);
	    try {
			sound.playSound(mp3);
		} catch (JavaLayerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_S) {
			piano.getOctaveKey(0).keyReleased();	
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			piano.getOctaveKey(1).keyReleased();
		} 
		if (e.getKeyCode() == KeyEvent.VK_F) {
			piano.getOctaveKey(2).keyReleased();
		} 
		if (e.getKeyCode() == KeyEvent.VK_G) {
			piano.getOctaveKey(3).keyReleased();
		} 
		if (e.getKeyCode() == KeyEvent.VK_H) {
			piano.getOctaveKey(4).keyReleased();
		} 
		if (e.getKeyCode() == KeyEvent.VK_J) {
			piano.getOctaveKey(5).keyReleased();
		} 
		if (e.getKeyCode() == KeyEvent.VK_K) {
			piano.getOctaveKey(6).keyReleased();
		} 
		if (e.getKeyCode() == KeyEvent.VK_L) {
			piano.getOctaveKey(7).keyReleased();
		} 
		
		
		if (e.getKeyCode() == KeyEvent.VK_E) {
			piano.getSharpsKey(0).keyReleased();
		}
		if (e.getKeyCode() == KeyEvent.VK_R) {
			piano.getSharpsKey(1).keyReleased();
		}
		if (e.getKeyCode() == KeyEvent.VK_Y) {
			piano.getSharpsKey(2).keyReleased();
		}
		if (e.getKeyCode() == KeyEvent.VK_U) {
			piano.getSharpsKey(3).keyReleased();
		}
		if (e.getKeyCode() == KeyEvent.VK_I) {
			piano.getSharpsKey(4).keyReleased();
		}
		
		
	}

	
	
}
