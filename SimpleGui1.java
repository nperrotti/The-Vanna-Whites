import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class SimpleGui1{
	double x = 0.01;
	

	public static void main(String[] args) {
		SimpleGui1 gui = new SimpleGui1();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MyDrawPanel drawPanel = new MyDrawPanel();

		frame.getContentPane().add(drawPanel);
		frame.setSize(400,400);
		frame.setVisible(true);

		for (int i = 0; i < 2000; i++) {
			x += 0.01;
			
			drawPanel.repaint();

			try {
				Thread.sleep(20);
			}	catch(Exception ex) {}
			
		}
	}

	class MyDrawPanel extends JPanel {
		Image image = new ImageIcon("Wheel.gif").getImage();
			
		public void paintComponent(Graphics g) {
			//g.setColor(Color.white);
			//g.fillRect(0,0,this.getWidth(),this.getHeight());

			Graphics2D g2d = (Graphics2D) g;
			g2d.rotate(x, 325, 325);
			g2d.drawImage(image, 200, 200, 250, 250, this);
			
			/*g.rotate(1);
			g.drawImage(image,3,4,this);*/
			
			
		}
	}

}
