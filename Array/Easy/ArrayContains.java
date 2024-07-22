public class ArrayContains {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int valueToFind = 5;
        boolean found = false;
        
        for (int num : array) {
            if (num == valueToFind) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Array contains the value " + valueToFind);
        } else {
            System.out.println("Array does not contain the value " + valueToFind);
        }
    }
}
