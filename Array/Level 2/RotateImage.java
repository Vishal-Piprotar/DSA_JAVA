public class RotateImage {

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int [][]matrix){
        

        // A -> A'
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //  reverse  A'

        for (int i = 0; i < matrix.length; i++) {
            int low=0;
            int high=matrix.length-1;
            while (low<high) {
                int temp= matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
            }
        }


    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        rotate(matrix);
        
        System.out.println("Matrix after rotation:");
        printMatrix(matrix);
    }
}
