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

public class InstructionsPanel extends JPanel implements KeyListener, ActionListener, MouseListener{

	private Image background;
	private JButton back;
	private GameFrame frame;
	private Rectangle button;
	private Main w;
	
	public InstructionsPanel(Main w) {
		background = (new ImageIcon("instructionsBackground.png")).getImage();
		this.w = w;
		//frame = f;
		button = new Rectangle(50, 530, 200, 50);
//		 setLayout(null);
//		 setLayout(new GridLayout());
		
		setLayout(new SpringLayout());

		 	Font font = new Font("Sans", Font.BOLD, 20);
		 
			back = new JButton("CONTINUE");
			//back.setSize(200, 50);
			//back.setLocation(50,530);
			back.setFont(font);
			//back.setBounds(50, 530, 200, 50);
			
		
			add(back);
			
			back.addActionListener(this);
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
	    g.drawRect(50, 530, 200, 50);
	    g.drawString("BACK", 60, 530);
	   
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		w.changePanel("3");
	/*	String str = e.getActionCommand();
		
		if (str.equals("BACK")); 
			//Main.changeState(1);
//			frame.changePanel("1");
 * 
 */
		
			
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		 int width = getWidth();
		    int height = getHeight();
		    
		double xRatio = width/800.0;
	    double yRatio = height/600.0;
	
	    double xClick = e.getX();
		double yClick = e.getY();
		
		if(button.contains(xClick, yClick)) {
			System.out.print("hi");
			frame.changePanel("1");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
