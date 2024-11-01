//name: ProgrammerJohn
//pgm desc: demo use of method overloading
//
class FigureXYZ{
    double Xcoord, Ycoord, Zcoord;

    public void move(double x ) {
        Xcoord = x;
        System.out.println("x: " + Xcoord + " y: " + Ycoord + " z: " + Zcoord);
    }
    public void move(double x, double y){
        Xcoord = x;
        Ycoord = y;
        System.out.println("x: " + Xcoord + " y: " + Ycoord + " z: " + Zcoord);
    }
    public void move(double x, double y, double z){
        Xcoord = x;
        Ycoord = y;
        Zcoord = z;
        System.out.println("x: " + Xcoord + " y: " + Ycoord + " z: " + Zcoord);
    }
}
public class java51MethodOverload {
    public static void main(String[] args) {
        FigureXYZ f1 = new FigureXYZ();   //create object from class template

        f1.move(25);
        f1.move(25,75);
        f1.move(25,75,125);
    }
}
