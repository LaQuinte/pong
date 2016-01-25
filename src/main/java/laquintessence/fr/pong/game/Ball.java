package laquintessence.fr.pong.game;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import laquintessence.fr.pong.game.api.Renderer;

@SuppressWarnings("serial")
public class Ball extends Renderer{

	public Ball(Ball ball) {
		super(ball);
	}
	
	public Ball(int x, int y, Dimension dimension, Color color) {
		super(x, y, dimension, color);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillOval(getX(), getY(), (int)super.getWidth(), (int)super.getHeight());
	}
}
