import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
class EntryDialog extends JFrame implements ItemListener,ActionListener {
	private String choice = "Astronaut";
	static JFrame f;
	static JLabel l;
	static JComboBox c1;
	JButton b;
	JPanel topPanel,bottomPanel;
	BufferedImage img;
	public EntryDialog() throws IOException {
		f = new JFrame("");
		BufferedImage img = ImageIO.read(new File("C:\\Users\\JoanJeremiah\\Documents\\Java-projects\\Puzzle\\resources\\photo-1586527155314-1d25428324ff.jpg"));
		JLabel bottomPanel= new JLabel(new ImageIcon(img));
		JPanel topPanel= new JPanel();
		topPanel.setPreferredSize(new Dimension(600,50));
		topPanel.setBackground(new Color(250,127,3));
		JLabel title = new JLabel("Puzzle",SwingConstants.CENTER);
		title.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		title.setFont(new Font("Verdana",Font.PLAIN,18));
		title.setForeground(Color.white);
		topPanel.add(title);
		f.add(topPanel,BorderLayout.NORTH);
		String s1[] = { "Astronaut","Joker","Apple" };
		c1 = new JComboBox(s1);
		c1.addItemListener(this);
		c1.setBackground(null);
		l = new JLabel("Select your puzzle ");
		l.setForeground(Color.black);
		l.setFont(new Font("Verdana",Font.PLAIN,24));
		l.setBorder(BorderFactory.createEmptyBorder(0,0,30,0));
		JButton b = new JButton("OK");
		b.setBackground(null);
		b.setBorder(BorderFactory.createEmptyBorder(30,0,0,0));
		JPanel p = new JPanel();
		p.add(l);
		p.add(c1);
		p.add(b);
		p.setSize(400,300);
		p.setLayout(new GridLayout(3,1));
		p.setBackground(Color.white);
		p.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
		b.addActionListener(this);
		f.setSize(600,650);
		f.setVisible(true);
		bottomPanel.setLayout(new GridBagLayout());
		bottomPanel.add(p, new GridBagConstraints());
		f.add(bottomPanel);
		
	}
	public static void main(String[] args) throws IOException
	{
		EntryDialog s = new EntryDialog();
	}
	public void itemStateChanged(ItemEvent e)
	{
		if (e.getSource() == c1) {
			choice = c1.getSelectedItem() + "";
		}
	}
	public void actionPerformed(ActionEvent e){
		try {
			f.getContentPane().removeAll();
			f.add(new PuzzleGame(choice));
			f.validate();
		}
		catch(Exception ex) {
			
		}
		
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
}
