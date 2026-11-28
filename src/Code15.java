import java.util.Scanner;
import java.util.Random;

public class Code15 {
    public static void main(){

        //Java Dice Roller Program

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total=0;

        while(true){
            System.out.print("Enter the number of dice to roll: ");
            numOfDice = scanner.nextInt();

            if (numOfDice == 0) {
                System.out.println("Program Stopped");
                break;
            }
            if (numOfDice > 0) {
                for (int i = 0; i < numOfDice; i++) {
                    int roll = random.nextInt(1, 7);
                    printDie(roll);
                    System.out.println("You rolled: " + roll);
                    total += roll;
                }
                System.out.println("Total: " + total);
            } else {
                System.out.println("Number of dice must be greater than 0");
            }
        }
        Scanner close;
    }

//To get the bullet point: Click Window+R and type charmap > Enter> Scroll down > Apply and copy> Paste

    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;
        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("INVALID roll");
        }
    }
}