//name: programmerJohn
//pgm desc: Demonstrate using an abstract superclass and subclass that inherit from the superclass
abstract class Doctor2 //abstract super class
{
    String name;
    String title;
    int years_exp;
    //
    public abstract void treatPatient();  //abstract method with out code implemented by subclass
    //
    //
    public void prescribeMeds(){   //regular method defined with code
        System.out.println("Go to CVS for your meds from " + this.name);
    }
}
class familyDoctor extends Doctor2 {  //subclass
    //
    public void treatPatient() {  //treatPatient for familyDr implemented here
        name = "Dr. Moreau";
        System.out.println(name + " family Doctor does a patient house visit");

    }
    public void performHouseVisit(){
        System.out.println(name + " family doctor performs house visit");
    }
}
    class surgeonDoctor extends Doctor2 {  //another subclass
        public void treatPatient() {  //treatPatient for surgeon implemented here
            name = "Dr. Jekyll";
            System.out.println(name + " Surgeon Doctor performs surgery on a patient");
        }
        public void performSurgery(){
            System.out.println(name + " surgeon Doctor performs open heart surgery on patient");
        }
    }
    class psychiatrist extends Doctor2  //subclass
    {
        public void treatPatient(){
            name = "Dr. Kramer";
            System.out.println(name + " psychiatrist treats patient by having consultations");
        }
        public void performPsychTests()
        {
            System.out.println(name + " psychiatrist conducts tests on patient");
        }
    }



public class java53AbsractClassDoctor {
    public static void main(String[] args){
        familyDoctor fDr = new familyDoctor(); //create family doctor object
        surgeonDoctor sDr = new surgeonDoctor(); //create surgeon doctor object
        psychiatrist pDr = new psychiatrist(); //create psychiatrist doctor object


        fDr.treatPatient();
        fDr.prescribeMeds();
        fDr.performHouseVisit();

        System.out.println(" ");

        sDr.treatPatient();
        sDr.prescribeMeds();
        sDr.performSurgery();

        System.out.println(" ");

        pDr.treatPatient();
        pDr.performPsychTests();
        pDr.prescribeMeds();

    }
}
