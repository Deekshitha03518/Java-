import java.util.Random;
public class Code2{
    void main(){

        Random random = new Random();

        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1,6);
        number2 = random.nextInt(0,100);
        number3 = random.nextInt(4,360);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }
}