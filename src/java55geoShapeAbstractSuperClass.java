//name: Programmer John
//pgm desc: practice setting up a super abstract class and subclass that extends it
//

abstract class GeoShape{    //abstract "super" class
    String name;

    public abstract void getArea();     //abstract method with out code
                                        //implemented by subclass
    public void setName(String n){    //regular method defined with code
        name = n;
        System.out.println("Shape name method: " + this.name);
    }
}

class Triangle extends GeoShape{  //subclass
    @Override
    public void getArea() {
        System.out.println(this.name + " area formula: (base * height) / 2");
    }
    public void findSinCosTan(){   //method for triangle implemented here
        System.out.println("The SinCosTan are:   ......... ");
    }
}
class Circle extends GeoShape{   //subclass
    public void getArea(){
        System.out.println(this.name + " area formula: pi * radius squared");
    }
    public void findCircumference(double radius){    //method for circle implemented here
        double circumference;
        circumference = 2 * Math.PI * radius;
        System.out.println("The circumference is: " + circumference);
    }
}
class Square extends GeoShape{      //subclass
    public void getArea(){
        System.out.println(this.name + " area formula: Length * Width");
    }
    public void findPerimeter(double side){
        double peri = side * 4;
        System.out.println("The perimeter of a square of side: " + side + " is " + peri);
    }
}
public class java55geoShapeAbstractSuperClass {
    public static void main(String[] args){

        Triangle triangle = new Triangle();   //create object for triangle
        Circle circle = new Circle();        //create object for circle
        Square square = new Square();       //create object for square

        circle.setName("Circle");
        circle.getArea();      //call the area method for circle
        circle.findCircumference(7.5);

        System.out.println(" ");

        triangle.setName("Triangle");
        triangle.getArea();   //call the area method for triangle
        triangle.findSinCosTan();

        System.out.println(" ");

        square.setName("Square");
        square.getArea();  //call the area method for square
        square.findPerimeter(12);
    }
}
