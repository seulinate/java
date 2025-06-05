package ch07.interface_;

public class Rectangle implements Shape{
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}

}
