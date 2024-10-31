package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int perimeter () {
		return ((2*length) + (2*width));
	}

	public int Area () {
		return (length*width);
	}

	public boolean ifArea(Rectangle Rectangle2) {
		return this.Area()> Rectangle2.Area();


	}
	public boolean ifSquare() {
		return length == width;

	}
	public static void main(String[]args) {
		Rectangle Rectangle1 = new Rectangle(6, 7);
		System.out.println(Rectangle1.perimeter());
		
		Rectangle Rectangle2 = new Rectangle(4, 4);
		System.out.println(Rectangle1.ifArea(Rectangle2));
	}
}

