package piano;

import java.awt.Point;
import java.util.ArrayList;

/**
 * A class that should be used in GamePanel when a key is pressed.
 * @author amandasun
 *
 */
public class Note {
	Key thiskey;
	private int x,y;
	
	public Note(Key k, int x, int y) {
		thiskey = k;
		this.x = x;
		this.y = y;

	}

	public void translate(int speed) {
		x -= speed;
	}
}
