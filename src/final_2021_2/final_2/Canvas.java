package final_2021_2.final_2;

public class Canvas {
	
	private Shape[] shapes;
	private int counter = 0;
	
	public Canvas(int n) {
		shapes = new Shape[n];
	}
	
	public void add(Shape s) {
		if (counter == shapes.length) {
			Shape[] temp = new Shape[counter*2];
			for (int i = 0; i < counter; i++)
				temp[i] = shapes[i];
			shapes = temp;
		}
		shapes[counter] = s;
		counter += 1;
	}
	
	public double totalArea() {
		double total = 0;
		for (int i = 0; i < counter; i++) {
			Shape shape = shapes[i];
			if (shape instanceof Circle) {
				total += ((Circle) shape).area();
			} else if (shape instanceof Rectangle) {
				total += ((Rectangle) shape).area();
			}
			// Add other shape types as necessary
		}
		return total;
	}
	
	public static void main(String[] args) {
		new Canvas(4);
	}

}
