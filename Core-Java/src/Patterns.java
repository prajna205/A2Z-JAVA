import java.util.Scanner;
public class Patterns {
    public static void pattern1(int rows){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int rows){
        for (int i = rows; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int rows){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Number :: ");
        Scanner sc= new Scanner(System.in);
        int row=sc.nextInt();
        pattern1(row);
        pattern2(row);
        pattern3(row);
    }
}
