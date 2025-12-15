public class TillingProblem {
    public static int tillingProblem(int n) { // 2 X n (Floor Size)
        // Base Case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Kaam
        // Vertical choice
        int fnm1 = tillingProblem(n - 1);

        // Horizontal choice
        int fnm2 = tillingProblem(n - 2);

        int totalways = fnm1 + fnm2;
        return totalways;

    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(tillingProblem(n));
    }
}
