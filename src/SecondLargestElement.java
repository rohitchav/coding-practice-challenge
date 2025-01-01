public class SecondLargestElement {
    public static void main(String [] args){
        int array[] = {11,33,22,55,63};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                secondLargest = largest;
                largest = array[i];
            } else if (secondLargest<array[i] && array[i]!=largest) {
                secondLargest=array[i];
            }
        }

        System.out.println(secondLargest);
    }
}
