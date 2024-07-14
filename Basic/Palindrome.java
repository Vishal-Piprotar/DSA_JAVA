/**
 * Palindrome
 */
public class Palindrome {

    public static void main(String[] args) {
        int n  =1234321;
        int original = n;
        int ans = 0;
        while(n>0){
            int last = n%10;
            ans=ans*10+last;
            n/=10;

        }
        if(original==ans){
            System.out.println("palindrom");
        }else{
            System.out.println("NOt palindrom");
        }
    }
}