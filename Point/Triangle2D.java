package Point;

public class Triangle2D {
	private MyPoint p1, p2, p3;
	
	public Triangle2D() {
		p1 = new MyPoint();
		p2 = new MyPoint(1, 1);
		p3 = new MyPoint(2, 5);
	}
	
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public void setP1 (MyPoint p1) {
		this.p1 = p1;
	}
	
	public void setP2 (MyPoint p2) {
		this.p2 = p2;
	}
	
	public void setP3 (MyPoint p3) {
		this.p3 = p3;
	}
	
	public MyPoint getP1() {
		return this.p1;
	}
	
	public MyPoint getP2() {
		return this.p2;
	}
	
	public MyPoint getP3() {
		return this.p3;
	}
	
	public double getArea() {
		return 0.5 * (p1.getX() * (p2.getY() - p3.getY()) + 
						p2.getX() * (p3.getY() - p1.getY()) + 
						p3.getX() * (p1.getY() - p2.getY()));
	}
	
	public double getPerimeter() {
		return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
	}
	
	public boolean contains(MyPoint p) {
		double k1 = ((p.getX() - p1.getX()) * (p2.getY() - p1.getY()) - 
					(p.getY() - p1.getY()) * (p2.getX() - p1.getX())) * 
					((p3.getX() - p1.getX()) * (p2.getY() - p1.getY()) - 
					(p3.getY() - p1.getY()) * (p2.getX() - p1.getX()));
		double k2 = ((p.getX() - p1.getX()) * (p3.getY() - p1.getY()) - 
					(p.getY() - p1.getY()) * (p3.getX() - p1.getX())) * 
					((p2.getX() - p1.getX()) * (p3.getY() - p1.getY()) - 
					(p2.getY() - p1.getY()) * (p3.getX() - p1.getX()));
		double k3 = ((p.getX() - p2.getX()) * (p3.getY() - p2.getY()) - 
					(p.getY() - p2.getY()) * (p3.getX() - p2.getX())) * 
					((p1.getX() - p2.getX()) * (p3.getY() - p2.getY()) - 
					(p1.getY() - p2.getY()) * (p3.getX() - p2.getX()));
		if(k1 > 0 && k2 > 0 && k3 > 0)
			return true;
		else
			return false;
		
	}
	
	public boolean contains(Triangle2D t) {
		if(contains(t.p1) && contains(t.p2) && contains(t.p3))
			return true;
		else
			return false;
	}
	
//	public boolean overlaps(Triangle2D t) {
//		if(this.contains(t) || t.contains(this))
//			return false;
//		else if((this.contains(t.getP1()) && 
//				this.contains(t.getP2()) && 
//				this.contains(t.getP3()) && 
//						t.contains(this.p1) && 
//						t.contains(this.p2) && 
//						t.contains(this.p3)) == false)
//				return true;
//		else if()
}
