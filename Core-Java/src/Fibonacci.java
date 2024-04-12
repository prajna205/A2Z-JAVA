import java.util.Scanner;

public class Fibonacci {
    public static void fibo(int num){
        if(num<0) return;
        if(num == 0){
            System.out.println("0");
            return;
        }
        int num1=0;
        int num2=1;
        System.out.print(num1 + ", "+num2);
        while(num1+num2 < num){
            int next=num1+num2;
            System.out.print(", "+next);
            num1=num2;
            num2=next;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Number :: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        fibo(num);
    }
}
