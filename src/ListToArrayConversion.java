import java.util.Arrays;
import java.util.List;

public class ListToArrayConversion {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,4};

        List<Integer> list = Arrays.asList(arr);

        int array[] = list.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(array));
    }
}
