public class BmiService {
    public int calculate(double heightM, double weightKG) {
        double bmi = weightKG / (heightM * heightM);
        int bodyMassIndex = (int) bmi;
        return bodyMassIndex;
    }
}
