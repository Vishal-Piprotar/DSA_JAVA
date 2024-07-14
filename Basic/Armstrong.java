public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int orignal =n;
        int sum =0;
        int power=(int) Math.floor(Math.log10(n))+1;
        while (n>0) {
            int lastDigit = n%10;
            sum = sum+(int)Math.pow(lastDigit, power);
         
            n/=10;
        }
        if(orignal==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("not Arm strong");
        }
    }
}
