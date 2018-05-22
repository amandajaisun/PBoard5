package piano;

import java.util.ArrayList;

import javazoom.jl.decoder.JavaLayerException;

public class KeyStrokes {

	private ArrayList<Long> timestamps;
	private ArrayList<Key> keys;
	private long startTime;
	private Sound sound;

	public KeyStrokes() {
		timestamps = new ArrayList<Long>();
		keys = new ArrayList<Key>();
		startTime = System.currentTimeMillis();
		sound = new Sound("");
	}

	public void addKeyStroke(Key k) {

		// if (keys.size() == 0 ) {
		timestamps.add(System.currentTimeMillis() - startTime);
		// } else {
		// timestamps.add(System.currentTimeMillis() - startTime +
		// timestamps.get(keys.size()-1));
		// }

		keys.add(k);
	}

	public void playBack() {
		if (keys != null) {
			int i = 0;
			while (i < timestamps.size()) {
				try {
					Key k = keys.get(i);
					String mp3 = k.getPianoLetter() + ".mp3";
					if (i == 0) {
						Thread.sleep(timestamps.get(i));
					} else {
						Thread.sleep(timestamps.get(i) - timestamps.get(i - 1));
					}
					try {
						sound.playSound(mp3);
					} catch (JavaLayerException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				i++;

			}
		}
	}

	public String toString() {
		String output = "";
		for (int i = 0; i < timestamps.size(); i++) {
			output += ("(" + keys.get(i).getPianoLetter() + ", " + timestamps.get(i) + ")\n");
		}
		return output;

	}
	
	public long getTimestamp(int i) {
		return timestamps.get(i);
	}
	
	public ArrayList<Long> getTimestamps() {
		return timestamps;
	}
	
	public ArrayList<Key> getKeys() {
		return keys;
	}
}
