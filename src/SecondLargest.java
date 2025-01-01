import java.util.Scanner;

public class SecondLargest{
    public static int secondLargestElement(int[] arr,int n){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=1;i<=n-1;i++){
            if(arr[i]>largest){
                secondLargest =largest;
                largest=arr[i];
            }else if(arr[i] < largest && secondLargest < arr[i]){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int []array = {19,16,20,10,21,21};
        int n = array.length;
        System.out.println(secondLargestElement(array,n));
    }
}
