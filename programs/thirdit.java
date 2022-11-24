package programs;
import java.util.Scanner;

//Question number 3 but using iteration
public class thirdit{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
        System.out.println("Enter the number of times ");
        int n = in.nextInt();
            int num1 = 0, num2 = 1, num3;
            System.out.print("The fibonacci series is as follows: ");

            if(n == 0 || n == 1){
                System.out.print(num1 + "");
            }
            else{
                System.out.print(num1 + " " + num2 + " " );
                for(int i = 2; i<n; i++){
                    num3 = num1 + num2 ;
                    System.out.print(num3 + " ");
                    num1 = num2;
                    num2 = num3;
                }
            }        
        }finally{
            in.close();
        }
    }
}
