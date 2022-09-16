import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class MagicianAndChocolates {
    public static void main(String[] args) {
        /**
         * Input 1:
         *
         * A = 3
         * B = [6, 5]
         * Input 2:
         *
         * A = 5
         * b = [2, 4, 6, 8, 10]
         */

        int T = 3;
        int A[] = {2,4,6,8,10};

        System.out.println(getMaxChocolates(T,A));
    }

    private static int getMaxChocolates(int T, int arr[])
    {
        Queue<Long> q = new PriorityQueue<>(Collections.reverseOrder());
        long count = 0;

        for(int i=0;i<arr.length;i++)
        {
            q.add((long)arr[i]);
        }

        while(T-- > 0)
        {
            long temp = q.poll();
            count += temp;
            q.add(temp/2);
        }
        return (int) count;
    }
}
