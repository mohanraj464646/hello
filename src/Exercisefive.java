import java.util.Scanner;

public class Exercisefive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The nm");
        int no =sc.nextInt();
        int no1 = no;
        int rem = 0;
        while (no !=0) {
            rem = rem * 10 % 10;
            no = no / 10;
        }
        if (no1 == rem){
            System.out.println(no1 + "number is a palindrome");
        } else
            System.out.println("its not a palindrome");
    }
}
