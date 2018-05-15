package piano;

import javax.swing.*;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
// hi it's rithika
/**
 * Represents the recorder class that records the sounds that the Keys play 
 * @author Amanda 
 *
 */
public class Recorder {

	private static int MEASURE_NUMBER = 1;
	private final int BEATS_PER_MEASURE;
	private ArrayList<Key> keysRecorded;
	private ArrayList<Point> measAndBeat;


	public Recorder(int beats) {
		BEATS_PER_MEASURE = beats;

	}
	
	public void record(Key k) {
		keysRecorded.add(k);
		
	}
	
	public void record(Key k, int measNum, int beat) {
		measAndBeat.add(new Point(measNum, beat));
		keysRecorded.add(k);
		
	}
	
	public void draw(Graphics g, ArrayList<Point> p, ArrayList<Key> k) {
		
		//g.paint
	}

}
