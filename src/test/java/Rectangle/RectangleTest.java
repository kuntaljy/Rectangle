package Rectangle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void should_get_right_area() {
        int with = 2;
        int height = 3;
        int area = 6;

        Rectangle rect = new Rectangle(with, height);
        int area1 = rect.area();

        assertEquals(area1, area);
    }

    @Test
    public void should_get_right_perimeter() {
        int width = 2;
        int height = 3;
        int expect_perimeter = 10;

        Rectangle rectangle = new Rectangle(width, height);
        int actual_perimeter = rectangle.perimeter();

        assertEquals(expect_perimeter, actual_perimeter);
    }
}