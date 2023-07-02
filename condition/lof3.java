package condition;
import java.util.*;
public class lof3 {

    public static void main(String[] args)

    {


try(Scanner scanner = new Scanner(System.in)){


    int a= scanner.nextInt();
    int b= scanner.nextInt();
    int c= scanner.nextInt();


    if(a==b && b==c)
   {

   System.out.println("all are equal");     
        

    }


    else if(a>b && a>c) //here we check everything for a
    {


        System.out.println(a+ "  is greatest");

    }

    else if(b>c) // as in the above case we checked for a>b here we will just check for b>c

    {

        System.out.println(b+ "  is greatest");
    }
    

    else{

        System.out.println(c+ "  is greatest");
    }
 
}

    }
    
}
