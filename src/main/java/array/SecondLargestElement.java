package array;

public class SecondLargestElement {
//using bubble sort
    public static int findSecondLargestElement(int arr[]) {
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length - 2];

    }

    public static void main(String[] args) {
        int arr[] = {6, 44, 67, 1, 99, 45};
        System.out.println(findSecondLargestElement(arr));

    }

}
