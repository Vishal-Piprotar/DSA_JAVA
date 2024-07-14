/**
 * ReverseNumber
 */
public class ReverseNumber {

    public static void main(String[] args) {
        int n =123456;

        // // using loop
        // int sum=0;
        // while(n>0){
        //     int lastDigit = n%10;
        //     sum =sum*10+lastDigit;
        //     n/=10;
        // }
        // System.out.println(sum);


        //using string
        String number = new StringBuilder(String.valueOf(n)).reverse().toString();
        int reverse =  Integer.parseInt(number);
        System.out.println(reverse);
    }
}