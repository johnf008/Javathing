//name: programmerJohn
//pgm desc: fufill the reqs
import java.util.Scanner;
import java.util.HashMap;

public class java123CodeFromReqs {
    public static void main(String[] args){
        Scanner scObj = new Scanner(System.in);
        HashMap<String, Double> hmap = new HashMap<String, Double>();

        for(int i = 0; i < 5; i++) {

            String name = "";
            double grade = 0;
            double grade_average = 0;

            System.out.println("Enter name: ");
            name = scObj.nextLine();

            System.out.println("Enter grade for math: ");
            grade += scObj.nextDouble();


            System.out.println("Enter grade for Geography: ");
            grade += scObj.nextDouble();

            System.out.println("Enter grade for English: ");
            grade += scObj.nextDouble();

            System.out.println("Enter grade for biology: ");
            grade += scObj.nextDouble();

            grade_average = grade / 4;

            if (grade_average >= 90) {
                System.out.println("Awesome: " + grade_average);
            } else if (grade_average >= 80) {
                System.out.println("Terrific: " + grade_average);
            } else if (grade_average >= 70) {
                System.out.println("Good: " + grade_average);
            } else {
                System.out.println("You can do better " + grade_average);
            }

            hmap.put(name, grade_average);

            scObj.nextLine();

        }
        hmap.forEach ( (k,v) -> System.out.println(k + " : " + v));

    }
}
