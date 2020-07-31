package _12_slot_machine;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
JLabel j = new JLabel();
JLabel j1 = new JLabel();
JLabel j2 = new JLabel();
public void run() {
	JFrame f = new JFrame();
	f.setSize(250, 250);
	f.setVisible(true);
	JPanel p = new JPanel();
	j.setText("Cherry");
	j1.setText("Orange");
	j2.setText("Lemon");
	p.add(j);
	p.add(j1);
	p.add(j2);
	f.add(p);
	int r = new Random().nextInt(3);
		if(r == 0) {
			System.out.println("Cherry");
		}
		if(r == 1) {
			System.out.println("Orange");
		}
		if(r == 2) {
			System.out.println("Lemon");
		}
		int r1 = new Random().nextInt(3);
		if(r1 == 0) {
			System.out.println("Cherry");
		}
		if(r1 == 1) {
			System.out.println("Orange");
		}
		if(r1 == 2) {
			System.out.println("Lemon");
		}
		int r2 = new Random().nextInt(3);
		if(r2 == 0) {
			System.out.println("Cherry");
		}
		if(r2 == 1) {
			System.out.println("Orange");
		}
		if(r2 == 2) {
			System.out.println("Lemon");
		}
		
	}


private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
 

}
