import java.util.Scanner;
public class Code1{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int length,breadth,Area;

        System.out.print("Enter the length:");
        length=scanner.nextInt();
        System.out.print("Enter the breadth:");
        breadth=scanner.nextInt();

        Area=length*breadth;

        System.out.print("The area of rectangle is " + Area);

        scanner.close();
    }
}