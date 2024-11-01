//Name: ProgrammerJohn
//Pgm desc: Practice using switch
public class java7Switch {
    public static void main(String[]args){

        String day ="JohnDay";
        int count = 0;

        switch (day){
            case("Monday"):
                count++;
                System.out.println("Choice is Monday");
                break;
            case("Tuesday"):
                count++;
                System.out.println("Choice is Tuesday");
                break;
            case("Wednesday"):
                count++;
                System.out.println("Choice is Wednesday");
            case("Thursday"):
                count++;
                System.out.println("Choice is Thursday");
                break;
            case("Friday"):
                count++;
                System.out.println("Choice is Friday");
                break;
            default:
                System.out.println("Invalid day ");

        }
        System.out.println("The day count: " + count);
    }
}
