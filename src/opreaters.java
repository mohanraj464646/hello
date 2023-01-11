import javax.swing.*;
import java.util.Scanner;
public class opreaters {
    public static void main(String[] args) {
        int mark= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark (0-100)");
        mark = sc.nextInt();

        if(mark >=90)
            System.out.println("Grade A");
        else if(mark >80)
            System.out.println("Grade B");
        else if(mark >70)
            System.out.println("grade C");
        else if(mark >=60)
            System.out.println("Grade D");
        else
            System.out.println("Grade E");

       // String name = sc.nextLine();
       // int a= 5;
        //int a = 20 , b = 10;
        //int c = a++ + ++b;
        //int b =( a ^ 3)^ a ;
        //.out.println(b);
    }
}
