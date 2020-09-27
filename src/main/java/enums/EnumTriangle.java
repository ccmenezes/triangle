package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumTriangle {
    ISOSCELES("ISOSCELES"),
    SCALENE("SCALENE"),
    EQUILATERAL("EQUILATERAL");

    String triangle;
}
