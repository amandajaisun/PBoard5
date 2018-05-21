package gui;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameFrame extends JFrame{

	private StartPanel start;
	private GamePanel game;
	private InstructionsPanel instruct;
	private JPanel cards;
	
	Container contentPane;
	
	public GameFrame() {
		super();
		contentPane=getContentPane();
		cards = new JPanel();
		CardLayout cl = new CardLayout();
		cards.setLayout(cl);
		
		start = new StartPanel(this);
		instruct = new InstructionsPanel(this);
		game = new GamePanel();
		addKeyListener(game);
	
		cards.add(start);
		
//		cards.add(start, "1");
//		cards.add(instruct, "2");
//		cards.add(game, "3");
		
		add(cards);
		
		//addKeyListener(start);
		//addKeyListener(instruct);
		
	}
	
	public void changePanel(String name) {
		contentPane.removeAll();
		invalidate();
        if (name.equals("1")) {
        		contentPane.add(start);
        } else if (name.equals("2")) {
    			contentPane.add(instruct);
        } else {
        	contentPane.add(game);
        }
        
        System.out.println("new panel created");//for debugging purposes
        revalidate();
        setVisible(true);
//		((CardLayout)cards.getLayout()).show(cards,name);
		requestFocus();
	}
	
	
}
