public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double myBmi = service.calculate(63, 1.63);
        System.out.println(myBmi);
    }
}
