public class number_of_primes_till_50 {
    public static void main(String[] args){
            int count = 0;
            // int large = 0;
            for (int n = 2; n < 50; n++) {
            boolean isPrime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                System.out.println(n);
                count = count + 1;
            }
        }
            System.out.println(count + " Prime Numbers");
    }
}