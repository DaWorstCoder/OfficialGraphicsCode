import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;

class Main extends JPanel implements ActionListener {
	static final int height = 300;
	static final int width = 300;
	Timer timer;

	Main() {
		JFrame Frame = new JFrame(""); // Insert Name here
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setResizable(false);
		Frame.pack();
		Frame.setVisible(true);
		Frame.setSize(width, height);
		Frame.add(this);

		this.setPreferredSize(new Dimension(width - 1, height - 1 + 100));
		this.setBackground(new Color(33, 33, 33)); // Use this to change the background color
		this.setFocusable(true);

		/** This can be commented out if a static image is to be produced. **/
		timer = new Timer(1, this);
		timer.start();
	}

	/** Anything that you want to draw goes in here **/
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

	}

	/** Anything that you want to happened repeatedly goes in here **/
	public void actionPerformed(ActionEvent e) {
		repaint();
	}

	public static void main(String[] args) {
		new Main();
	}
}