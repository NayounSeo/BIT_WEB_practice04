package prob5;

public class ShapeTest {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle(5, 6);
		Shape rectTriangle = new RectTriangle(6, 2);
		
		Shape[] shape = {rectangle, rectTriangle};
		
		for (Shape s : shape) {
			System.out.println(s.getArea());
			System.out.println(s.getPerimeter());
			if (s instanceof Resizable) {
				//다운캐스팅의 용도
				//인스턴스 변수 바꾸는 함수 정도는 for each문 사용이 가능하다.
				((Rectangle)s).resize(0.5);
				System.out.println(s.getArea());
				System.out.println(s.getPerimeter());
			}
		}
	}
}
