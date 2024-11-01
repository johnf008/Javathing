//name: John F
//pgm desc: demonstrate usage of Boolean wrapper class
public class java60WrapperClass4 {

    public static void main(String [] args) {

        int number = (int)(Math.random()*11) +1;

        //autoboxing: primitive int to Boolean object
        Boolean isEven = (number % 2 == 0 );

        if(isEven){
            System.out.println(number + " is even");
        }
        else
            System.out.println(number + " is odd");
    }
}
