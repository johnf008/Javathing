//Name: John
//pgm desc: Setup class student blueprint, and make objects from it.
import java.util.Scanner;
class Student
{

    private String Id;
    private double gpa;
    private String label;
    private String pathway;
    private int age;
    private String[ ] schedule;

    void register (){System.out.println("Registration process");}
    void updateProfile(){System.out.println("Update Profile process");}
    void addCourse(){System.out.println("Add course process");}
    void  dropCourse(){System.out.println("drop Course process");}
    void calcGPA(){System.out.println("Calculate GPA process");}
    void getSchedule(){System.out.println("Update profile process");}
}
public class Java21ClassStudent
{
    public static void main(String[] args)
    {
        Student stu = new Student();   //Create and object "stu" from Student class blueprint

        Scanner scIN = new Scanner(System.in);     //create an object "scIN" from Scanner class to use for input

        boolean sysOn = true;

        while(sysOn)
        {
            System.out.println("Make a selection: R-register / U- Update profile/ A- add course / D - drop course/ G- Calculate GPA / S- Get schedule");
            String choice = scIN.nextLine();

            switch(choice)
            {
                case"R": stu.register();
                break;
                case"U": stu.updateProfile();;
                break;
                case "A": stu.addCourse();
                break;
                case"D": stu.dropCourse();
                break;
                case"G": stu.calcGPA();
                break;
                case"S": stu.getSchedule();
                break;
                default: System.out.println("Invalid selection, please try again");
            }
        }
    }
}
