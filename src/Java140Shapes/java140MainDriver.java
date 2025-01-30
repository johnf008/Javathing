package Java140Shapes;
//programmerJohn
//pgm desc: find the volume of a cube using a main driving program and additional class programs
public class java140MainDriver {
    public static void main(String[] args){
        Circle cShape = new Circle();

        cShape.getArea();
        cShape.getCircumference(24);
        //
        Triangle tShape = new Triangle();

        tShape.getArea();
        //
        Rectangle rShape = new Rectangle();

        rShape.getPerimeter(6);
    }
}
