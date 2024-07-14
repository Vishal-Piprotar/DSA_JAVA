public class Test {
    public static void printMatrix(int [][]matrix){
        for (int[] row:matrix) {
            for (int num : row) {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    public static void setmetrix0(int [][]matrix){
        int rowCount =matrix.length;
        int columnCount=matrix[0].length;


        // graphical state maark which is zero contains rows and colunm
        boolean []ZeroRow = new boolean[rowCount];
        boolean []ZeroColumn = new boolean[columnCount];


        for (int i = 0; i <rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if(matrix[i][j]==0){
                    ZeroColumn[j]=true;
                    ZeroRow[i]=true;
                }
            }
        }


        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if(ZeroRow[i] || ZeroColumn[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        System.out.println("Before");
        printMatrix(matrix);
        setmetrix0(matrix);
        System.out.println("After");
        printMatrix(matrix);
    }
}
