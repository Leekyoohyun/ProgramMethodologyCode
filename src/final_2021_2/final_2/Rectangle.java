package final_2021_2.final_2;

public class Rectangle extends Shape {
	
	private int garo; // 도형의 가로 길이 
	private int sero; // 도형의 세로 길이 
	
	public Rectangle(int m, int n, int g, int s) {
		super(m,n);
		garo = g;
		sero = s;
	}
	
	public int garo() { return garo; }
	public int sero() { return sero; }
	
	public int area() {
		return garo * sero;
	}

}
