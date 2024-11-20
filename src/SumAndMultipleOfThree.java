import java.util.Scanner;
public class SumAndMultipleOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            sum = num % 10 + sum;
            num = num/10;
        }
        System.out.println(isMultipleOfThree(sum));

    }
    public static boolean isMultipleOfThree(int sum){
        if(sum % 3 ==0){
            return true;
        }else{
            return false;
        }
    }
}
