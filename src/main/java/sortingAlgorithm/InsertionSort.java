package sortingAlgorithm;

public class InsertionSort {
    public static int[] sortedArray(int arr[])
    {
        for(int i=0;i< arr.length;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp= arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,1,66,64,62,23};
        int result[]=sortedArray(arr);
        for(int i=0;i< result.length;i++)
        {
            System.out.println(result[i]);
        }
    }

}
