/*
 /* art.java
 * @author: Alberto Melendez
 * @date: 11/25/19
 * Creates an image of the Puerto Rican flag.
 */

import java.awt.Color;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import javax.swing.*;


public class art extends GraphicsProgram {
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 500;

	/* Set the dimensions of the canvas. I decided to set and use
	 * global constants above since I believed it would be proper 
	 * programming.
	*/
	public void init() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT); 
	}
	
	public void run() {
		GPen  pen = new GPen(0, 0);
		add(pen);
		
		// Top Red line
		pen.setFillColor(Color.RED);
		pen.startFilledRegion();
		pen.drawLine(0, 100);
		pen.drawLine(800, 0);
		pen.drawLine(0,-100);
		pen.drawLine(-800, 0);
		pen.endFilledRegion();
		
		pen.setLocation(0, 200);
		
		// Bottom Red Line
		pen.setFillColor(Color.RED);
		pen.startFilledRegion();
		pen.drawLine(0, 200);
		pen.drawLine(800, 0);
		pen.drawLine(0,100);
		pen.drawLine(-800, 0);
		pen.endFilledRegion();
		
		pen.setLocation(0, 200);
		
		// Mid Red Line
		pen.setFillColor(Color.RED);
		pen.startFilledRegion();
		pen.drawLine(0, 100);
		pen.drawLine(800, 0);
		pen.drawLine(0,-100);
		pen.drawLine(-800, 0);
		pen.endFilledRegion();
		
		pen.setLocation(0, 0);
		
		// Blue Triangle
		pen.setFillColor(Color.BLUE);
		pen.startFilledRegion();
		pen.drawLine(0, 500);
		pen.drawLine(400, -250);
		pen.drawLine(-400, -250);
		pen.endFilledRegion();
		
		pen.setLocation(150, 170);
		
		// White Star
		pen.setFillColor(Color.WHITE);
		pen.startFilledRegion();
		pen.drawLine(25, 50);
		pen.drawLine(50, 0);
		pen.drawLine(-50, 40);
		pen.drawLine(25, 50);
		pen.drawLine(-55, -30);
		pen.drawLine(-55, 30);
		pen.drawLine(25, -50);
		pen.drawLine(-50, -40);
		pen.drawLine(55, 0);
		pen.endFilledRegion();
	}
	
}
