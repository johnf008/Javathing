//programmerJohn
//pgm desc: demonstrate usage of Wrapper classes to Autobox and Unbox
public class java61WrapperClassPrc5 {
    public static void main(String[] args){
        int primitiveX1 = 23;

        Integer wrapperInt = Integer.valueOf(primitiveX1);  //autoboxing
        int primitiveX2 = wrapperInt;   //unboxing

        System.out.println("Int primitiveX1: " + primitiveX1 + " primitiveX1: " + primitiveX2);

        //
        float primitiveY1 = 9.72F;

        Float wrapperFloat = Float.valueOf(primitiveY1);   //autoboxing

        float primitiveY2 = wrapperFloat;   //unboxing

        System.out.println("float primitiveY2: " + primitiveY1 + " primitiveY2: " + primitiveY2 );
    }
}
