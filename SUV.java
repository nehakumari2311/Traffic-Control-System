package TrafficManagement;

import java.awt.Color;
import java.awt.Graphics;

public class SUV extends Vehicle {
	public SUV(int newx,int newy) {
		super(newx,newy);
		width=60;
		height=30;
		speed=8;
	}
	
	public void paintMe(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(x, y, width, height);
	}


}
