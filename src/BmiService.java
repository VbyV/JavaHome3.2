public class BmiService {
    public double calculate(int m, double h) {
        double h2 = h * h;
        double bmi = m / h2;
        return bmi;
    }
}
