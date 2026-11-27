package lab02;

public class Task3 {

    public static void main(String[] args) {
        printResults(1, 1);
        printResults(4, 1);
        printResults(4, 2);
        printResults(1, 3);
        printResults(9, 5);
        printResults(0.25, 14);
        printResults(1, 14);
        printResults(1, 15);
        printResults(1, 0);
        printResults(1, -1);
        printResults(1, 20);
        printResults(0, 2);
        printResults(-4, 3);
        printResults(Double.NaN, 2);
        printResults(Double.POSITIVE_INFINITY, 2);
        printResults(Double.MAX_VALUE, 1);
    }

    public static double sumSeries(double z, int k) {
        if (k < 1 || k >= 15) {
            throw new IllegalArgumentException("param k = " + k);
        }
        if (z <= 0) {
            throw new IllegalArgumentException("param z = " + z);
        }

        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += 1.0 / Math.sqrt(z * i) + Math.tan(k / (double) i);
        }
        return sum;
    }

    static void printResults(double z, int k) {
        System.out.print("z:" + z + " k:" + k + " result:");
        try {
            System.out.println(sumSeries(z, k));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
