import java.util.Scanner;

public class Code11{
    public static void main(){

        Scanner scanner = new Scanner(System.in);

        int rows,columns;
        char symbol;

        System.out.println("Enter the # of rows: ");
        rows= scanner.nextInt();
        System.out.println("Enter the # of colums: ");
        columns= scanner.nextInt();
        System.out.println("Enter the symbol to use: ");
        symbol= scanner.next().charAt(0);

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}