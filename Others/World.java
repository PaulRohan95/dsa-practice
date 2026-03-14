import java.util.Scanner;

class World {
    public static void main (String a[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of c: ");
        int c = sc.nextInt();

        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        int result = c * b;
        System.out.println("Results: " + result);
            if (
                result % 3 == 0
                ) {
                System.out.println("Divisible by 3");
            } else {
                System.out.println("Not divisible by 3");
            }
    }
}