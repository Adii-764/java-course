package condition;


import java.util.*;

public class income {

    public static void main(String[] args)
    {

        try(Scanner SL = new Scanner(System.in)){

     double a= SL.nextDouble();

     double tax ;


     if(a<500000)
     {

        System.out.println(tax=0);
     }


     else if(a >=500000 && a <1000000)
     {


        tax= 0.20*a;

        

        System.out.println(tax);
     }


     else
     {


        tax=0.30*a;


        

        System.out.println(tax);
     }






 }
    }


    
}
