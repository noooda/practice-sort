import io.github.noooda.sort.Sort;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {42, 7, 88, 15, 63, 29, 91, 4, 36, 58, 19, 77, 19, 84, 53, 6, 70, 97, 24, 31};
        int[] sorted_array = Sort.bubble(array);
        System.out.println(Arrays.toString(sorted_array));
    }
}

