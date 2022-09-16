import java.util.HashSet;
import java.util.Set;

public class SmallestPositive {
    public static void main(String[] args) {
        //A = [1,3,6,4,1,2]

        //int A[] = {1,3,6,4,1,2};
        //int A[] = {1,2,3}
        int A[] = {-1,-2};
        System.out.println();
    }

    private static int solution(int[] A) {
        //wrtite your code in java SE8

        int min = 1;
        int size = A.length;

        Set<Integer> hs = new HashSet<>();

        for(int i=0;i<size;i++)
        {
            if(A[i] > 0) {
                hs.add(A[i]);
            }
        }

        for(int i : hs)
        {
            min = Math.min(i, min);

            if(!hs.contains(min)) {
                return min;
            }

            min = min + 1;
        }
        return min;
    }
}
