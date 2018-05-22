package gui;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;


import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.Timer;

import javazoom.jl.decoder.JavaLayerException;
import piano.Key;
import piano.KeyStrokes;
import piano.Piano;
import piano.Recorder;
import piano.Sound;


/**
 * Controls the keyPressed, keyReleased, and different classes' draw methods 
 * @author Rithika, Keertana, Amanda 
 *
 */
public class GamePanel extends JPanel implements KeyListener, ActionListener{

	public static final int DRAWING_WIDTH = 800;
	public static final int DRAWING_HEIGHT = 600;
	private Image background;

	
	private Key  k;
	private ArrayList<Key> keys;
	private Piano piano;
	private Sound sound;
	private String mp3;
	private int numKeysPressed, x, y;
	private Recorder r;
	private Timer timer;
	private Main m;
	private JButton record, stop, replay;
	KeyStrokes strokes;
	private boolean isRecording;
	
	
	
	 public GamePanel (Main m) {
		 super();
		 this.m =m;

		 isRecording = false;

//		 setLayout(null);
		 SpringLayout layout = new SpringLayout();
		 setLayout(layout);
		 record = new JButton("RECORD");
		 layout.putConstraint(SpringLayout.WEST, record,
                5,
                 SpringLayout.WEST, this);
		 	Font font = new Font("Sans", Font.BOLD, 20);
			
			record.setFont(font);
			add(record);
			record.addActionListener(this);
			record.setFocusable(false);
			
			stop = new JButton("STOP");
			stop.setFont(font);
			add(stop);
			stop.addActionListener(this);
			stop.setFocusable(false);
			
			 layout.putConstraint(SpringLayout.EAST, stop,
	                 -5,
	                 SpringLayout.EAST, this);
			 
			 
			 replay = new JButton("REPLAY");
			 replay.setFont(font);
				add(replay);
				replay.addActionListener(this);
				replay.setFocusable(false);
				
				 layout.putConstraint(SpringLayout.SOUTH, replay,
		                 5,
		                 SpringLayout.SOUTH, this);
			 
		 
		 piano = new Piano();
		 sound = new Sound("");
		 keys= new ArrayList<Key>();
		 numKeysPressed = 0;
		 background = (new ImageIcon("pianoBckgrd.png")).getImage();
		 x = 30;
		 y = 50;
		 r = new Recorder(4);
		 
		 
//		 ActionListener taskPerformer = new ActionListener() {
//			 public void actionPerformed(ActionEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//		 };
//		 timer = new Timer(16000, taskPerformer);
//		 timer.start();
//		 
		  setBackground(Color.WHITE);
		 //run();
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
	  
	    g.drawImage(background, 0, 0, DRAWING_WIDTH, DRAWING_HEIGHT, this);
	    
	    if (numKeysPressed != 0 && keys != null) {
	    		g.setColor(Color.WHITE);
	    		g.drawString(keys.toString(), x, y);
	  
	    }
	   
	    piano.draw(g);
	    
	    g2.setTransform(at);
	    
//	    run();
	  }
	 
