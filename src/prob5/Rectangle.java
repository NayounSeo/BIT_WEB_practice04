package prob5;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		//울프램 알파에 길들지 맙시다 낄낄
		return 2*(width+height);
	}
	
	public void resize(double rate) {
		width *= rate;
		height *= rate;
	}

}
