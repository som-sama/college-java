package programs;
import java.util.Scanner;
import java.util.Arrays;
public class nine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Enter the size of the array");
            int size = in.nextInt();
            int[] arr = new int[size];
            System.out.println("Enter the elements: ");
            for(int i =0 ; i<=arr.length-1; i++){
                arr[i] = in.nextInt();
            }
            System.out.println("The elements are: ");
            for(int i= 0; i<arr.length-1; i++){
                System.out.println(arr[i] + " ");
            }
            Arrays.sort(arr);
            System.out.println("The sorted array in ascending order is: ");
           for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
           }
            reverse(arr);
           System.out.println("The sorted array in descending order is: " + Arrays.toString(arr));
         
        }finally{
            in.close();
        }
    }
    public static void reverse(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
}
