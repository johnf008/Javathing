//programmerJohn
// demonstrate usage of overloaded methods
class Nums{

    String uniqueID;   //instance variable

    public int addNums(int a, int b)    //overloaded method 1/
    {
        return a + b;
    }
    //
    public double addNums(double a, double b)      //overload method 1
    {
        return a + b;
    }
    //
    public double addNums(double a, double b, double c)     //overloaded method 1
    {
        return a + b + c;
    }
    //
    public void setUniqueID(String theID)     //overloaded method 2a
    {
        uniqueID = theID;
        System.out.println("The unique id: " + uniqueID);
    }
    //
    public void setUniqueID(int ssNumber)    //overloaded method 2a
    {
        String numString = "" + ssNumber;
        setUniqueID(numString);
    }
}
public class java52methodOverloading {

    public static void main(String[] args)
    {
        int intSum;     //declare local variables
        double doubleSum;
        double tripleSum;

        Nums n = new Nums();    //create object n from class blueprint Nums

        intSum = n.addNums(3,4); // call/invoke "addNums" sending integer arguments
        System.out.println("The sum of the integers: " + intSum);

        doubleSum = n.addNums(3.14159, 6.59872);   // call addNums sending integer arguments
        System.out.println("The sum of the doubles: " + doubleSum);

        tripleSum = n.addNums(5,3,6);
        System.out.println("The sum of the 3 arguments: " + tripleSum);
        //
        n.setUniqueID("fortytwo");
        n.setUniqueID(42);
    }
}
