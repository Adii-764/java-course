package condition;
import java.util.*;

public class ternary {

    public static void main(String[] args)
    {

        try(Scanner scanner = new Scanner(System.in)){

            int a=scanner.nextInt();


            String c = (a%2!=0)? "odd" : "even";  // ternary operator

            System.out.println(c);

        }
        
    }

    
}
