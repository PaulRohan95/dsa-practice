public class max_element {
    public static void main(String[] args) {
        int[] arr = {7, 8, 19, 11, 19, -2, 0, -19, 19};
        int max = arr[0];

        if (arr.length == 0) {
            System.out.println("Array should not be empty");
        }
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            } else if (arr[i] == max) {
                count++;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}