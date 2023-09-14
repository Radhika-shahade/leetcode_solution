package array;

public class MaxAndMinOfArray {
    //to find maximum number of array
    public static int maximumNumberFromArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // to find minimum number of array

    public static int findMinimumNumber(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int arr[] = {3, 5, 77, 8, 9};
        System.out.println(maximumNumberFromArray(arr));
        System.out.println(findMinimumNumber(arr));
    }


}
