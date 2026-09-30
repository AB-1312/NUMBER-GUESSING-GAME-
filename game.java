import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Random random=new Random();
        Scanner scanner=new Scanner(System.in);

        int guess;
        int attempts=0;
        int randomnuber = random.nextInt(1,101);

        System.out.println("Number guessing Game");
        System.out.println("Guess a number between 1-101: ");

        do{
            System.out.print("Enter a guess: ");
            guess=scanner.nextInt();
            attempts++;

            if(guess<randomnuber){
                System.out.println("TOO LOW!");
            }
            else if(guess>randomnuber){
                System.out.println("TOO HIGH!");
            }
            else{
                System.out.println("CORRECT the number was "+randomnuber);
                System.out.println("No. of attempts "+attempts);
            }
        }while(guess!=randomnuber);

        scanner.close();

    }
}