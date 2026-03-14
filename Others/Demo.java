public class Demo {
    public static void main(String [] args) {
        int a = 5;
        int c = 9;

        int x = 7;
        int y = 8;

        boolean res1 = ((a < c) && (x < y));
        boolean res2 = ((a > c) && (x < y));
        boolean res3 = ((a < c) || (x < y));
        boolean res4 = ((a > c) || (x < y));

        System.out.println(res1); // true
        System.out.println(!res1); // false
        System.out.println(res2); // false
        System.out.println(!res2); // true
        System.out.println(res3); // true
        System.out.println(!res3); // false
        System.out.println(res4); // true
        System.out.println(!res4); // false
    }
}