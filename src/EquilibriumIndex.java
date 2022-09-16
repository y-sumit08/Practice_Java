/**
 * Equilibrium index of an array is an index such that the sum of elements at lower index
 * is equal to the sum of elements at higher indexes. For example, in an array A:
 * Example :
 * Input : A[] = {-7,1,5,2,-4,3,0}
 * LSEP
 * Output: 3 LSEP3 is an equilibrium index, because: LSEPA[0] + A[1] + A[2] = A[4] + A[5] + A[6]
 *
 * Input A[] = {1,2,3} LSEP Output: -1
 * A[] = {-7,1,-5,0,-2}
 * Output 1
 * Write a fubction int equilibrium(int[] arr, int n); that given as sequence arr[] of size n,
 * returns an equilibrium index (if any) or -1 if no equilibrium index exists
 */



public class EquilibriumIndex {
    public static void main(String[] args) {

        int arr[] = {-7,1,5,2,-4,3,0};
        //int arr[] = {1,2,3};
        //int arr[] = {1};

        int result = equilibrium(arr,arr.length);
        System.out.println(result);
    }

    /*private static int equilibrium(int arr[], int n) {
        int m = n/2;
        int sum_left = 0;
        int sum_right = 0;

        for(int i=0;i<m;i++)
        {
            sum_left += arr[i];
        }

        for(int j=m+1;j< arr.length-1;j++)
        {
            sum_right += arr[j];
        }

        if(sum_left == sum_left)
        {
            return m;
        }
        return  -1;
    }
*/

    private static int equilibrium(int arr[], int n)
    {
        int left_sum = 0;
        int sum = 0;

        for(int i=0;i<n;i++)
        {
            sum += arr[i];
        }

        for(int i=0;i<n;i++) {
            sum -= arr[i];

            if(left_sum == sum) {
                return i;
            }

            left_sum += arr[i];
         }

        return -1;
    }
}
