package programs;
import java.util.*;
public class seven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
        System.out.println("Enter the number");
        int x = in.nextInt();
        if(x==0 || x==1)    {
            System.out.println(x + " is neither prime nor composite");
        }
            else{
                for(int i=2; i<=x/2; i++){
                    if(x%i==0){
                        System.out.println(x + " is not a prime number");
                        return;
                    }
                    }
                    System.out.println(x + " is a prime number");
                }
        }finally{
            in.close();
        }
    }
}
