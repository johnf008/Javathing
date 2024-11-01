//programmerJohn
//pgm Desc: demonstrate use of Wrapper Class
public class java57WrapperPractice {
    public static void main(String[] args){

        //autoboxing - implicit conversion
        int age = 25;

        Integer ageObj = age;    //compiler converts int to Integer object

        //explicit conversion
        double price = 19.99;

        Double priceObj = Double.valueOf(price); //Explicit conversion

        System.out.println("Age (int): " + age);
        System.out.println("age (Integer): " + ageObj);
        System.out.println("price (double): " + price);
        System.out.println("price (Double): " + priceObj);
    }
}
