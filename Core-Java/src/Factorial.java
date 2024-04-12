import java.util.Scanner;

public class Factorial {
    public static long factorial(int num){
        if(num==0)
            return 1;
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter Number :: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(factorial(num));
    }
}
