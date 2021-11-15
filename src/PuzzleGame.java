import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class PuzzleGame extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next;
	JPanel topPanel,bottomPanel;
	JLabel title;
	ArrayList<Puzzle> puzzles = new ArrayList<Puzzle>();
	Random randomizer = new Random();
	ArrayList<JButton> puzzleButtons = new ArrayList<JButton>();
	PuzzleGame(String choice){
		 super("puzzle game");
		 
		 puzzles.add(new Puzzle(1,"astronaut","png"));
		 puzzles.add(new Puzzle(2,"joker","jpg"));
		 puzzles.add(new Puzzle(3,"apple","jpg"));
		 
		 JPanel bottomPanel= new JPanel();
		 
		 b1=new JButton("1");
		 b2=new JButton("");
		 b3=new JButton("3");
		 b4=new JButton("4");
		 b5=new JButton("5");
		 b6=new JButton("6");
		 b7=new JButton("7");
		 b8=new JButton("8");
		 b9=new JButton("2");
		 puzzleButtons.add(b1);
		 puzzleButtons.add(b2);
		 puzzleButtons.add(b3);
		 puzzleButtons.add(b4);
		 puzzleButtons.add(b5);
		 puzzleButtons.add(b6);
		 puzzleButtons.add(b7);
		 puzzleButtons.add(b8);
		 puzzleButtons.add(b9);
		 
		 Collections.shuffle(puzzleButtons);
		 
		 Puzzle puzzleChoice = randPuzzles();

	     for(int i = 0; i < puzzles.size(); i++)
	     {
	    	 System.out.println("for" + puzzles.get(i).getName());
	    	 System.out.println("for choice" + choice.toLowerCase());
	         if(puzzles.get(i).getName().equals(choice.toLowerCase())) {
	        	 System.out.println("if" + choice.toLowerCase());
	        	 puzzleChoice = puzzles.get(i);
	         }
	     }

		 for(int x = 0, y = puzzleButtons.size(); x < y; x++) {
			 if(x != y-1) {
				 String path = "C:\\Users\\JoanJeremiah\\Documents\\Java-projects\\Puzzle\\resources\\" + puzzleChoice.getName() + "\\" + (x+1) + "." + puzzleChoice.getTye();
				 ImageIcon icon = new ImageIcon(path);
				 Image image = icon.getImage(); 
				 Image newimg = image.getScaledInstance(200,200,  java.awt.Image.SCALE_SMOOTH); 
				 icon = new ImageIcon(newimg);
				 System.out.println(path);
				 puzzleButtons.get(x).setIcon(icon);
				 puzzleButtons.get(x).setText(String.valueOf(x+1));
			 }
			 else {
				 puzzleButtons.get(x).setIcon(null);
				 puzzleButtons.get(x).setText("");
			 }
		 }
		JPanel topPanel= new JPanel();
		topPanel.setPreferredSize(new Dimension(600,50));
		topPanel.setBackground(new Color(250,127,3));
		JLabel title = new JLabel("Puzzle",SwingConstants.CENTER);
		title.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		title.setFont(new Font("Verdana",Font.PLAIN,18));
		title.setForeground(Color.white);
		topPanel.add(title);
		add(topPanel,BorderLayout.NORTH);
		bottomPanel.setSize(600,600);
		bottomPanel.setLayout(new GridLayout(3,3));
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		bottomPanel.add(b1);bottomPanel.add(b2);bottomPanel.add(b3);
		bottomPanel.add(b4);bottomPanel.add(b5);bottomPanel.add(b6);
		bottomPanel.add(b7);bottomPanel.add(b8);bottomPanel.add(b9); 
		add(bottomPanel);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		setSize(600,650);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e){
	if(e.getSource()==b1){
		String s=b1.getText();
		Icon i =b1.getIcon();
		if(b2.getText().equals("")){ 
			b2.setText(s); b1.setText("");
			b2.setIcon(i);b1.setIcon(null);
		}
		else if(b4.getText().equals("")){ 
			b4.setText(s); b1.setText("");
			b4.setIcon(i);b1.setIcon(null);
		}
	 }//end of if
	
	if(e.getSource()==b3){
		String s=b3.getText();
		Icon i =b3.getIcon();
		if(b2.getText().equals("")){ 
			b2.setText(s); b3.setText("");
			b2.setIcon(i); b3.setIcon(null);
		}
		else if(b6.getText().equals("")){ 
			b6.setText(s); b3.setText("");
			b6.setIcon(i); b3.setIcon(null);
		}
	 }//end of if
	
	if(e.getSource()==b2){
		String s=b2.getText();
		Icon i =b2.getIcon();
		if(b1.getText().equals("")){ 
			b1.setText(s); b2.setText("");
			b1.setIcon(i); b2.setIcon(null);
		}
		else if(b3.getText().equals("")){ 
			b3.setText(s); b2.setText("");
			b3.setIcon(i); b2.setIcon(null);
		}
		else if(b5.getText().equals("")){ 
			b5.setText(s); b2.setText("");
			b5.setIcon(i); b2.setIcon(null);
		}
	 }//end of if
	
	if(e.getSource()==b4){
		String s=b4.getText();
		Icon i =b4.getIcon();
		if(b1.getText().equals("")){ 
			b1.setText(s); b4.setText("");
			b1.setIcon(i); b4.setIcon(null);
		}
		else if(b7.getText().equals("")){ 
			b7.setText(s); b4.setText("");
			b7.setIcon(i); b4.setIcon(null);
		}
		else if(b5.getText().equals("")){ 
			b5.setText(s); b4.setText("");
			b5.setIcon(i); b4.setIcon(null);
		}
	 }//end of if
	
	if(e.getSource()==b5){
		String s=b5.getText();
		Icon i =b5.getIcon();
		if(b2.getText().equals("")){ 
			b2.setText(s); b5.setText("");
			b2.setIcon(i); b5.setIcon(null);
		}
		else if(b4.getText().equals("")){ 
			b4.setText(s); b5.setText("");
			b4.setIcon(i); b5.setIcon(null);
		}
		else if(b6.getText().equals("")){ 
			b6.setText(s); b5.setText("");
			b6.setIcon(i); b5.setIcon(null);
		}
		else if(b8.getText().equals("")){
			b8.setText(s); b5.setText("");
			b8.setIcon(i); b5.setIcon(null);
		}
	 }//end of if
	
	if(e.getSource()==b6){
		String s=b6.getText();
		Icon i =b6.getIcon();
		if(b9.getText().equals("")){ 
			b9.setText(s); b6.setText("");
			b9.setIcon(i); b6.setIcon(null);
		}
		else if(b3.getText().equals("")){ 
			b3.setText(s); b6.setText("");
			b3.setIcon(i); b6.setIcon(null);
		}
		else if(b5.getText().equals("")){ 
			b5.setText(s); b6.setText("");
			b5.setIcon(i); b6.setIcon(null);
		}
	
	 }//end of if
	
	if(e.getSource()==b7){
		String s=b7.getText();
		Icon i=b7.getIcon();
		if(b4.getText().equals("")){ 
			b4.setText(s); b7.setText("");
			b4.setIcon(i); b7.setIcon(null);
		}
		else if(b8.getText().equals("")){ 
			b8.setText(s); b7.setText("");
			b8.setIcon(i); b7.setIcon(null);
		}
	
	 }//end of if
	
	if(e.getSource()==b8){
		String s=b8.getText();
		Icon i = b8.getIcon();
		if(b7.getText().equals("")){ 
			b7.setText(s); b8.setText("");
			b7.setIcon(i); b8.setIcon(null);
		}
		else if(b9.getText().equals("")){ 
			b9.setText(s); b8.setText("");
			b9.setIcon(i); b8.setIcon(null);
		}
		else if(b5.getText().equals("")){ 
			b5.setText(s); b8.setText("");
			b5.setIcon(i); b8.setIcon(null);
		}
	 }
	
	if(e.getSource()==b9){
		String s=b9.getText();
		Icon i=b9.getIcon();
		if(b6.getText().equals("")){ 
			b6.setText(s); b9.setText("");
			b6.setIcon(i); b9.setIcon(null);
		}
		else if(b8.getText().equals("")){ 
			b8.setText(s); b9.setText("");
			b8.setIcon(i); b9.setIcon(null);
		}
		if(b1.getText().equals("1")&&b2.getText().equals("2")&&b3.getText().equals("3")&&b4.getText().equals("4")&&b5.getText().equals("5")&&b6.getText().equals("6")&&b7.getText().equals("7")&&b8.getText().equals("8")&&b9.getText().equals("")){ 
			JOptionPane.showMessageDialog(PuzzleGame.this,"You won");
		}
	 }
	
	}
	 
	public Puzzle randPuzzles() {
		int randomIndex = randomizer.nextInt(puzzles.size());
		Puzzle randomPuzzle = puzzles.get(randomIndex);
		return randomPuzzle;
	}
}