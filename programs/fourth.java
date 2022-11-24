package programs;
//Question:
//Write a JAVA program to convert a given Decimal number to its equivalent Binary number.

public class fourth {
    public static void main(String[] args) {
            long n = 01011011;
            int decimal = convertToBinary(n);
            System.out.println("Binary to decimal");
            System.out.print(n +  " = " + decimal);
        }
    public static int convertToBinary(long n){
        int decimalNumber = 0, i = 1;
            long remainder;

            while(n!=0){
                remainder  = n % 10;
                n = n/10;
                decimalNumber = (int) (decimalNumber + remainder * Math.pow(2, i));
                i++;
            }
            return (int) decimalNumber;
    }
}
