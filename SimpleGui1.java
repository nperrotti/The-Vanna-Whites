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
		//JFrame frame2 = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.setBackground(Color.white);
		panel.add(new GuiTile());
		MyDrawPanel drawPanel = new MyDrawPanel();
		panel.add(drawPanel);
		frame.getContentPane().add(BorderLayout.CENTER, panel);		
		//frame.getContentPane().add(BorderLayout.SOUTH, panel);
		
		frame.setSize(700,700);
		frame.setVisible(true);

		//frame2.setSize(400,400);
		//frame2.setVisible(true);
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
		    g2d.rotate(x, 125, 125);
		    g2d.drawImage(image, 0, 0, 250, 250, this);
			
		    /*g.rotate(1);
		      g.drawImage(image,3,4,this);*/
			
			
		}
	}

}
