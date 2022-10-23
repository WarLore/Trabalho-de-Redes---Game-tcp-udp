import java.awt.Graphics;
import java.awt.Color;

public class Player {
	
	public boolean left, right;
	public int x, y, width, height;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 40;
		this.height = 5;
	}
	
	public void tick() {
		if(right) {
			x++;
		}else if(left) {
			x--;
		}
		
		if(this.x + this.width > Game.WIDTH) {
			x = Game.WIDTH - this.width;
		}else if(this.x < 0) {
			this.x = 0;
		}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height); 
	}
}
