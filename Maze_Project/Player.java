package Project2;

import java.awt.Point;
import java.util.ArrayList;

public class Player {
	public Point current_position;
	public ArrayList<Point> positions = new ArrayList<Point>();
	public int danger_val;
	
	public Player(Point p, int danger) {
		current_position = p;
		positions.add(p);
		danger_val = danger;
	}
}
