package sortingAlgorithm;

public class BubbleSort {

    public static int[] sortingOfArray(int arr[])
    {
        for(int i= arr.length-1;i>=1;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]> arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={3,66,77,9,3,2};
        int result[]=sortingOfArray(arr);
        for(int i=0;i< result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
}
