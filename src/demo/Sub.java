package demo;

public class Sub extends Parent {
	public Sub() {
		
	}
	
	@Override
	public String tostring(String s) {
		return "这是一个子类：" + s;
	}
	
	public String gets() {
		return "子类";
	}
}
