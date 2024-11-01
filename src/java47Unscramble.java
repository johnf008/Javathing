//name: John
//pgm desc:  demonstrate Usage of the constructor

class Employee{
    String name;
    Integer empId;
    String role;
    double salary;

    Employee (String n, int id, String job, double comp)   //constructor to initialize
    {
        name = n;
        empId = id;
        role = job;
        salary = comp;
    }
    void printEmp(){
        System.out.println("Employee details: " + name + " " + empId + " " + role + " " + salary);

    }
    void updateEmp() {
        if (role.equals("sales")){
            salary = 500.00;
            empId = 111;
        }
        else if (role.equals("admin")){
            salary = 600.00;
            empId = 222;
        }
        else if (role.equals("super")){
            salary = 700.00;
            empId = 333;
        }
        else{      //role is a "mgr
            salary = 900.00;
            empId = 555;
        }
    }
}
public class java47Unscramble {
    public static void main(String[] args){
        Employee empL1 = new Employee("jonSales", 0, "sales", 0.00);
        Employee empL2 = new Employee("jillAdmin", 0, "admin", 0.00);
        Employee empL3 = new Employee("mikeSuper", 0, "super", 0.00);
        Employee empL4 = new Employee("maryMGR", 0, "mgr", 0.00);

        empL1.printEmp();
        empL2.printEmp();
        empL3.printEmp();
        empL4.printEmp();

        empL1.updateEmp();
        empL2.updateEmp();
        empL3.updateEmp();
        empL4.updateEmp();

        System.out.println(" ");    //line break

        empL1.printEmp();
        empL2.printEmp();
        empL3.printEmp();
        empL4.printEmp();

    }
}
