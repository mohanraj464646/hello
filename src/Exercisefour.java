import java.util.Scanner;
public class Exercisefour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Number Quantity Sold");
        String prodCode = sc.next();
        int quantitySold = sc.nextInt();
        Exercisefour rp = new Exercisefour();
        rp.prices(prodCode, quantitySold);
    }
    public void prices(String prodCode, int quantitySold ){
        double totalcost = 0.0;
        switch(prodCode){
            case "a": totalcost = quantitySold *22.50;
                break;
            case "b":totalcost = quantitySold *44.50;
                break;
            case "c":totalcost = quantitySold *9.98;
                break;
            default:System.out.println("Wrong product code");
        }
        System.out.println("The total cost is "+totalcost);
    }

    }
