package lab02;

public class Task9 {

    public static void main(String[] args) {
        printResults(0, 1);
        printResults(1, 1);
        printResults(4, 1);
        printResults(3, 3);
        printResults(0, 3);
        printResults(4, 2);
        printResults(1, 2);
        printResults(9, 4);
        printResults(0.25, 6);
        printResults(-1, 1);
        printResults(-4, 3);
        printResults(0, 2);
        printResults(-1, 2);
        printResults(1, 0);
        printResults(1, -5);
        printResults(Double.NaN, 1);
        printResults(Double.NaN, 2);
        printResults(Double.POSITIVE_INFINITY, 1);
        printResults(Double.POSITIVE_INFINITY, 2);
        printResults(Double.MAX_VALUE, 1);
    }

    public static double x(double t, int l) {
        if (l < 1) {
            throw new IllegalArgumentException("param l = " + l);
        }

        double term;
        if (l % 2 != 0) {
            if (t < 0) {
                throw new IllegalArgumentException("param t = " + t);
            }
            term = Math.sqrt(t * l);
        } else {
            if (t <= 0) {
                throw new IllegalArgumentException("param t = " + t);
            }
            term = l / Math.sqrt(t);
        }

        double sum = 0;
        for (int i = 1; i <= l; i++) {
            sum += term;
        }
        return sum;
    }

    static void printResults(double t, int l) {
        System.out.print("t:" + t + " l:" + l + " result:");
        try {
            System.out.println(x(t, l));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
