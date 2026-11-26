public class Code12{
    public static void main(){

        // method = a block of reusable code that is executed when called()

        String name = "Usha";
        int age = 20;

        if(ageCheck(age)){
            System.out.println("You may SignUp");
        }
        else{
            System.out.println("You must be 18+ to signUp");
        }

        happyBirthday(name,age);

        double result = sqaure(3);
        System.out.println(result);

        System.out.println(cube(2));

        String fullName = getFullname("Usha" , "Gowda");
        System.out.println(fullName);
    }
    static void happyBirthday(String name , int age){
        System.out.println("Happy birthday to you");
        System.out.println("Happy birthday to you " + name);
        System.out.println("Your age is " + age);

    }
    static double sqaure(double number){
        return number*number;
    }

    static double cube(double number){
        return number*number*number;
    }
    static String getFullname(String first,String last){
        return first + " " + last;
    }

    static boolean ageCheck(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}