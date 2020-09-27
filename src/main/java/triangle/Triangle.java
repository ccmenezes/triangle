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
        
            if(isEquilateral()) {
                return EnumTriangle.EQUILATERAL.getTriangle();
            }else if(isScalene()){
                return EnumTriangle.SCALENE.getTriangle();
            }
            else {
                return EnumTriangle.ISOSCELES.getTriangle();
            }
    }

    public boolean isEquilateral() throws TriangleMinimumSideException {
        if(!verifyMinimum()) {
            throw new TriangleMinimumSideException(message);
        }

        boolean equilateral = (sideA == sideB) && (sideA == sideC);
        return equilateral;
    }

    public boolean isScalene() throws TriangleMinimumSideException {
        if(!verifyMinimum()) {
            throw new TriangleMinimumSideException(message);
        }
        boolean scalene = (sideA != sideB) && (sideA != sideC) && (sideB != sideC);
        return scalene;
    }

    public boolean isIsosceles() throws TriangleMinimumSideException {
        if(!verifyMinimum()) {
            throw new TriangleMinimumSideException(message);
        }

        boolean condition1 = (sideA == sideB) ? true: false;
        boolean condition2 = (sideA == sideC) ? true: false;
        boolean condition3 = (sideB == sideC) ? true: false;

        if(condition1) {
            return true;
        } else if (condition2) {
            return true;
        } else if (condition3) {
            return true;
        } else {
            return false;
        }
    }

    private boolean verifyMinimum() {
        int minimum = 6;

        if (sideA >= minimum && sideB >= minimum && sideC >= minimum) {
            return true;
        } else {
            return false;
        }
    }

}
