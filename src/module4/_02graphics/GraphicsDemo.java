package module4._02graphics;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		//Using a built-in color
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledSquare(0.5, 0.5, .2);
		
		//Using a custom color
		Color purply = new Color(255, 0, 150);
		StdDraw.setPenColor(purply);
		StdDraw.filledCircle(.75, .75, .1);
		
		//Use the StdDraw API to do the following:
		
		//Draw a blue point anywhere you like
		
		//Draw a larger green point someplace else

		//Draw an unfilled red triangle somewhere

		//Draw a filled yellow circle somewhere

		//Draw a filled blue rectangle somewhere

	}
}
