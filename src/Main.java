public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.62;
        double weightKG = 40;
        double bmi = service.calculate(heightM, weightKG);
        int bodyMassIndex = (int) bmi;
        System.out.println(" Body mass index is " + bodyMassIndex);
    }
}