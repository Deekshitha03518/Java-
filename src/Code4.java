import java.util.Scanner;
public class Code4{
    void main(){

        Scanner scanner = new Scanner(System.in);

        double principal,rate,amount;
        int time,years;

        System.out.print("Enter principal amount:");
        principal=scanner.nextDouble();
        System.out.print("Enter the rate:");
        rate=scanner.nextDouble();
        System.out.print("Enter the time:");
        time=scanner.nextInt();
        System.out.print("Enter the years:");
        years=scanner.nextInt();

        amount=principal*Math.pow(1+rate/time,time*years);

        System.out.print("The amount after " + years + " year is " + amount);
        scanner.close();
    }
}