public class BmiService {
    public double calculate(double heightM, double weightKG) {
        double bmi = weightKG / (heightM * heightM);
        return bmi;
    }
}
