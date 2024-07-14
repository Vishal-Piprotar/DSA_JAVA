/**
 * Test
 */
public class Test {

    // static int count = 0;
    // public static void print(){
    // if(count==3){
    // return;
    // }
    // System.out.println(count);
    // count++;
    // print();

    // }

    // public static void print(int i,int n){
    // if(i>n){
    // return;
    // }
    // System.out.println("vishal");
    // print(i+1, n);
    // }
    // public static void main(String[] args) {
    // int n=4;
    // print(1,n);
    // }

    // public static void print(int i,int n){
    // if(i>n){
    // return;
    // }
    // System.out.println(i);
    // print(i+1, n);
    // }
    // public static void main(String[] args) {
    // int n=4;
    // print(1,n);
    // }

    // public static void print(int i, int n){
    // if(i<1){
    // return;
    // }
    // System.out.println(i);
    // print(i-1, n);
    // }

    // public static void main(String[] args) {
    // int n=4;
    // print(n,n);
    // }

    // public static void sum(int n){
    // int Sum=0;
    // for (int i = 1; i <=n; i++) {
    // Sum+=i;
    // }
    // System.out.println(Sum);

    // }

    // public static void sum(int n){
    // int ans = n*(n+1)/2;
    // System.out.println(ans);
    // }

    // public static void print(int i,int sum){
    // if(i<1){
    // System.out.println(sum);
    // return;
    // }

    // print(i-1, sum+i);

    // }
    // public static void main(String[] args) {
    // int n=5;
    // print(n,0);
    // }

    // public static long factorial(int n) {
    // if (n <= 1) {
    // return 1;
    // } else {
    // return n * factorial(n - 1);
    // }
    // }

    // public static void main(String[] args) {
    // int number = 5; // Example number to calculate factorial
    // long result = factorial(number);
    // System.out.println("Factorial of " + number + " is " + result);
    // }

    // public static void reverse(int arr[],int start , int end){
    // if(start>=end){
    // return;
    // }

    // int temp =arr[start];
    // arr[start]=arr[end];
    // arr[end]=temp;

    // reverse(arr, start+1, end-1);
    // }

    // public static void main(String[] args) {
    // int arr[] ={1,2,3,4,5};

    // reverse(arr,0,arr.length-1);
    // for (int i : arr) {
    // System.out.print(i+" ");
    // }
    // }

    // public static boolean isPalindrome(String str, int start, int end) {
    //     // Base case: if the start index is greater than or equal to the end index
    //     if (start >= end) {
    //         return true;
    //     }

    //     // Check if the characters at start and end are different
    //     if (str.charAt(start) != str.charAt(end)) {
    //         return false;
    //     }

    //     // Recur for the remaining substring
    //     return isPalindrome(str, start + 1, end - 1);
    // }

    // public static void main(String[] args) {
    //     String str = "raj"; // Example string

    //     // Check if the string is a palindrome
    //     if (isPalindrome(str, 0, str.length() - 1)) {
    //         System.out.println(str + " is a palindrome.");
    //     } else {
    //         System.out.println(str + " is not a palindrome.");
    //     }
    // }


    public static int fib(int n){
        if(n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
