public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.62;
        double weightKG = 40;
        int bodyMassIndex = service.calculate(heightM, weightKG);
        System.out.println("Body mass index is " + bodyMassIndex);
    }
}