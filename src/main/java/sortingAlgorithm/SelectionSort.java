package sortingAlgorithm;

public class SelectionSort {

    public static int[] ascendingOrder(int arr[])
    {
        for(int i=0;i<=arr.length-2;i++)
        {
            int min=i;
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[]={21,3,66,7,88};
       int result[]= ascendingOrder(arr);
       for(int i=0;i<result.length;i++)
       {
           System.out.println(result[i]);
       }
    }

}
