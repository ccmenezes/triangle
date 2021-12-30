package triangle;

import enums.EnumTriangle;
import exceptions.TriangleMinimumSideException;

public class Triangle {

    private int sideA, sideB, sideC;
    private String message = "Each side should be greater than 5.";

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String verifyTriangleType() throws TriangleMinimumSideException {
        if((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            if((sideA == sideB) && (sideA == sideC)) {
               return EnumTriangle.EQUILATERAL.getTriangle();
            } else if ((sideA == sideB) || (sideA == sideC) | (sideB == sideC)) {
                return  EnumTriangle.ISOSCELES.getTriangle();
            } else {
                return EnumTriangle.SCALENE.getTriangle();
            }
        } else {
             throw new TriangleMinimumSideException(message);
        }
    }
}
