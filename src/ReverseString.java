import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        //String s = "hello";
    }

    private static void reverseString(char [] s)
    {
        int j = 0;

        char ch[] = new char[s.length];

        for(int i=s.length; i>=0; i--)
        {
            ch[j] = s[i];
            j++;
        }
        System.out.println(Arrays.toString(ch));
    }
}
