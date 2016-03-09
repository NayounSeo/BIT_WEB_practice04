package prob5;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width*height*0.5;
	}
	
	public double getPerimeter() {
		//울프램 알파에 길들지 맙시다 낄낄
		return width+height+Math.sqrt(width*width + height*height);
	}

}
