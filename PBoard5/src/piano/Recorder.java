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
	private ArrayList<Point> measAndBeats;


	public Recorder(int beats) {
		BEATS_PER_MEASURE = beats;
		keysRecorded = new ArrayList<Key>();
		measAndBeats = new ArrayList<Point>(); 

	}
	
//	public Key record(Key k) {
//		keysRecorded.add(k);
//		return k;
//	}
//	
	public void record(Key k, int measNum, int beat) {
		measAndBeats.add(new Point(measNum, beat));
		keysRecorded.add(k);
		
	}
	
	public Key returnKey(Point measAndBeat) {
		for (int i = 0; i< measAndBeats.size(); i++) {
			if (measAndBeats.get(i).getX() == measAndBeat.getX() && measAndBeats.get(i).getY() == measAndBeat.getY())
				return keysRecorded.get(i);
		}
		return null; // potential bug
	}
	
	public String toString() {
		return "";
	}
	
}
