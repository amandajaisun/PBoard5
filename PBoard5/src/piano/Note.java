package piano;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 * A class that should be used in GamePanel when a key is pressed.
 * @author amandasun
 *
 */
public class Note {
	Key thiskey;
	private int x,y, r;

	public Note(Key k, int x, int y, int r) {
		thiskey = k;
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public void translate(int speed) {
		x -= speed;
	}

	public void draw(Graphics g) {
		g.drawOval(x, y, 2*r, 2*r);
	}
}
