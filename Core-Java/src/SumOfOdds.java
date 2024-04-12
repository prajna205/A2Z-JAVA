import java.util.Scanner;

public class SumOfOdds {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int num=sc.nextInt();
            int sum=0;
            for (int i = 1; i <= num; i++) {
                if (i % 2 == 1)
                    sum += i;
            }
            System.out.println("Sum of odds = " + sum);
        }
}
