import java.util.Scanner;
public class Code7{
    public static void main(){

//        Weight Conversion Program

        Scanner scanner = new Scanner(System.in);

        double weight,newWeight;
        int choice;

        System.out.println("Weight Conversion program");
        System.out.println("1.Convert lbs to kgs");
        System.out.println("2.Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice==1){
            System.out.print("Enter the weight in lbs: ");
            weight=scanner.nextDouble();
            newWeight=weight*0.453592;
            System.out.print("The new weight in kgs is " + newWeight);
        }
        else if(choice==2){
            System.out.print("Enter the weight in kgs: ");
            weight=scanner.nextDouble();
            newWeight=weight*2.20462;
            System.out.print("The new weight in lbs is: " + newWeight);
        }
        else{
            System.out.println("Choice is not valid");
        }

        scanner.close();

    }
}