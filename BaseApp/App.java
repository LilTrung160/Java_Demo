public class App {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int a = 1;
        int b = 3;

        //xoa tu a -> b => b - a + 1
        int numOfNeedDelete = b - a + 1;
        int[] newArray = new int[arr.length - numOfNeedDelete];
        for (int i = a; i <= b; i++) {
            arr[i] = 0;
        }
    }
}
