import java.util.Scanner;

public class Code8{
    public static void main(){

        Scanner scanner  = new Scanner(System.in);

        double temp,newTemp;
        String unit;

        System.out.print("Enter the temperature:");
        temp=scanner.nextDouble();

        System.out.print("Convert to celsius or Fahrenheit? (C or F):");
        unit = scanner.next();

//       ternary operator:(condition)? true:false
        newTemp = (unit.equals("C"))? (temp-32)*5/9 : (temp*5/9)*32;

        System.out.println(newTemp + unit);

        scanner.close();
    }
}