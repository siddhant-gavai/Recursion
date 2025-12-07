public class FibonacciRecursion {

    // public static int fib(int n) {
    // if (n < 2)
    // return n;

    // return fib(n - 1) + fib(n - 2);
    // }

    public static int fib(int n) {
        if (n < 2)
            return n;
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n)); // Output: 55
    }
}
