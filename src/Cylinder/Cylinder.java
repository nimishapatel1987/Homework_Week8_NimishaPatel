package Cylinder;

public class Cylinder extends Circle {

    double height;

    public Cylinder(double radious, double height) {
        super(radious);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

        //Cylinder obj=new Cylinder();
    }

    public double getHeight() {
        return this.height = height;
    }

    public double getVolume() {
        double volume = (getArea() * this.height);
        return volume;
    }
}

