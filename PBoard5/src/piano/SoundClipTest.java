package piano;


import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

/**
 * Organizes the different sound clips being used 
 * @author rithika, keertana, amanda 
 */
public class SoundClipTest extends JFrame {

   
   public SoundClipTest() {
	   
   }
   
   public void playSound() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("Test Sound Clip");
      this.setSize(300, 200);
      this.setVisible(true);       
      try {
         // Open an audio input stream.    
    	  
    	  // ITS THIS LINE OVER HERE 
    	  // CHANGE THIS LINE TO YOUR FILE
    	  File soundFile = new File("C:\\Users\\Yash\\Dropbox\\Personal Programming Projects\\HelpingAmanda\\piano_A5.wav");
    	 // File soundFile = new File("C:\\Users\\Yash\\Downloads/piano_A5.wav"); //you could also get the sound file with an URL
          AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);              
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
   }

   public static void main(String[] args) {
      new SoundClipTest();
   }
}