package laquintessence.fr.pong.game;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GamePanel extends JPanel{
	

	private int margin = 30;
	public Ball ball;
	public Player p1;
	public Player p2;
	
	public GamePanel(){
		Dimension ballDimension = new Dimension(20, 20);
		ball = new Ball(240, 240, ballDimension, Color.BLACK);
		
		Dimension racketDimension = new Dimension(90, 10);
		p1 = new Player(205, margin*2, racketDimension, Color.GREEN);
		p2 = new Player(205, 500-(margin*3), racketDimension, Color.GREEN);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2D = (Graphics2D)g;
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2D.setRenderingHints(rh);
		
		ball.draw(g);
		p1.draw(g);
		p2.draw(g);
		
		g.setColor(Color.WHITE);
		g.drawLine(0, margin, this.getWidth(), margin);
		g.drawLine(0, this.getHeight()-margin, this.getWidth(), this.getHeight()-margin);
	}
}
