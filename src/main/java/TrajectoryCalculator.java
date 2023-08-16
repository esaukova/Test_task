import java.text.DecimalFormat;

public class TrajectoryCalculator {
    protected double g = 9.81;
    protected int angle;
    protected double initSpeed;


    public TrajectoryCalculator(double initSpeed, int angle) {
        if (initSpeed <= 0) {
            throw new IllegalArgumentException(
                    "Начальная скорость не может быть отрицательной или равной 0 "
            );

        }
        if (angle <= 0 || angle >= 90) {
            throw new IllegalArgumentException(
                    "Угол должен быть в диапазоне от 1 до 89"
            );
        }
        this.initSpeed = initSpeed;
        this.angle = angle;
    }

    public double distanceCalc() {
        double cos = Math.cos(Math.toRadians(angle));
        double sin = Math.sin(Math.toRadians(angle));


        double timeOfFlight = 2 * (initSpeed * sin / g);
        double distance = initSpeed * cos * timeOfFlight;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double formattedDistance = Double.parseDouble(decimalFormat.format(distance));

        return formattedDistance;


    }


}
