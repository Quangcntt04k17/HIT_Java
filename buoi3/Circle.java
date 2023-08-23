package buoi3;

public class Circle {
    private double radius;
    public Circle(double radius1)
    {
        radius = radius1;
    }
    public double getArea()
    {
        return 3.14*radius*radius;
    }
    public double getCircumference()
    {
        return 3.14*radius*2;
    }
    public Circle()
    {
  
    }
    public static void main(String[] args) {
        Circle Circle1 = new Circle(8);
        System.out.println(Circle1.getArea());
        System.out.println(Circle1.getCircumference());
    }
}
