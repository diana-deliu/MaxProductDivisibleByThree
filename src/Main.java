import java.util.Arrays;
import java.util.List;

/**
 * Created by Diahne on 30.05.2018.
 */
public class Main {

    public static void main(String... args) {
        List<Integer> numbers = Arrays.asList(1, 0, 53, 55, 5, 53);
        System.out.println(computeMaxProductWhichDividesByThree(numbers));
    }

    public static int computeMaxProductWhichDividesByThree(List<Integer> numbers) {
        int maxDivByThree = -1000;
        int max = -1000;

        for (Integer number : numbers) {
            if (number > maxDivByThree && number % 3 == 0) {
                max = maxDivByThree;
                maxDivByThree = number;
            } else if (number > max ) {
                max = number;
            }
        }

        return maxDivByThree * max;
    }
}
