public class Circle {
    private double raduis = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double raduis) {
        this.raduis = raduis;
    }

    public Circle(double raduis, String color) {
        this.raduis = raduis;
        this.color = color;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "raduis=" + raduis +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea() {
        return Math.PI * raduis * raduis;
    }
}
