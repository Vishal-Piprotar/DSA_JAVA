public class Basic2DArray {
    public static void main(String[] args) {
      
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        
        System.out.println("Element at row 2, column 3: " + array[1][2]); 

    
        System.out.println("The 2D array is:");
        for (int i = 0; i < array.length; i++) { 
            for (int j = 0; j < array[i].length; j++) { 
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); 
        }

       
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum); 

        
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Maximum element: " + max); 
    }
}
