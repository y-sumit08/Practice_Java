import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        Map<Integer, BigInteger> hm = new HashMap<>();
        BigInteger N = fib(n, hm);

        System.out.println(" Fibonacci Series : "+N);
    }

    private static BigInteger fib(int n, Map<Integer, BigInteger> map)
    {
        if(n == 0 || n == 1)
            return new BigInteger(String.valueOf(n));

        if(map.containsKey(n))
        {
            return map.get(n);
        }

        BigInteger fibN = fib(n-1, map).add(fib(n-2, map));
        map.put(n, fibN);
        return fibN;
    }

}
