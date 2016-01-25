package laquintessence.fr.pong.game.api;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

@SuppressWarnings("serial")
public abstract class Renderer extends Dimension implements IRenderer{

	private int x, y;
	private Color color;
	
	public Renderer(Renderer r){
		x = r.getX();
		y = r.getY();
		super.setSize(r.getSize());
		color = r.getColor();
	}
	
	public Renderer(int x, int y, Dimension dimension, Color color) {
		this.x = x;
		this.y = y;
		super.setSize(dimension);
		this.color = color;
	}


	@Override
	public void draw(Graphics g) {
		//g.setColor(getColor());
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
