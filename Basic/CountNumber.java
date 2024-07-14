/**
 * CountNumber
 */
public class CountNumber {

    public static void main(String[] args) {
        int n = 123456;
        //using loop
        // int count = 0;
        // while (n > 0) {
        //     int lastDigit = n % 10;
        //     count++;
        //     n /= 10;
        // }

        
        //using string
        // int count = String.valueOf(n).length();


        //optimal math
        int count = (int) Math.floor(Math.log10(n))+1;
        System.out.println(count);
    }
}