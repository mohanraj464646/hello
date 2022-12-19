import java.util.Scanner;
public class ExerciseThree {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int salary=sc.nextInt();
        System.out.println(salary);

        String gender = sc.next();
        System.out.println(gender);
        ExerciseThree ex3=new ExerciseThree();
        ex3.calculateTax(salary,gender);

    }

    public void calculateTax(int salary,String gender){
        double tax=0.0;
        String gen=gender;
        System.out.println("Gender is "+gen);
        if(((salary > 0) & (salary<=180000))) {
            if (gender == gen) {
                tax = 0.0;
            }
        }

       else if(((salary > 180001) & (salary<=190000))) {
            if (gender.equals("Female")) {
                System.out.println("Feml Tax"+tax);
                tax = 0.0;
            }else {
                tax=salary*0.1;
                System.out.println("My Tax is "+tax);
            }

        }

        else if(((salary > 190001) & (salary<=500000))){

           tax = salary*0.1;

        }
        else if(((salary > 500001) & (salary<800000))){

                tax = salary * (0.2);

            }
        else if(salary > 800001){

            tax = salary * (0.2);

        }



        else{
            System.out.println("Pay up");
        }
       System.out.println(tax);
    }
}
