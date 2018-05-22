package gui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class InstructionsPanel extends JPanel implements ActionListener{

	private Image background;
	private JButton cont;
	//private GameFrame frame;
	private Main w;
	
	public InstructionsPanel(Main w) {
		background = (new ImageIcon("instructionsBackground.png")).getImage();
		this.w = w;
		//frame = f;
//		 setLayout(null);
//		 setLayout(new GridLayout());
		
		setLayout(new SpringLayout());

		 	Font font = new Font("Sans", Font.BOLD, 20);
		 
			cont = new JButton("CONTINUE");
			//back.setSize(200, 50);
			//back.setLocation(50,530);
			cont.setFont(font);
			//back.setBounds(50, 530, 200, 50);
			
		
			add(cont);
			
			cont.addActionListener(this);
	}

	public void paintComponent (Graphics g) {
		super.paintComponent(g);  // Call JPanel's paintComponent method to paint the background

	    int width = getWidth();
	    int height = getHeight();
	    
	    double ratioX = (double)width/GamePanel.DRAWING_WIDTH;
	    double ratioY = (double)height/GamePanel.DRAWING_HEIGHT;
	    
	    Graphics2D g2 = (Graphics2D)g;
	    AffineTransform at = g2.getTransform();
	    g2.scale(ratioX,ratioY);
	    
	    g.drawImage(background, 0, 0, GamePanel.DRAWING_WIDTH, GamePanel.DRAWING_HEIGHT, this);
	    g2.setTransform(at);

	   
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		w.changePanel("3");
	
		
	}

	
}

	