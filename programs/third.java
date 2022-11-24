package programs;
import java.util.Scanner;

//Write a JAVA program to display Fibanocci Series:
//(i) Using Recursion
//(ii) Using Iteration

public class third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
        System.out.println("Enter the number ");
        int n = in.nextInt();
        System.out.print("The fibonacci series is as follows: ");     
        for(int i=1; i<=n; i++){
            System.out.print(Recursive(i) + " " );
        }   
        }finally{
            in.close();
        }
    }
    public static int Recursive(int x){
            if(x==0 || x==1){
                return 0;
            } 
            if(x==2 || x==3){
                return 1;
            }
            return Recursive(x-1) + Recursive(x-2);
    }
}
