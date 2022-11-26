package programs;
import java.util.Scanner;
public class eight {
    public static void main(String[] args) {    
    Scanner in = new Scanner(System.in);
    try{
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<=arr.length-1; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("The elements of the array are: ");
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //part 2
        System.out.println("Enter the number you want to search in the array ");
        int num = in.nextInt();
        for(int i =0; i<=arr.length-1; i++){
            if(num==arr[i]){
                System.out.println("The number is found in index : " + i);
               return;
            }
        }
        System.out.println("The number is not found in the array");
    }finally{
        in.close();
    }
}
}