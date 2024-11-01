//Name: John
//pgm desc: Show the soda song from 99-0
public class sodaSongJava21
{
    public static void main(String[ ] args)
    {
        int sodaNum = 99;
        String word = "bottles";

        while(sodaNum > 0)
        {
            if (sodaNum == 1)
            {
                word = "bottle";    //singular, as in 1 bottle
            }
            System.out.println(sodaNum + " " + word + " of soda on the wall");
            System.out.println(sodaNum + " " + word + "of soda.");
            System.out.println("take one down. ");
            System.out.println("pass it around. ");

            sodaNum = sodaNum - 1;

            if(sodaNum>0)
            {
                System.out.println(sodaNum + " " + word + " of soda on the wall");
            }
            else
            {
                System.out.println("No more bottles of soda on the wall");
            }
        }   // end while loop
    }   //end main method
} // end class
