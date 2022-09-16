
public class StringLength {

    public static void main(String[] args) {
        String str = "Sumit";

        System.out.println("Length of String = "+getLength(str));
    }
    
    private static int getLength(String str)
    {
        str = str + "\0";
        
        char ch[] = str.toCharArray();
        
        int i = 0;
        while(ch[i] != '\0')
        {
            i++;
        }
        return i;
    }
}
