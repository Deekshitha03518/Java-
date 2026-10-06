import java.util.Random;
import java.util.Scanner;
public class Code10{
    public static void main(){

//        Number guessing game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess,attempts=0,randomNumber=random.nextInt(1,11);

        System.out.print("Number guessing game");
        System.out.println("Guess the number between 1-10: ");

        do{
            System.out.print("Enter a guess: ");
            guess=scanner.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("Too low! Try again");
            }
            else if(guess>randomNumber){
                System.out.println("Too high! Try again");
            }
            else{
                System.out.println("Yayyy!! The correct number was "+ randomNumber);
                System.out.println("# of attempts: "+attempts);
            }
        }while(guess!=randomNumber);

        System.out.println("You won");

        scanner.close();
    }
}