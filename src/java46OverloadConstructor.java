//name: ProgrammerJohn
//pgm descL Used a Constructor to accept arguments and initializes coordinates of a point
//
class Point3d           //class blueprint
{
    double x;      //instance variable
    double y;
    double z;
//
    Point3d(double ax)
    {
        x = ax;
        y = 1;
        z = 1;
    }
    Point3d (double ax, double ay)
    {
        x = ax;
        y = ay;
        z = 1;
    }
    Point3d (double ax, double ay, double az) // Constructor method; same name as class
    {
        x = ax;
        y = ay;
        z = az;
    }
}
//
public class java46OverloadConstructor {
    public static void main(String[] args){

        Point3d p1 = new Point3d(1.1);       //creates object p & invokes constrictor
                                                //send 1 argument
        System.out.println("p1.x: " + p1.x);
        System.out.println("p1.y:" + p1.y);
        System.out.println("p1.z: " + p1.z );
        //

        Point3d p2 = new Point3d(1.1,3.4);     //creates object p and invokes constructor
                                                                    //sending 2 arguments
        System.out.println("p2.x: " + p2.x);
        System.out.println("p2.y: " + p2.y);
        System.out.println("p2.z: " + p2.z);

        //

        Point3d p3 = new Point3d(1.1, 3.4, -2.8);   //creates object p and invokes constructor
                                                                        //sending 3 arguments
        System.out.println("p3.x: " + p3.x);
        System.out.println("p3.y: " + p3.y);
        System.out.println("p3.z: " + p3.z);
    }
}
