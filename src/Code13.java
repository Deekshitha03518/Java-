import java.util.Scanner;
public class Code13 {
    public static void main(){

        //overload methods = methods that share the same name,but different parameters
        //                   signature = name + parameters

        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter the value of a= ");
        a = scanner.nextDouble();
        System.out.print("Enter the value of b= ");
        b = scanner.nextDouble();
        System.out.print("Enter the value of c= ");
        c = scanner.nextDouble();
        System.out.println(add(a,b,c));

        //Another example
        String pizza;
        System.out.println(pizza = bakePizza("Flat bread","Chilli flakes"));

    }
    static double add(double a,double b){
        return a+b;
    }
    static double add(double a,double b,double c) {
        return a + b + c;
    }

    //Another example
    static String bakePizza(String bread){
        return bread;
    }
    static String bakePizza(String bread , String Cheese){
        return bread + " Pizza with " +  Cheese;
    }
    static String bakePizza(String bread , String Cheese,String Origano){
        return bread + Cheese + " " + Origano;
    }
}