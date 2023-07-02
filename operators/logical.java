package operators;
import java.util.*;

public class logical {
    public static void main(String[] args) {

     try(Scanner s = new Scanner(System.in)){
 

        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        
       

        System.out.println((a==b) &&(b==c));//both are true
        System.out.println((a==b)||(b==c)); //either one  is true 
        System.out.println(!(b==c)); //logical not is for one statement
    





    }    

    
}
}

