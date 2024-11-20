import java.util.Scanner;
public class AverageAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***Enter Weekly Exercise Record***");
        int[] array = new int[7];
        for(int i=0;i<array.length;i++){
            System.out.print("Enter Day "+(i+1)+" Exercise Time In Minute: ");
            array[i]=sc.nextInt();
        }
        System.out.println("***Exercise Summary***");
        int totalSum=0;
        for (int i = 0; i < array.length; i++) {
            totalSum = array[i]+totalSum;
        }
        int average = totalSum / array.length;
        System.out.println("Total Exercise Duration "+totalSum+" Minutes");
        System.out.println("Average Daily Exercise Duration: "+ average);
    }
}
