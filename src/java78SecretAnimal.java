//programmerJOhn
//animal guessing game
import java.util.*;
public class java78SecretAnimal {
    public static void main(String[]args){
        String animals[] = {"dog", "cat", "rabbit", "panda", "zebra", "meerkat"};
    //list animal
        int guesses = 5;

        Random random = new Random();

        int length = random.nextInt(animals.length) ;

        //pick random animal
        String randomAnimal = animals[length];


        Scanner scObj = new Scanner(System.in);


        System.out.println("Welcome to the animal guessing game");

        while(guesses > 0){
            //input the guess and convert all characters to lowercase with .lower function
            System.out.println("You have " + guesses + " guesses");


            System.out.println("Guess what animal i'm thinking of: ");
            String guess = scObj.nextLine();

            guess = guess.toLowerCase();


            if (guess.equals(randomAnimal)){
                System.out.println("Congratulations! You guessed correctly: the animal was a " + randomAnimal);
                break;  // exit the loop
            }
            else{
                guesses -=1;  //decreases the guess count
                if (guesses > 0){
                    if((randomAnimal.charAt(0) == guess.charAt(0))){
                        System.out.println("That's not quite right; but your guess starts with the same letter");
                    }
                    else{
                        System.out.println("nope try again! Think of an animal with a different first letter");
                    }
                }

            }
        }
        //out of guess scenario
        if(guesses == 0){
            System.out.println("Sorry you ran out of guesses, the secret animal was " + randomAnimal);
        }

    }
}
