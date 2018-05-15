package piano;


import java.io.BufferedInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import jay.jaysound.JayLayer;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;


import java.io.*;

/**
 * Creates/represents the sound which each of the Keys will play 
 * @author Keertana 
 */

public class Sound  {
//	private static URL sound;
	private JayLayer sound;
	String selected_sound;
	String a_soundFile, aSharp_soundFile, b_soundFile, cSharp_soundFile, c4_soundFile, c5_soundFile,  d_soundFile, dSharp_soundFile,  e_soundFile, f_soundFile, fSharp_soundFile, g_soundFile,  gSharp_soundFile;
	FileInputStream fileInputStream;
	AdvancedPlayer player;
	UnclosableBufferedInputStream a_b_stream, aSharp_b_stream, b_b_stream, cSharp_b_stream, c4_b_stream, c5_b_stream, d_b_stream, dSharp_b_stream, e_b_stream, f_b_stream, fSharp_b_stream, g_b_stream, gSharp_b_stream;


	public Sound(String url) {

		//read a.mp3
		a_soundFile = "src/Sounds/" + "a.mp3";
		try {
			fileInputStream = new FileInputStream(a_soundFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a_b_stream = new UnclosableBufferedInputStream(fileInputStream);
		
		//read a#.mp3
		aSharp_soundFile = "src/Sounds/" + "a#.mp3";
		try {
			fileInputStream = new FileInputStream(aSharp_soundFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aSharp_b_stream = new UnclosableBufferedInputStream(fileInputStream);
		
		//read b.mp3
		b_soundFile = "src/Sounds/" + "b.mp3";
		try {
			fileInputStream = new FileInputStream(b_soundFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b_b_stream = new UnclosableBufferedInputStream(fileInputStream);
		
		//read c#.mp3
		cSharp_soundFile = "src/Sounds/" + "c#.mp3";
		try {
			fileInputStream = new FileInputStream(cSharp_soundFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cSharp_b_stream = new UnclosableBufferedInputStream(fileInputStream);
        
		//read c4.mp3
		c4_soundFile = "src/Sounds/" + "c4.mp3";
		try {
			fileInputStream = new FileInputStream(c4_soundFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c4_b_stream = new UnclosableBufferedInputStream(fileInputStream);
		
		
		//read c5.mp3
		c5_soundFile = "src/Sounds/" + "c5.mp3";
		try {
			fileInputStream = new FileInputStream(c5_soundFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c5_b_stream = new UnclosableBufferedInputStream(fileInputStream);

		

		//read d.mp3
		d_soundFile = "src/Sounds/" + "d.mp3";
		try {
			fileInputStream = new FileInputStream(d_soundFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d_b_stream = new UnclosableBufferedInputStream(fileInputStream);
		
		
		//read d#.mp3
		dSharp_soundFile = "src/Sounds/" + "d#.mp3";
		try {
			fileInputStream = new FileInputStream(dSharp_soundFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dSharp_b_stream = new UnclosableBufferedInputStream(fileInputStream);
		
		
		//read e.mp3
		e_soundFile = "src/Sounds/" + "e.mp3";
		try {
			fileInputStream = new FileInputStream(e_soundFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		e_b_stream = new UnclosableBufferedInputStream(fileInputStream);
		
		//read f.mp3
		f_soundFile = "src/Sounds/" + "f.mp3";
		try {
			fileInputStream = new FileInputStream(f_soundFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f_b_stream = new UnclosableBufferedInputStream(fileInputStream);
		
		//read f#.mp3
		fSharp_soundFile = "src/Sounds/" + "f#.mp3";
		try {
			fileInputStream = new FileInputStream(fSharp_soundFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fSharp_b_stream = new UnclosableBufferedInputStream(fileInputStream);
		
		//read g.mp3
		g_soundFile = "src/Sounds/" + "g.mp3";
		try {
			fileInputStream = new FileInputStream(g_soundFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		g_b_stream = new UnclosableBufferedInputStream(fileInputStream);

		//read g#.mp3
		gSharp_soundFile = "src/Sounds/" + "g#.mp3";
		try {
			fileInputStream = new FileInputStream(gSharp_soundFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gSharp_b_stream = new UnclosableBufferedInputStream(fileInputStream);

	}

	
	
	public void playSound(String soundFile) throws JavaLayerException {
		if(soundFile == "") return;
		
		ExecutorService executor = Executors.newFixedThreadPool(10);

		//System.out.println("Called sound " + soundFile);
		//play a.mp3
		if (soundFile.matches("a.mp3")) {
			
			Runnable runnableTask = () -> {
				try {
					player = new AdvancedPlayer(a_b_stream);
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					player.play();
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				};
				executor.execute(runnableTask);
				
		}
		
		
		//play a#.mp3
		if (soundFile.matches("a#.mp3")) {
			
			Runnable runnableTask = () -> {
				try {
					player = new AdvancedPlayer(aSharp_b_stream);
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					player.play();
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				};
				executor.execute(runnableTask);
				
		}

		//play b.mp3
		if (soundFile.matches("b.mp3")) {
			
			Runnable runnableTask = () -> {
				try {
					player = new AdvancedPlayer(b_b_stream);
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					player.play();
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				};
				executor.execute(runnableTask);
				
		}
		
		//play c#.mp3
		if (soundFile.matches("c#.mp3")) {
			
			Runnable runnableTask = () -> {
				try {
					player = new AdvancedPlayer(cSharp_b_stream);
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					player.play();
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				};
				executor.execute(runnableTask);
				
		}
		
		//play c4.mp3
		if (soundFile.matches("c4.mp3")) {
	        
			Runnable runnableTask = () -> {
			try {
				player = new AdvancedPlayer(c4_b_stream);
			} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				player.play();
			} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			};
			executor.execute(runnableTask);
		}

		//play c5.mp3
		if (soundFile.matches("c5.mp3")) {
			
			Runnable runnableTask = () -> {
				try {
					player = new AdvancedPlayer(c5_b_stream);
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					player.play();
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				};
				executor.execute(runnableTask);
				
		}
	
		//play d.mp3
		if (soundFile.matches("d.mp3")) {
		        
				Runnable runnableTask = () -> {
				try {
					player = new AdvancedPlayer(d_b_stream);
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					player.play();
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				};
				executor.execute(runnableTask);
				
		}

		//play d#.mp3
		if (soundFile.matches("d#.mp3")) {
	        
			Runnable runnableTask = () -> {
			try {
				player = new AdvancedPlayer(dSharp_b_stream);
			} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				player.play();
			} catch (JavaLayerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			};
			executor.execute(runnableTask);
			
		}

		//play e.mp3
		if (soundFile.matches("e.mp3")) {
				
				
				Runnable runnableTask = () -> {
					try {
						player = new AdvancedPlayer(e_b_stream);
					} catch (JavaLayerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						player.play();
					} catch (JavaLayerException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					};
					executor.execute(runnableTask);
					
				
		}
		
		//play f.mp3
		if (soundFile.matches("f.mp3")) {
			
			
			Runnable runnableTask = () -> {
				try {
					player = new AdvancedPlayer(f_b_stream);
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					player.play();
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				};
				executor.execute(runnableTask);
				
		}
		
		//play f#.mp3
		if (soundFile.matches("f#.mp3")) {
		
			Runnable runnableTask = () -> {
				try {
					player = new AdvancedPlayer(fSharp_b_stream);
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					player.play();
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				};
				executor.execute(runnableTask);
				
		}
		
		//play g.mp3
		if (soundFile.matches("g.mp3")) {
			
			Runnable runnableTask = () -> {
				try {
					player = new AdvancedPlayer(g_b_stream);
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					player.play();
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				};
				executor.execute(runnableTask);
				
		}
		
		//play g#.mp3
		if (soundFile.matches("g#.mp3")) {
			
			Runnable runnableTask = () -> {
				try {
					player = new AdvancedPlayer(gSharp_b_stream);
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					player.play();
				} catch (JavaLayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				};
				executor.execute(runnableTask);
				
		}
	}
	
/**
 * Resets the Buffer
 * @author Keertana
 */
public class UnclosableBufferedInputStream extends BufferedInputStream {

    public UnclosableBufferedInputStream(InputStream in) {
        super(in);
        super.mark(Integer.MAX_VALUE);
    }

    @Override
    public void close() throws IOException {
        super.reset();
    }
}
}