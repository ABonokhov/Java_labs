public class CalculatorThread extends Thread {
    private int a;
    private double result = 1;

    public CalculatorThread(int a) {
        this.a = a;
    }

    public double getResult() {
        for (int P = 2; P <= a; P++) {
            for (int i = 2; i < P; i++) {
                if (P % 2 == 0) {
                    result *= P;
                }

            }

        }
        return result;
    }
}


