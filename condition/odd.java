package condition;
import java.util.*;

public class odd {

    public static void main(String[] args) {


        try( Scanner B=new Scanner(System.in) ){

            int a =B.nextInt();


            if(a==0)
            {

                System.out.println("neither odd nor even");

                

            }
            



           else if(a%2==0 && a!=0)  // we use else if to terminate when first condition is satisfied

            {

                System.out.println(a + "  is  even");

            }

            else{
            
            

                System.out.println(a + " is odd");
            }


        }
    
}
}

