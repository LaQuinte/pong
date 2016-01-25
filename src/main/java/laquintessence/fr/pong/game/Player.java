package laquintessence.fr.pong.game;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import laquintessence.fr.pong.game.api.Renderer;

@SuppressWarnings("serial")
public class Player extends Renderer {
	
	private int score = 0;
	private String name;

	public Player(int x, int y, Dimension dimension, Color color) {
		super(x, y, dimension, color);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillRect(getX(), getY(), (int)super.getWidth(), (int)super.getHeight());
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
