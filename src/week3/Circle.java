package week3;

public class Circle {
    private int x;
    private int y;
    private double radius;

    private static double maxRadius = 0.0;

    public Circle() {
        this(0,0,0);
    }

    public Circle(int x, int y, double radius) {
        setX(x);
        setY(y);
        setRadius(radius);
    }

    public static double getMaxRadius() {
        return maxRadius;
    }

    public int getArea() {
        return (int)(Math.PI * Math.pow(this.radius, 2));
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius < 0 ? 0 : radius;
        maxRadius = Math.max(getMaxRadius(), radius);
    }
}
