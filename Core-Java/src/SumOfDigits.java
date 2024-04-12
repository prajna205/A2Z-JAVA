import java.util.Scanner;

public class SumOfDigits {
    public static int sum(int num) {
        int sum=0;
        while(num > 0){
            sum += (num % 10);
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter Number :: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Sum of digits::" + sum(num));
    }
}
