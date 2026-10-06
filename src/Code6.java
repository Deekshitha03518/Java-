import java.util.Locale;

public class Code6{
    public static void main(){
        String name = "USHA K";

//        Length of a string
        int length = name.length();

//        Gives character in string
        char letter = name.charAt(2);

//        index
        int index = name.indexOf("S");
        int lastindex = name.lastIndexOf("K");

        name = name.toUpperCase();
        name = name.toLowerCase(Locale.ROOT);

//        Remove white space
        name = name.trim();

//        Replacing a letter
        name = name.replace("K","KV");


        System.out.println(name.isEmpty());

//        If name contains space
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }
        else{
            System.out.println("Does not contain space");
        }

        if(name.equals("password")){
            System.out.println("Your name cannot be password");
        }
        else{
            System.out.println("Hello " + name);
        }
    }
}