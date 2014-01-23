import java.awt.*;
import javax.swing.*;

public class GuiTile  extends JPanel {
    Wheel Game = new Wheel();
    String puzzle = Game.puzzle;  

    public void paint(Graphics g) {
	g.setFont(new Font("",0,20));
	FontMetrics fm = getFontMetrics(new Font("",0,30));
	String s = puzzle;
	int x = 5;
	int y = 5;
	for (int i = 0; i < s.length(); i++) {
	    char c = s.charAt(i);
	    int h = fm.getHeight();
	    int w = 20;
	    g.drawRect(x, y, w, h);
	    g.drawString(String.valueOf(c), x, y + h);
	    x = x + w;
	}
    }
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setContentPane(new GuiTile());
	frame.setSize(100, 100);
	frame.setVisible(true);
    }
}