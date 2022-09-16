public class ArrayManipulation {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,6};

        int sum = 0;
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            sum += arr[i];
        }

        int sumOfSeries =  (arr[n-1]*(arr[n-1]+1))/2;
        int result = sumOfSeries - sum;
        System.out.println("missing number : "+ result);

    }
}
