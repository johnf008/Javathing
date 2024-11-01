//name: John
//pgm desc: Make a class for ATM
//
    class ATM{
        int atm_No;
        String atm_Location;
        double atm_Amount_initial;
        double atm_Amount_deposit;
        double atm_Amount_withdrawn;

        void get_atm_info( ){
            System.out.println("atm #: " + atm_No);
            System.out.println("ATM total cash amount $: " + atm_Amount_initial);
            System.out.println("atm location: " + atm_Location);
        }
        void set_Deposit(){
            System.out.println("amount deposited $: " + atm_Amount_deposit);
        }

        void get_Withdraw(){
            System.out.println("Amount withdrawn $: " +  atm_Amount_withdrawn);
        }

        void get_read_Card(){
            System.out.println("The card customer info: ");
        }
        ATM(int atmNumber, String atmAdress, double amt){
            atm_No = atmNumber;
            atm_Location = atmAdress;
            atm_Amount_initial = amt;
        }

    }
public class java40BankATM {
    public static void main(String[] args){
        ATM atm1 = new ATM(123, "Commerce", 36000.00);
        ATM atm2 = new ATM(956, "Morgan", 25000.00);


        atm1.get_atm_info();
        atm1.get_read_Card();
        atm1.set_Deposit();
        atm1.get_Withdraw();

        atm2.get_atm_info();
    }
}
