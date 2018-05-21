package piano;

import java.awt.Graphics;

public class Sheet {
	int x,y,width,height,margin,speed;
	public Sheet(int x, int y, int width, int height, int margin){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.margin = margin;
	}
	
	public void translate(int speed) {
		x -= speed;
	}
	public void draw(Graphics g) {
		g.drawRect(x, y, width, height);
		
	}
}
