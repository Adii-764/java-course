import java.util.*;

public class pq3{

public static void main(String[] args)
{
    try(Scanner B= new Scanner(System.in)){

        float pencil = B.nextFloat();
            float pen = B.nextFloat();
        float eraser = B.nextFloat();
                
         


        System.out.println((pencil+0.18*pencil)+(pen + pen*0.18)+(eraser+eraser*0.18));
}
}

}