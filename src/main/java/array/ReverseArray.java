package array;

import java.util.Arrays;

public class ReverseArray {
// with using new array
    public static int[] reverseArray(int arr[])
    {
        int reversedArray[]=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            reversedArray[i]=arr[arr.length-i-1];
            System.out.println(reversedArray[i]);
        }
        return reversedArray;
    }
    //without using new array
    public static int[] reverseArrayWithoutUsingNewArray(int arr[])
    {
        for(int i=0;i< arr.length/2;i++)
        {
            int temp=arr[i];
           arr[i]= arr[arr.length-i-1];
           arr[arr.length-i-1]=temp;
        }
        return arr;
    }
    // using while loop
    public static int[] reverseArrayUsingWhileLoop(int arr[])
    {
        int end= arr.length-1;
        int start=0;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }


    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
//          reverseArray(arr);
//       int result[] = reverseArrayWithoutUsingNewArray(arr);
        int result2[]= reverseArrayUsingWhileLoop(arr);
        for(int i=0;i<result2.length;i++)
        {
            System.out.println(result2[i]);
        }

    }
}
