//name: programmerJohn
//pgm desc: practice using array objects
import java.util.*;  //need access to Random class from utility package
class StudentCool //class blueprint
{
    String studentName;
    int studentId;
    public void register4Class(){
        Random rand = new Random();  //create an object from the random class

        studentId = rand.nextInt(99999);   //generate a random number for their ID

        if((studentId % 2) == 0)
            System.out.println(studentId + studentName + " has a MWF class schedule");   //even numbered students get MWF schedule
        else
            System.out.println(studentId + studentName + " has a Tu & Thu class schedule");   //odd numbered students get TT schedule
    }
    public void takeTests(){
        System.out.println(studentName + " will ACE the test");
    }
}
public class java66ArrayOfStudentObjects {
    public static void main(String[] args)
    {
        StudentCool [ ] roster =  new StudentCool[4]; //setup array of student type class

        for(int i = 0; i < roster.length; i++){
            roster[i] = new StudentCool();   //create each array element as an object of student class

            switch(i){
                case 0: roster[i].studentName = "Russell"; break;
                case 1: roster[i].studentName = "Tom"; break;
                case 2: roster[i].studentName = "Kim"; break;
                case 3: roster[i].studentName = "Cindy"; break;
            }

            roster[i].register4Class();

            roster[i].takeTests();
        }
    }
}
