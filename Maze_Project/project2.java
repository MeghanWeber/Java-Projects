package Project2;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setting up all of the inputs for the game board, how many rows, columns and
		// what danger level is in each position
		Scanner in = new Scanner(System.in);
		System.out.print("How many rows are in the maze? ");
		int rows = in.nextInt();
		System.out.print("How many columns are in the maze? ");
		int cols = in.nextInt();
		int[][] danger_levels = new int[rows][cols];
		//Maybe: initialize all elements to be 1
		for (int i = 0; i < rows; i++) {
			System.out.print("Enter the danger in row " + i + ", separated by spaces: ");
			for (int j = 0; j < cols; j++) {
				danger_levels[i][j] = in.nextInt();}}

		Point p = new Point();

		// Setting up what position the player is starting in
		System.out.print("Enter the starting x coordinate: ");
		int x_start = in.nextInt();
		System.out.print("Enter the starting y coordinate: ");
		int y_start = in.nextInt();
		//future work could add in a portion where we 
		
		Player player = new Player(new Point(x_start, y_start), danger_levels[x_start][y_start]);
		//printGrid(danger_levels, rows, cols, player);
		in.close();

		ArrayList<Point> win_conditions = new ArrayList<Point>();

		// setting up the win conditions
		// will use to break out of while loop when the player reaches the end of the
		// board
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == 0) {
					win_conditions.add(new Point(i, j));}
				else if (i == rows - 1) {
					win_conditions.add(new Point(i, j));}
				else if (j == 0 || j == cols - 1) {
					win_conditions.add(new Point(i, j));}}}

		
		
		//While loop that will run the entire simulation
		boolean win = false;
		while (!win) {
			Point next_move = new Point();
			//set the lowest danger to the max value
			int lowest_danger = Integer.MAX_VALUE;
			//define each of the cardinal directions and how to move about that direction on the gameboard
			Point north = new Point((int) player.current_position.getX(), (int) player.current_position.getY() -1);
			Point east = new Point((int) player.current_position.getX() - 1, (int) player.current_position.getY());
			Point south = new Point((int) player.current_position.getX(), (int) player.current_position.getY() + 1);
			Point west = new Point((int) player.current_position.getX() + 1, (int) player.current_position.getY());
			//writing if statements to tell the player to go in the direction of the lowest danger
			if (!player.positions.contains(north) && (danger_levels[(int) north.getX()][(int) north.getY()] < lowest_danger)) {
				next_move = north;
				lowest_danger = danger_levels[(int) north.getX()][(int) north.getY()];}
			
			if (!player.positions.contains(east) && (danger_levels[(int) east.getX()][(int) east.getY()] < lowest_danger)) {
				next_move = east;
				lowest_danger = danger_levels[(int) east.getX()][(int) east.getY()];}
			
			if (!player.positions.contains(south) && (danger_levels[(int) south.getX()][(int) south.getY()] < lowest_danger)) {
				next_move = south;
				lowest_danger = danger_levels[(int) south.getX()][(int) south.getY()];}
			
			if (!player.positions.contains(west) && (danger_levels[(int) west.getX()][(int) west.getY()] < lowest_danger)) {
				next_move = west;
				lowest_danger = danger_levels[(int) west.getX()][(int) west.getY()];}
			

			// summing the danger value for the total value at the end
			player.danger_val = player.danger_val + lowest_danger;
			//defining the current position of the player
			player.current_position = next_move;
			player.positions.add(next_move);
			
			//printing the current player grid and where his next move will be and what the danger level is
			printGrid(danger_levels, rows, cols, player);
			System.out.printf("Moving to (%d, %d) (danger level: %d) \n\n", (int)next_move.getX(), (int)next_move.getY(), lowest_danger);

			//will break out of the loop once the player reaches the edge of the board
			if (win_conditions.contains(player.current_position)) {
				win = true;}}
		
		System.out.printf("Exited the world at (%d, %d) \n", (int)player.current_position.getX(), (int)player.current_position.getY());
		System.out.printf("Total danger faced: %d \n", player.danger_val);}

// method for printing the gameboard
	public static void printGrid(int[][] gameboard, int row, int column, Player player) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if ((i == player.current_position.getX()) && (j == player.current_position.getY())) {
					System.out.printf("%5s", "*");
					continue;
				}
				System.out.printf("%5d ", gameboard[i][j]);
			}
			System.out.println();
		}
		//System.out.println();
	}

}

//	}
