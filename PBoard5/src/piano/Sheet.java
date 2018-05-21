package piano;

import java.awt.Graphics;

public class Sheet {
	int x,y,width,height,margin,speed;
	public Sheet(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		margin = height/4;
	}
	
	public void translate(int speed) {
		x -= speed;
	}
	public void draw(Graphics g) {
		g.drawRect(x, y, width, height);
		g.drawLine(x, y+margin, x+width, y+margin);
		g.drawLine(x, y+2*margin, x+width, y+2*margin);
		g.drawLine(x, y+3*margin, x+width, y+3*margin);
		
	}
} 
