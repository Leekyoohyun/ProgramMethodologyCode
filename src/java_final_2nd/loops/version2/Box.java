package java_final_2nd.loops.version2;

public class Box {
    private int BOX_SIZE;

    public Box(int size) {
        BOX_SIZE = size;
    }

    public boolean inHorizontalContact(int x_pos) {
        return (x_pos - 20 <= 0 || x_pos + 20 >= BOX_SIZE);
    }

    public boolean inVerticalContact(int y_pos) {
        return (y_pos - 20 <= 0 || y_pos + 20 >= BOX_SIZE);
    }

    public int sizeOf() {
        return BOX_SIZE;
    }
}