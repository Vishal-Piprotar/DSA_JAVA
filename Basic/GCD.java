public class GCD {
    public static void main(String[] args) {
        int num1=15;
        int num2=20;


        // Euclidean algorithm  a=bq+r
        int a = Math.max(num1, num2);
        int b= Math.min(num1, num2);

        while (b!=0) {
            int temp = b;
            b=a%b;
            a=temp;
        }

        System.out.println(a);
    }
}
