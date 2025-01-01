public class MinAndMax {
    public static void minValue(int[] array,int min){
        for(int i = 0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Minimum Value: "+min);
    }
    public static void maxValue(int[] array,int max){
        for(int i = 0;i<array.length;i++){
            if(array[i]> max){
                max = array[i];
            }
        }
        System.out.println("Minimum Value: "+max);
    }
    public static void main(String[] args) {
        int[] array = {22,11,55,33,46};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        minValue(array,min);
        maxValue(array,max);

    }
}
