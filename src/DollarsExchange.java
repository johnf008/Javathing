//name: ProgrammerJohn
//pgm desc: Convert dollar to other currencies.
class Money                         //class blueprint
{
    double X_rate;             //eXchange rate instance variable
    double value;
    String currency;              // type of currency instance variable


    double Converter(int us_amt)          //method converts us dollar to Peso, Euro or Yen
    {
        value = us_amt * X_rate;
        return value;
    }
}
//
public class DollarsExchange
{
    public static void main(String [ ] args)
    {
        Money mp = new Money();                        //create object for Mex Peso
        mp.currency = " Peso ";
        mp.X_rate = 19;

        Money me = new Money();                         //create object for European Euro
        me.currency = " Euro ";
        me.X_rate = 0.84;

        Money my = new Money();                         //create object for Chinese Yuan
        my.currency = " Yuan ";
        my.X_rate = 6.51;

        int dollar = 20;                            //convert input string from command line to int

        mp.value = mp.Converter(dollar);
        System.out.println("Us Dollar: " + dollar + " = " + mp.currency + mp.value);

        me.value = me.Converter(dollar);
        System.out.println("US Dollar: " + dollar + " = " + me.currency + me.value);

        my.value = my.Converter(dollar);
        System.out.println("US dollar: " + dollar + " = " + my.currency + my.value);
    }
}
