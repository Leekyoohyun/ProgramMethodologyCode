package java_final_2nd.loops;

public class Box {
    private int BOX_SIZE; //상자 크기

    public Box(int size) {
        BOX_SIZE = size;
    }

    public boolean inHorizontalContact(int x_pos) {
        return (x_pos <= 0 || x_pos >= BOX_SIZE);
    }

    public boolean inVerticalContact(int y_pos) {
        return (y_pos <= 0 || y_pos >= BOX_SIZE);
    }

    public int sizeOf() {
        return BOX_SIZE;
    }
}
