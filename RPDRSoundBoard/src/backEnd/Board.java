package backEnd;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JFrame{
	
	Color brightWhite = new Color(255,255,255);
	JPanel mainPanel;
	JButton s1,s2,s3,s4,s5,s6,s7,s8,s9;
	Container mainCon;
	Font font = new Font("Courier", Font.ITALIC,12);
	SoundHandler soundHandler = new SoundHandler();

	public Board() {
		
		setTitle("RPDRS!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Setting Location and Visability
		setBounds(0,0,325,360);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setLayout(null);
		mainCon = getContentPane();
		
//		mainPanel = new JPanel();
//		mainPanel.setBounds(0,0,325,360);
//		mainPanel.setBackground(brightWhite);
//		mainCon.add(mainPanel);
		
		s1 = new JButton("Oh Honey!");
		s1.setBounds(10, 10, 100, 100);
		s1.setBackground(Color.pink);
		s1.setActionCommand("s1");
		s1.addActionListener(soundHandler);
		s1.setFont(font);
		mainCon.add(s1);
		
		s2 = new JButton("Satan");
		s2.setBounds(110, 10, 100, 100);
		s2.setBackground(Color.pink);
		s2.setActionCommand("s2");
		s2.addActionListener(soundHandler);
		s2.setFont(font);
		mainCon.add(s2);
		
		s3 = new JButton("Acting");
		s3.setBounds(210, 10, 100, 100);
		s3.setBackground(Color.pink);
		s3.setVisible(true);
		s3.setActionCommand("s3");
		s3.addActionListener(soundHandler);
		s3.setFont(font);
		mainCon.add(s3);
		
		s4 = new JButton("Stunning");
		s4.setBounds(10, 110, 100, 100);
		s4.setBackground(Color.pink);
		s4.setVisible(true);
		s4.setActionCommand("s4");
		s4.addActionListener(soundHandler);
		s4.setFont(font);
		mainCon.add(s4);
		
		s5 = new JButton("Had It");
		s5.setBounds(110, 110, 100, 100);
		s5.setBackground(Color.pink);
		s5.setVisible(true);
		s5.setActionCommand("s5");
		s5.addActionListener(soundHandler);
		s5.setFont(font);
		mainCon.add(s5);
		
		s6 = new JButton("Communism");
		s6.setBounds(210, 110, 100, 100);
		s6.setBackground(Color.pink);
		s6.setVisible(true);
		s6.setActionCommand("s6");
		s6.addActionListener(soundHandler);
		s6.setFont(font);
		mainCon.add(s6);
		
		s7 = new JButton("Absolute");
		s7.setBounds(10, 210, 100, 100);
		s7.setBackground(Color.pink);
		s7.setVisible(true);
		s7.setActionCommand("s7");
		s7.addActionListener(soundHandler);
		s7.setFont(font);
		mainCon.add(s7);
		
		s8 = new JButton("No");
		s8.setBounds(110, 210, 100, 100);
		s8.setBackground(Color.pink);
		s8.setVisible(true);
		s8.setActionCommand("s8");
		s8.addActionListener(soundHandler);
		s8.setFont(font);
		mainCon.add(s8);
		
		s9 = new JButton("Vanjie");
		s9.setBounds(210, 210, 100, 100);
		s9.setBackground(Color.pink);
		s9.setVisible(true);
		s9.setActionCommand("s9");
		s9.addActionListener(soundHandler);
		s9.setFont(font);
		mainCon.add(s9);
	}
	
	public void playSound(String soundName)
	 {
	   try 
	   {
	    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
	    Clip clip = AudioSystem.getClip( );
	    clip.open(audioInputStream);
	    clip.start( );
	   }
	   catch(Exception ex)
	   {
	     System.out.println("Error with playing sound.");
	     ex.printStackTrace( );
	   }
	 }
	
public class SoundHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			String playerChoice = event.getActionCommand();
			
			switch(playerChoice) {
			case "s1": playSound("C:\\Users\\Asus\\eclipse-workspace\\RPDRSoundBoard\\src\\backEnd\\ohHoney.wav"); break;
			case "s2": playSound("C:\\Users\\Asus\\eclipse-workspace\\RPDRSoundBoard\\src\\backEnd\\notTodaySatan.wav"); break;
			case "s3": playSound("C:\\Users\\Asus\\eclipse-workspace\\RPDRSoundBoard\\src\\backEnd\\actingTammie.wav"); break;
			case "s4": playSound("C:\\Users\\Asus\\eclipse-workspace\\RPDRSoundBoard\\src\\backEnd\\brownCowStunning.wav"); break;
			case "s5": playSound("C:\\Users\\Asus\\eclipse-workspace\\RPDRSoundBoard\\src\\backEnd\\hadIt.wav"); break;
			case "s6": playSound("C:\\Users\\Asus\\eclipse-workspace\\RPDRSoundBoard\\src\\backEnd\\communism.wav"); break;
			case "s7": playSound("C:\\Users\\Asus\\eclipse-workspace\\RPDRSoundBoard\\src\\backEnd\\absolutely.wav"); break;
			case "s8": playSound("C:\\Users\\Asus\\eclipse-workspace\\RPDRSoundBoard\\src\\backEnd\\no.wav"); break;
			case "s9": playSound("C:\\Users\\Asus\\eclipse-workspace\\RPDRSoundBoard\\src\\backEnd\\missVanjie.wav"); break;
			}
			
		}
		
}
	
}
