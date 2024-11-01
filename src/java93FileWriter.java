//programmerJohn
//program desc: write simple sentences with a range of adjectives embedded

import java.io.*;    //access the input output package from java library
import java.nio.Buffer;
import java.util.Random;
public class java93FileWriter {
    public static void main(String[] args) {

        String[] adjectives = {"cool", "smart", "tired", "fast typer", "regular"}; //array of strings

        Random rObj = new Random();
        rObj.nextInt(9999);

        //setup a "try....catch" blocks any time you are working on a file bc of a possibility of an access error

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("outputTxt.Txt"));  //create object from bufferedWriter class

            for (String x : adjectives) {      //enhanced for loop to iterate thru adjectives
                int rand = rObj.nextInt(9999);
                writer.write(rand + " this is a data in a " + x + " file\n");
            }
            writer.close();   //close the file at the end
        }
        catch(IOException e){     //this block executes if there is a run-time error & prints error data
            e.printStackTrace();
            }
        }
    }



