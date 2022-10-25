package Cylinder;

public class Circle {
   double radious;

   public Circle(double radious){
       this.radious = radious;
   }
   public double getRadious(){
       if (radious < 0){
           return radious;
           //this.radious = 0
       }else{
           //this.radious = radious;
           return radious;
       }
   }
   public double getArea(){
       double area= (Math.PI*radious*radious);
       return area;
   }
}
