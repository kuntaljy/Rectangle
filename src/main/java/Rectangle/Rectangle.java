package Rectangle;

public class Rectangle {
    private final int with;
    private final int height;

    public Rectangle(int with, int height) {
        this.with = with;
        this.height = height;
    }

    public int area() {
        return this.with * this.height;
    }

    public int perimeter() {
        return 2 * (this.with + this.height);
    }
}
