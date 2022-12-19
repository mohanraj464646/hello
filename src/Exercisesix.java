import java.util.Scanner;
public class Exercisesix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of eggs");
        int N = sc.nextInt();
        Exercisesix jj = new Exercisesix();
        jj.display(N);
    }
    public void display(int N) {
        int  gross,dozen,balgross,baleggs;
        gross=N/144;
        System.out.println(gross);
        balgross=N%144;
        System.out.println(balgross);
        dozen=N/12;
        System.out.println(dozen);
        baleggs=N%12;
        System.out.println(baleggs);
        System.out.println("gross:" + gross +"dozen:"+ dozen+"baleggs"+baleggs);

    }
}
