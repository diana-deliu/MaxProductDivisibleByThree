import java.util.Arrays;
import java.util.List;

/**
 * Created by Diahne on 30.05.2018.
 */
public class Main {

    public static void main(String... args) {
        List<Integer> numbers = Arrays.asList(99, 81, 5, 3, 102);
        System.out.println(computeMaxProductWhichDividesByThree(numbers));
    }

    public static int computeMaxProductWhichDividesByThree(List<Integer> numbers) {
        int max = 0;
        int secondMax = 0;

        for (Integer number : numbers) {
            if (number > max) {
                if (max % 3 == 0 && number > secondMax) {
                    secondMax = max;
                }
                max = number;
            } else {
                if (number % 3 == 0 && number > secondMax) {
                    secondMax = number;
                }
            }
        }
        return max * secondMax;
    }
}
