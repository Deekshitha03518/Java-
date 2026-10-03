import java.util.Scanner;
public class Code3{
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        double a,b,c;

        System.out.print("Enter the value of a:");
        a = scanner.nextDouble();
        System.out.print("Enter the value of b:");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.printf("The hypotenuse is %2f " , c);

        scanner.close();
    }
}