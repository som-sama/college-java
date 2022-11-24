//Question
//Write a program to find the sum of any number of integers entered as command line arguments

public class first{
    public static void main(String[] args) {
        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
        // int sum  = a + b;
        // System.out.println("The sum is "  + sum);
            int sum = 0;
        System.out.println("The sum is as follows");    
        for(int i = 0; i<args.length; i++){
            System.out.println(args[i]);
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("sum: " + sum);
    }
}