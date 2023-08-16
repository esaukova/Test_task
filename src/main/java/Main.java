public class Main {
    public static void main(String[] args) {
        TrajectoryCalculator calculator = new TrajectoryCalculator(6, 45);

        double result = calculator.distanceCalc();
        System.out.println(result);
    }

}
