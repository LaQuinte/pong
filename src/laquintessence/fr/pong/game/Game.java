package laquintessence.fr.pong.game;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Game extends JFrame{
	
	private GamePanel panel = new GamePanel();

	public Game() {
		setTitle("PONG !");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setContentPane(panel);
		setVisible(true);
		
		start();
	}

	public void start(){
		long deltaTime = 0;
		long previousDeltaTime = 0;
		boolean playing = true;
		
		int i = 0;
		while ( playing == true) {
			/*previousDeltaTime = deltaTime;
			deltaTime = System.nanoTime()-deltaTime;
			if (deltaTime !=  previousDeltaTime) {
				System.out.println(Long.toString(deltaTime));
			}*/
			
			
			
			panel.ball.setX(i);
			panel.ball.setY(i);
			
			if (panel.ball.getX()+panel.ball.getWidth() < panel.getWidth()){
				panel.ball.setX(panel.ball.getX()+1);
			} else {
				
			}
			
			/*if (panel.ball.getX()+panel.ball.getWidth()  panel.getWidth()){
				panel.ball.setX(panel.ball.getX()+1);
			}*/
			
			
			panel.repaint();
		    try {
		    	Thread.sleep(10);
		    } catch (InterruptedException e) {
		    	e.printStackTrace();
		    }
		}
	}
}
