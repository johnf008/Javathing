//name:ProgrammerJohn
//pgm desc: demonstrate use of wrapper to primitive conversion
public class java58WrapperPractice2 {

    public static void main(String[] args){
        //unboxing (implicit conversion)
        Integer yearObj = 2024;

        int yearPrimitive = yearObj;   ///compiler converts Integer to int

        //Explicit conversion
        Double PiObj = 3.14;

        double piPrimitive = PiObj.doubleValue();   //using wreapper method

        System.out.println("year (Integer): " + yearObj);
        System.out.println("year (int): " + yearPrimitive);
        System.out.println("Pi (Double) object value: " + PiObj);
        System.out.println("Pi (double) primitive: " + piPrimitive);

    }
}
