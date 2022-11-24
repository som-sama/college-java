import java.util.Scanner;
//Question
//Write a program to find the factorial of a given number
public class second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       try{
          System.out.println("Enter the number");
        int n = in.nextInt();
        int fact = 1;
        for(int i = 1 ; i<=n; i++){
            fact = fact * i;
        } 
        System.out.println("The factorial of a number is " + fact);
    }finally{
        in.close();
    }
    }
}
