package exp13.test3;

class Triangle {
    double sideA, sideB, sideC, area;
    boolean isTriangle;

    public String getArea() {
        if (isTriangle) {
            double p = (sideA + sideB + sideC) / 2.0;
            area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            return String.valueOf(area);
        } else {
            return "无法计算面积";
        }
    }

    public void setA(double a) {
        sideA = a;
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA)
            isTriangle = true;
        else
            isTriangle = false;
    }

    public void setB(double b) {
        sideB = b;
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA)
            isTriangle = true;
        else
            isTriangle = false;
    }

    public void setC(double c) {
        sideC = c;
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA)
            isTriangle = true;
        else
            isTriangle = false;
    }
}
