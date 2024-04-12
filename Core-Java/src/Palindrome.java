import java.util.Scanner;

public class Palindrome {
    public static void isPalindrome(int num){
        int reverse_num=reverse(num);
        if(reverse_num == num)
            System.out.println("Palindrome");
        else
            System.out.println("not palindrome");
    }
    public static int reverse(int num){
        int total=0;
        while(num>0){
            int digit=num%10;
            total=total*10+digit;
            num=num/10;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println("Enter Number :: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        isPalindrome(num);
    }
}
