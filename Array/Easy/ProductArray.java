public class ProductArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int product = 1;
        
        for (int num : array) {
            product *= num;
        }
        
        System.out.println("Product of all elements: " + product);
    }
}
