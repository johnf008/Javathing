//John F
//demonstrate usage of Boolean Wrapper Class

public class java59WrapperClassPractice3 {
    public static void main(String[] args){

        String stringValue = "true";
        Integer intValue = 1;

        //Converting String to Boolean
        Boolean stringBoolean = Boolean.valueOf(stringValue);   //true

        //Converting Integer to boolean
        Boolean intBoolean = (intValue > 0);   //true

        System.out.println("String to Boolean: " + stringBoolean);
        System.out.println("Integer to Boolean: " + intBoolean);
    }
}