	 public void run() {
		  	while(true) {

		  		// SHOW THE CHANGE
		  		
		  		repaint();
		  		
		  		
		  		
		  		// WAIT
		  		try {
					Thread.sleep(16);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		  		
		  	}
		  }


	public void keyTyped(KeyEvent e) {
	
	}

	public void keyPressed(KeyEvent e) {
		//not checking that key's pressed
		//run();
		
		
		if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
	  		m.changePanel("1");//RS
	  	
	  	}
		
		mp3 = "";
		
		if (e.getKeyCode() == KeyEvent.VK_S) {
			piano.getOctaveKey(0).keyPressed();
			k = piano.getOctaveKey(0);
			mp3 = k.getPianoLetter() + ".mp3";
			keys.add(k);
			numKeysPressed += 1;	
			//x+= 5;
		} 
		if (e.getKeyCode() == KeyEvent.VK_D) {
			piano.getOctaveKey(1).keyPressed();
			k = piano.getOctaveKey(1);
			mp3 = k.getPianoLetter() + ".mp3";
			keys.add(k);
			numKeysPressed += 1;	
		} 
		if (e.getKeyCode() == KeyEvent.VK_F) {
			piano.getOctaveKey(2).keyPressed();
			k = piano.getOctaveKey(2);
			mp3 = k.getPianoLetter() + ".mp3";
			keys.add(k);
			numKeysPressed += 1;	
		} 
		if (e.getKeyCode() == KeyEvent.VK_G) {
			piano.getOctaveKey(3).keyPressed();
			k = piano.getOctaveKey(3);
			mp3 = k.getPianoLetter() + ".mp3";
			keys.add(k);
			numKeysPressed += 1;	
		} 
		if (e.getKeyCode() == KeyEvent.VK_H) {
			piano.getOctaveKey(4).keyPressed();
			k = piano.getOctaveKey(4);
			mp3 = k.getPianoLetter() + ".mp3";
			keys.add(k);
			numKeysPressed += 1;	
		} 
		if (e.getKeyCode() == KeyEvent.VK_J) {
			piano.getOctaveKey(5).keyPressed();
			k = piano.getOctaveKey(5);
			mp3 = k.getPianoLetter() + ".mp3";
			keys.add(k);
			numKeysPressed += 1;	
		} 
		if (e.getKeyCode() == KeyEvent.VK_K) {
			piano.getOctaveKey(6).keyPressed();
			k = piano.getOctaveKey(6);
			mp3 = k.getPianoLetter() + ".mp3";
			keys.add(k);
			numKeysPressed += 1;	
		} 
		if (e.getKeyCode() == KeyEvent.VK_L) {
			piano.getOctaveKey(7).keyPressed();
			k = piano.getOctaveKey(7);
			mp3 = k.getPianoLetter() + ".mp3";
			keys.add(k);
			numKeysPressed += 1;	
		} 
		
		
		if (e.getKeyCode() == KeyEvent.VK_E) {
			piano.getSharpsKey(0).keyPressed();
			k = piano.getSharpsKey(0);
			mp3 = k.getPianoLetter() + ".mp3";
			keys.add(k);
			numKeysPressed += 1;	
		} 
		if (e.getKeyCode() == KeyEvent.VK_R) {
			piano.getSharpsKey(1).keyPressed();
			k = piano.getSharpsKey(1);
			mp3 = k.getPianoLetter() + ".mp3";
			keys.add(k);
			numKeysPressed += 1;	
		}
		if (e.getKeyCode() == KeyEvent.VK_Y) {
			piano.getSharpsKey(2).keyPressed();
			k = piano.getSharpsKey(2);
			mp3 = k.getPianoLetter() + ".mp3";
			keys.add(k);
			numKeysPressed += 1;	
		}
		if (e.getKeyCode() == KeyEvent.VK_U) {
			piano.getSharpsKey(3).keyPressed();
			k = piano.getSharpsKey(3);
			mp3 = k.getPianoLetter() + ".mp3";
			keys.add(k);
			numKeysPressed += 1;	
		}
		if (e.getKeyCode() == KeyEvent.VK_I) {
			piano.getSharpsKey(4).keyPressed();
			k = piano.getSharpsKey(4);
			mp3 = k.getPianoLetter() + ".mp3";
			keys.add(k);
			numKeysPressed += 1;	
		}
		
		System.out.println(k);
		
		if (isRecording)
			strokes.addKeyStroke(k);
		//r.record(k, measNum, beat);
		
	    try {
			sound.playSound(mp3);
		} catch (JavaLayerException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}


	public void keyReleased(KeyEvent e) {
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



	@Override
	public void actionPerformed(ActionEvent e) {
//		m.addKeyListener(this);
		String str = e.getActionCommand();
		
		 if (str.equals("RECORD")) {
			 System.out.println("bh");
			 isRecording = true;
			  strokes = new KeyStrokes();
		 } else if (str.equals("STOP")) {
			 System.out.println(strokes);
			 isRecording = false;
			 
		 } else if (str.equals("REPLAY")) {
			 strokes.playBack();
		 }
		
	}




	
	
	
}
