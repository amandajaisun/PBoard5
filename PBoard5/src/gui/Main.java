package gui;
import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.*; 
import javax.swing.*;

import piano.Sound;

 

public class Main extends JFrame {
	
	private JPanel cardPanel;
	//private GamePanel gamePanel;
	
	public Main() {
			super();
		setBounds(100, 100, 640, 480);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    cardPanel = new JPanel();//RS 
	    CardLayout cl = new CardLayout();
	    cardPanel.setLayout(cl);
      
	    StartPanel panel1 = new StartPanel(this);
	    InstructionsPanel panel2 = new InstructionsPanel(this);
	    GamePanel gamePanel = new GamePanel(this);
	   
	    
	    
	    cardPanel.add(panel1,"1"); // Card is named "1"
	    cardPanel.add(panel2,"2");
	    cardPanel.add(gamePanel,"3");
	    
	    add(cardPanel);
	    addKeyListener(gamePanel);//RS	
	   
	    setVisible(true);
	    gamePanel.run();
    }

    public static void main(String[] args) {

        Main a = new Main();
        
    }
    
    public void changePanel(String name) {
		((CardLayout)cardPanel.getLayout()).show(cardPanel,name);
		requestFocus();
	}

//	public static void main(String[] args) 
//	{ 
//		Main n = new Main();
		
		

//		JFrame window = new JFrame("pBOARD"); // sets bounds of window frame that panel appears in
//		window.setBounds(100, 100, 640, 480);
//		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		GamePanel panel = new GamePanel(); // gamepanel
//		//panel.setBackground(Color.WHITE);
//		Container c = window.getContentPane();
//		c.add(panel);
//		c.addKeyListener(panel);
//		window.setVisible(true); // makes window visible at all time	
//		
//		
//		panel.run();
//		GameFrame w = new GameFrame();
//		  JFrame w = new JFrame("PBoard");
//		    w.setBounds(100, 100, 640, 480);
//		    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//////		    GamePanel panel = new GamePanel();
//		   // StartPanel panel = new StartPanel();   
//		    //w.addMouseListener(null);
//////		    w.addKeyListener(panel);
//////		    w.add(panel);
//////		    w.add(g);
//		    w.add(mpanel);
//		    w.setResizable(true);
//		    w.setVisible(true);
		    
//		    panel.run();
		    
		    

//	}
}
