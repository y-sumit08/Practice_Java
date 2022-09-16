import java.util.Arrays;

public class ElementPositioninArray {

    public static void main(String[] args) {
         int nums[] = {5,7,7,8,8,0};
         int target = 6;
        //int nums[] = {1,2,3};
        //int target = 1;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target)
    {
        if(nums.length == 1)
        {
            return new int[]{0,0};
        }

        int i=0;
        //int j = nums.length-1;

        int start = 0;
        int end = 0;
        int count = 0;
        //int pos = 0;

        while(i < nums.length)
        {
            if(nums[i] == target)
            {
                if(count == 0)
                {
                    start = i;
                } else {
                    end = i;
                }
                count ++;
            }
            i++;
        }
        if (count == 1)
        {
            if(end > 1)
                return new int[]{end, end};
            else
                return new int[]{start, end};
        }
        else if(count > 1)
        {
            return new int[]{start, end};
        }
        return new int[]{-1, -1};
    }
}
