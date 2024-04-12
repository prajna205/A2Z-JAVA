import java.util.Scanner;

public class ReverseDigits {
    public static int reverse(int num){
        int res=0;
        while(num >0){
            int digit=num % 10;
            res= res * 10 + digit;
            num =num/10;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Enter Number :: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Reverse ::"+reverse(num));
    }
}
