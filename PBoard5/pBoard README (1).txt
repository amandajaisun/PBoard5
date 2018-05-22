pBoard README
Rithika Srinivasan, Keertana Patnam, and Amanda Sun
Written on 5/1/2018


Description:
* This program will transcribe piano playing into sheet music. The window will show a graphical portrayal of a piano keyboard (one octave).
* The piano on screen will be clickable, but for further convenience, keys on the computer keyboard correspond to different piano keys. The keyboard keys (S, D, F, G, H, J, K, L) will correspond to the keys for the piano octave of C major (C, D, E, F, G, A, B, C). Every time one of these keys is pressed, the corresponding pitch will be played and the key will show up on the screen in its sheet music format. There will be a start button on the screen, and when pressed, the notes that are played will be recorded at the time they’re played at. There will be a metronome playing in the background for the user to stay on beat.
* This program solves the problem that piano players have when they are trying to compose a new piano song. They might spontaneously want to try out a tune on their piano, but in order to record it as sheet music, they have to record the audio of the song and replay it to listen to it multiple times and denote the sheet music by ear. This program expedites the process for musicians to record their piano playing as sheet music, so that their work can be preserved for a long time. 


Instructions:
* Keys E, R, Y, U, and I correspond to C#, D#, F#, G#, and A# 
* Keys S-L on the keyboard will correspond to one octave on the piano (C-Major)
* Press the record button to start/stop the process of recording 
   * Play the piano keys (click keys on screen or play keyboard keys) in order to display sheet music at the top of the screen 


Features List:
Must-Have features
* There will be an exit button that brings the user back to the starting screen
* Instructions to play the program
   * There will be an instructions button for users to view instructions, and a start/resume button for the user to start/continue the game.  
* When each key is pressed, the corresponding pitch will play
* Key will show up on screen when pressed
   * Visual display of the sheet music on screen, which is written as the user plays the keyboard
* Start/stop button for recording
* Display piano on screen and keys pressed when player plays keyboard
* When the start/stop button is pressed for recording, the user is able to record music. 
   * As the recording is running and the user is playing, sheet music will automatically display on the screen and scroll along. 


Want-To-Have features
* Selection of songs that can play in the background (if users want to play by ear)
* At end of recording, user will be able to download a pdf file with the sheet music of what they played on it
* Be able to change tempo
* User can listen back to what they just played
* Metronome button 


Stretch features:
* Button to change time signature for each measure (for example, can choose to print out sheet music as ¾ beat or 4/4 beat, etc.
* Can denote multiple notes played at once in sheet music 
* User can go back and re-record on one section of the order 
* Button to change instrument (trumpet sound, clarinet, accordion, etc.) 
* Be able to record different types of notes than just quarter notes, like half notes, whole notes, eighth notes, and sixteenth notes. 

Class List:
* Package: GUI
   * Main: Instantiates a new game
   * GameFrame: holds all panels within the game (Extends JFrame)
   * GamePanel: Holds all other panels in a cardlayout
   * Display piano, sheet music, record button, and anything else that needs to be displayed on the screen 
   * StartPanel: Holds graphics for the start screen
   * InstructionsPanel: A panel to display instructions to the user
* Package: Keyboard
   * Recorder: Able to record music
   * Piano: Displays piano keys on screen
   	* Draws the actual piano (called in the GamePanel)
   * Key: Represents a key on the piano
   * Sound: Plays a sound


Responsibilities list
   * Rithika: Recorder class, Sound class + some GUI classes (StartPanel)
   * Keertana: Piano class + lot of GUI (InstructionsPanel & GamePanel)
   * Amanda: most of GUI (GamePanel, GameFrame, Main)


