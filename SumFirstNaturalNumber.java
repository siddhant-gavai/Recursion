public class SumFirstNaturalNumber {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = sum(n - 1);
        int sum = n + snm1;
        return sum;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
}
