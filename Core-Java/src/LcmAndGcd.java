import java.util.Scanner;

public class LcmAndGcd {
    public static int lcm(int num1,int num2){
        int i=1;
        while(i<=num2){
            int fact=num1 *i;
            if (fact % num2 ==0)
                return fact;
            i++;
        }
        return 0;
    }
    public static int gcd(int num1,int num2){
        int min=Math.min(num1, num2);
        int i=1;
        int res=1;
        while(i<=min){
            if (num1 % i== 0 && num2 % i ==0)
                res=i;
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Enter Numbers :: ");
        Scanner sc= new Scanner(System.in);
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("LCM :: "+ lcm(num1,num2));
        System.out.println("LCM :: "+ gcd(num1,num2));
    }
}
