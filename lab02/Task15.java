package lab02;

public class Task15 {

    public static void main(String[] args) {
        printResults(0.1);
        printResults(0.001);
        printResults(0.00001);
        printResults(0);
        printResults(-0.5);
        printResults(Double.NaN);
    }

    public static double infiniteSum(double eps) {
        if (!(eps > 0) || Double.isInfinite(eps)) {
            throw new IllegalArgumentException("param eps = " + eps);
        }

        double sum = 0;
        long i = 1;
        double term = 1.0 / 6;
        while (Math.abs(term) >= eps) {
            sum += term;
            i++;
            double denominator = (double) i * (i + 1.0) * (i + 2.0);
            term = ((i % 2 == 1) ? 1.0 : -1.0) / denominator;
        }
        return sum;
    }

    static void printResults(double eps) {
        System.out.print("eps:" + eps + " result:");
        try {
            System.out.println(infiniteSum(eps));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
