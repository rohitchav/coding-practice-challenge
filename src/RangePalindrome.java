import java.util.Scanner;
public class RangePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M: ");
        int m = sc.nextInt();
        System.out.println("Enter N: ");
        int n = sc.nextInt();
        int totalCount=0;
        for(int num=m ; num<=n;num++){
          totalCount = calculatePalindrome(num,totalCount);
        }
        System.out.println("Total Number Of Palindrome: "+totalCount);
    }
    public static int calculatePalindrome(int num,int count){
        int numCopy = num;
        int reverseNum = 0;
        while(num>0){
            reverseNum = reverseNum * 10 + num%10;
            num = num/10;
        }
        if(numCopy==reverseNum)
        {
            count ++;
        }
       return count;
    }
}
