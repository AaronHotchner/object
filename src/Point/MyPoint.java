package Point;

public class MyPoint {
	private double x,y;
	
	MyPoint(){
		x = 0;
		y = 0;
	}
	
	MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	//该点到指定对象点的距离
	public double distance(MyPoint a) {
		return Math.sqrt(Math.pow(a.getX() - this.x, 2)+Math.pow(a.getY() - this.y, 2));
	}
	
	//指定点(x,y)到此点的距离
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2)+Math.pow(y - this.y, 2));
	}
}
