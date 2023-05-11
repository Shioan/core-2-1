import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4, 35);

        Collections.sort(intList);
        for (int i = 0; i < intList.toArray().length; i++) {
            if (intList.get(i) > 0) {
                if (intList.get(i) % 2 == 0) {
                    System.out.println(intList.get(i));
                }
            }
        }
    }
}