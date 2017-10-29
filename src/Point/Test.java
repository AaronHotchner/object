package Point;

public class Test {
	public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5,  3.5));
		System.out.println("t1的面积和周长：" + t1.getArea() + " " + t1.getPerimeter());
		System.out.println(t1.contains(new MyPoint(3, 3)) + " " + t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
	}
}
