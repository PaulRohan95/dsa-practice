public class practice {
    public static void main (String[] args) {
        int[] arr = {7, 8, 19, 11, 19, -2, 0, -19, 19};
        if (arr.length == 0) {
            System.out.println("Array size must not be 0");
        }

        int max = arr[0]; 
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count = 1; 
            } else if (arr[i] == max) {
                count++;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Count: " + count);

    }
}

// 1. 8 > 7 --> count --> 0
// 2. 19 > 8 --> count --> 1
// 3. 11 !> 19 --> 