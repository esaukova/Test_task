import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrajectoryCalculatorTest {
    @Test
    public void validInputTest() {
        TrajectoryCalculator calculator = new TrajectoryCalculator(6, 45);

        double expected = 3.67;
        double actual = calculator.distanceCalc();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldThrowExceptionWhenNegativeSpeed() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    new TrajectoryCalculator(-6, 45);
                });
    }
    @Test
    public void shouldThrowExceptionWhenSpeedZero() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    new TrajectoryCalculator(0, 45);
                });
    }
    @Test
    public void shouldThrowExceptionWhenAngleOutOfInterval() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    new TrajectoryCalculator(6, 91);
                });
    }
    @Test
    public void shouldThrowExceptionWhenAngleZero() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    new TrajectoryCalculator(6, 0);
                });
    }

}
