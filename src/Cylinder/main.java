package Cylinder;

public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("Circle.radius= " + circle.getRadious());
        System.out.println("Circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55,7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadious());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
