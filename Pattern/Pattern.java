public class Pattern {

    public static void main(String[] args) {

        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 5; j++) {
        // System.out.print("*"+" ");
        // }
        // System.out.println();
        // }
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        // for (int i = 0; i <5; i++) {
        // for (int j = 0; j <=i; j++) {
        // System.out.print("*"+" ");
        // }
        // System.out.println();
        // }

        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        // for (int i = 1; i <=5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5

        // for (int i = 1; i <=5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // *****
        // ****
        // ***
        // **
        // *

        // for (int i = 5; i >0; i--) {
        // for (int j = 0; j <i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        // for (int i = 5; i > 0; i--) {
        // for (int j = 1; j <=i; j++) {
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // *
        // ***
        // *****
        // *******
        // *********
        // for (int i = 0; i <5; i++) {
        // for (int j = 0; j < 5-i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j <2*i+1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // ***********
        // *********
        // *******
        // *****
        // ***
        // *

        // for (int i = 5; i>=0; i--) {
        // for (int j = 0; j <5-i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < 2*i+1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // *
        // ***
        // *****
        // *******
        // *********
        // ***********
        // *********
        // *******
        // *****
        // ***
        // *

        // *
        // **
        // ***
        // ****
        // *****
        // ******
        // *****
        // ****
        // ***
        // **
        // *
        // for (int i = 0; i < 6; i++) {
        // for (int j = 0; j <=i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // for (int i = 5; i>=1; i--) {
        // for (int j = 1; j <=i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();
        // }

        // 1
        // 0 1
        // 0 1 0
        // 1 0 1 0
        // 1 0 1 0 1
        // int number=1;
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j <=i; j++) {
        // System.out.print(number+" ");
        // number = (number==1)?0:1;
        // }
        // System.out.println();
        // }

        // 1        1
        // 12      21
        // 123    321
        // 1234  4321
        // 1234554321
        // for (int i = 1; i <= 5; i++) {
        //     // Print numbers in increasing order
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }

        //     // Print spaces
        //     for (int j = 1; j <= 2 * (5 - i); j++) {
        //         System.out.print(" ");
        //     }

        //     // Print numbers again in decreasing order
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print(j);
        //     }

        //     System.out.println(); // Move to the next line after each row
        // }
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        //     int n=1;
        // for (int i = 1; i <=5; i++) {
        //     for (int j = 1; j <=i; j++) {
            
        //         System.out.print(n+" ");
        //         n++;
        //     }
        //     System.out.println();
        // }
//  A 
// A B
// A B C
// A B C D
// A B C D E
        // for (int i = 1; i <=5; i++) {
        //     for (char j = 'A'; j <'A'+i; j++) {
            
        //         System.out.print(j+" ");
              
        //     }
        //     System.out.println();
        // }

        
    }
}