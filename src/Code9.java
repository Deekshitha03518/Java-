import java.util.Scanner;
public class Code9{
    public static void main(){

        Scanner scanner = new Scanner(System.in);

        double num1,num2,result = 0;
        char operator;

        System.out.print("Enter the first number: ");
        num1=scanner.nextDouble();
        System.out.print("Enter an operator(+, -, *, /): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2=scanner.nextDouble();

        switch(operator){
            case '+' -> result=num1+num2;
            case '-' -> result=num1-num2;
            case '*' -> result=num1*num2;
            case '/' -> result=num1/num2;

        }
        System.out.println(result);

        scanner.close();
    }
}