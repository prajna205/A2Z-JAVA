import java.util.Scanner;

public class Amstrong {
    public static void isAmstrong(int num){
        int intial_num=num;
        double total=0;
        int digits=digit(num);
        while(num>0){
         int bit=num%10;
         total= (total+ Math.pow(bit,digits));
         num=num/10;
        }
        if(intial_num ==total )
            System.out.println(intial_num + " is amstrong");
        else
            System.out.println(intial_num + " is not amstrong");
    }
    public static int digit(int num){
        int count=0;
        while (num>0){
            num= num/10;
            count ++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Enter Number :: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        isAmstrong(num);
    }
}
