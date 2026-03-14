public class strong_number {
    public static void main (String[] args) {
        int a = 145; // number to be determined as a strong number
        int original_integer = a;
        int sum = 0;

        while (a > 0) {
            int last_digit = a % 10;
            int factorial = 1;
            for (int i = 1; i <= last_digit; i++) { // 1, 2, 3, 4, 5
                factorial = factorial * i; // 1, 2, 6, 24, 120
            }
                sum = sum + factorial;
                a = a / 10;
        }
        if (sum == original_integer) {
            System.out.println(sum + " is a strong number");
        } else {
            System.out.println(sum + " is not a strong number");
        }
    }
}