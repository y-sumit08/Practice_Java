import java.util.Arrays;

public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "abccccdd";
        getLongestPalindrome(s);
    }

    private static void getLongestPalindrome(String s)
    {
        int hm[] = new int[128];

        for(char ch : s.toCharArray())
        {
            hm[ch]++;
        }
        System.out.println(Arrays.toString(hm));
    }
}
