//Name: ProgrammerJohn
//pgm desc: Show use of class setup, object creation, and interacting with user
//
import java.util.Scanner;

class Doctor
{
    String speciality;
    int years;

    void consults()
    {
        System.out.println(speciality + " consultation ");
    }

    void performs_Procs()
    {
        System.out.println("Performing procedure");
    }

    void prescribe_Meds()
    {
        System.out.println("Prescribing meds");
    }
}
public class doctorDriver
{
    public static void main(String[] args)
    {
        Scanner scObj = new Scanner(System.in);

        String answer;

        Doctor neuro = new Doctor();
        neuro.speciality = "brainDR";
        neuro.years = 12;
        neuro.consults();

        Doctor gastro = new Doctor();
        gastro.speciality = "stomachDr";
        gastro.years = 12;
        gastro.consults();

        Doctor cardio = new Doctor();
        cardio.speciality = "heartDR";
        cardio.years = 8;
        cardio.consults();

        Doctor podia = new Doctor();
        podia.speciality = "footDR";
        podia.years = 5;
        podia.consults();

        boolean active = true;
        while (active)
        {

            System.out.println("Select your ailment: head, stomach, chest, feet");
            answer = scObj.nextLine();

            System.out.println("You selected: " + answer);

            if(answer.equals("head"))
            {
                neuro.consults();
            }
            else if(answer.equals("stomach"))
            {
                gastro.prescribe_Meds();
            }
            else if(answer.equals("chest"))
            {
                cardio.performs_Procs();
            }
            else if (answer.equals("feet"))
            {
                podia.consults();
            }
            else
            {
                System.out.println("Invalid entry; please try again");
            }
        }
    }
}
