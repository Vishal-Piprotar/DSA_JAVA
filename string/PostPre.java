package string;
public class PostPre {
    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String op : operations) {
            if (op.equals("++X") || op.equals("X++")) {
                x++;
            } else if (op.equals("--X") || op.equals("X--")) {
                x--;
            }
        }

        return x;
    }

    public static void main(String[] args) {
        // PostPre sol = new PostPre();
        String[] operations = {"++X", "X++", "--X", "X--", "X++"};
       int result = finalValueAfterOperations(operations);
       System.out.println(result);
    }
}
