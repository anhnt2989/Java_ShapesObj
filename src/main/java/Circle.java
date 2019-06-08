public class Circle extends Shape {
    private double radius;

    Circle() {
        this.radius = 1.0;
    }

    Circle(String color, boolean filled, double radius) {
        super(color,filled);
        this.radius = radius;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean isFilled() {
        return this.filled;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return (2 * radius) * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + getRadius() + ", which is a subclass of " + super.toString();
    }


}
