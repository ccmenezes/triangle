import exceptions.TriangleMinimumSideException;
import org.junit.Test;
import triangle.Triangle;

import static org.junit.Assert.*;

public class TestTriangle {

   private Triangle triangle;

    @Test(expected = TriangleMinimumSideException.class)
    public void testIsNotTriangle () throws TriangleMinimumSideException {

        int sideA = 0;
        int sideB = 10;
        int sideC = 12;
        String message = "Each side should be greater than 5.";

        triangle = new Triangle(sideA, sideB, sideC);
        assertEquals(message, triangle.verifyTriangleType());

    }

   @Test
    public void testTriangleEquilateral() throws TriangleMinimumSideException {
        int sideA = 10;
        int sideB = 10;
        int sideC = 10;
        String type = "EQUILATERAL";

        triangle = new Triangle(sideA, sideB, sideC);

        assertEquals(type, triangle.verifyTriangleType());
    }

    @Test
    public void testTriangleScalene() throws TriangleMinimumSideException {
        int sideA = 18;
        int sideB = 28;
        int sideC = 39;
        String type = "SCALENE";

        triangle = new Triangle(sideA, sideB, sideC);

        assertEquals(type, triangle.verifyTriangleType());
    }

    @Test
    public void testTriangleIsoscelesCondition1() throws TriangleMinimumSideException {
        int sideA = 10;
        int sideB = 10;
        int sideC = 8;
        String type = "ISOSCELES";

        triangle = new Triangle(sideA, sideB, sideC);

        assertEquals(type, triangle.verifyTriangleType());
    }

    @Test
    public void testIsoscelesCondition2() throws TriangleMinimumSideException {

        int sideA = 10;
        int sideB = 8;
        int sideC = 10;
        String type = "ISOSCELES";

        triangle = new Triangle(sideA, sideB, sideC);
        assertEquals(type, triangle.verifyTriangleType());
    }

    @Test
    public void testIsoscelesCondition3() throws TriangleMinimumSideException {

        int sideA = 8;
        int sideB = 10;
        int sideC = 10;
        String type = "ISOSCELES";

        triangle = new Triangle(sideA, sideB, sideC);
        assertEquals(type, triangle.verifyTriangleType());
    }

}
