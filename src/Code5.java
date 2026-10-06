public class Code5{
    public static void main(){
        boolean isStudent=true;
        boolean isSenior=true;
        double price=900;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price*=0.7;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price*=0.9;
            }
        }
        else{
           if(isSenior){
               System.out.println("You get a senior discount of 20%");
               price*=0.8;
           }
           else{
               price*=1;
           }
        }
        System.out.println("The price of a ticket is: " + price);
    }
}