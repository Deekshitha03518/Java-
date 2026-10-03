import java.util.Scanner;

public class Main{
    public static void main(){

        Scanner scanner = new Scanner(System.in);

        double r;
        System.out.print("Enter the radius:");
        r=scanner.nextDouble();

        double Area,Circumference,Volume;

        Circumference= 2*Math.PI*r;
        Area=Math.PI*Math.pow(r,2);
        Volume=(4.0/3.0)*Math.PI*Math.pow(r,3);

        System.out.println("The circumference is  " + Circumference);
        System.out.println("The Area is " + Area);
        System.out.print("The Volume is " + Volume);

        scanner.close();

    }
}