import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random rd = new Random();

        // generating a number
        int gen = rd.nextInt(100);

        System.out.println("---Number Guessing Game---");

        int guessedNumber;
        System.out.println("You have only 5 attempts");
        System.out.println("You achieve 5 points in each and every correct guess.");
        System.out.println("Guess a number in range of 1 to 100:");

        String choice;
        int score = 0;

        do{
            for(int i=1; i<=5; i++){
                System.out.println("Attempt "+i+":");
                guessedNumber = kb.nextInt();

                if(1 <= guessedNumber && 100 >= guessedNumber){
                    if(guessedNumber < gen){
                        System.out.println("Too Low!");
                    }
                    else if(guessedNumber == gen){
                        System.out.println("EXCELLENT! Your guess is correct..");
                        System.out.println("The number is: "+gen);
                        for(int j=5; j == 5; j++){
                            score+= j;
                            System.out.println("Your Total score is "+score);
                        }
                    }
                    else {
                        System.out.println("Too High!");
                    }
                }
                else{
                    System.out.println("Please enter the number in range of 1 to 100");
                }

            }
            // Ask a played to continue playing a game or not
            System.out.println("Again wants to Try?  Say(Yes/No)");

            kb.nextLine(); // for clearing buffer
            choice = kb.nextLine();
        }while(choice.equalsIgnoreCase("yes"));

    }
}


