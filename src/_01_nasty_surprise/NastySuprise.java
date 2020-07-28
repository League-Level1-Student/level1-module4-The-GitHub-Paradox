package _01_nasty_surprise;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javafx.event.Event;

public class NastySuprise implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	Button b = new Button("Treat");
	Button b1 = new Button("Trick");
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
	public void GUI() {
		f.add(p);
		f.setSize(500, 500);
		p.add(b);
		p.add(b1);
		b.addActionListener(this);
		b1.addActionListener(this);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == b) {
			showPictureFromTheInternet("https://media.tenor.com/images/b9ed400ef0d59e41b14adce859ad2994/tenor.png");
		}
		if(arg0.getSource() == b1) {
			showPictureFromTheInternet("https://giphy.com/gifs/dog-angry-doge-10ECejNtM1GyRy");
		}
		
	}
}
