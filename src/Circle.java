public class Circle {
    private static final double PI=Math.PI;
    private static double radius;

    public Circle(int radius) {
        Circle.radius=radius;
    }

    public static double getRadius() {
        return radius;
    }
    public static double area(){
        return PI * (radius*radius);
    }
    public static double circumference (){
        return PI * 2 * radius;
    }
}
