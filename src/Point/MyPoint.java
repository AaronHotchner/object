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
	
	//�õ㵽ָ�������ľ���
	public double distance(MyPoint a) {
		return Math.sqrt(Math.pow(a.getX() - this.x, 2)+Math.pow(a.getY() - this.y, 2));
	}
	
	//ָ����(x,y)���˵�ľ���
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2)+Math.pow(y - this.y, 2));
	}
}
