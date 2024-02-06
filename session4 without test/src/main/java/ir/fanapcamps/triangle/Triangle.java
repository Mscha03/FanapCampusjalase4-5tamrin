package ir.fanapcamps.triangle;

class Triangle {

    double side1, side2, side3;
    Triangle(double side1, double side2, double side3) throws TriangleException {
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)){
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    boolean isEquilateral() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isIsosceles() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    boolean isScalene() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
