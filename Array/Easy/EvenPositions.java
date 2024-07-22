public class EvenPositions {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        
        System.out.print("Elements at even positions: ");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
