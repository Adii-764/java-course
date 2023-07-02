package operators;
import java.util.*;

public class airthemetic_operators {

    public static void main(String[] args){

try(Scanner sc =new Scanner(System.in)){

        int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("sum is" +(a+b));   //binary because it has two operands
    System.out.println("subtract is" +(a-b));   
    System.out.println("product is" +(a*b));   
    System.out.println("division is" +(a/b));   
    System.out.println("mod is" +(a%b)); 
    
    System.out.println(a++);//it prints a because it will use it then store post incrementor
    a++;

    System.out.println(a);// here it will print a+2 because it was increased

  
    System.out.println(++a);//here it will increase by 1 instantly 


}

    }
    
}
