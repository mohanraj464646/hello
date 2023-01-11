public class student1 {
    public static void main(String[]args){
        int Book = 3000;
        /*if(Book == 2000) {
           Book += 100;
           System.out.println("Book:"+Book);
        }
        else if(Book == 3000){
            Book += 200;
            System.out.println("Book:"+Book);
        }
        else{
            System.out.println("Enter the bound");
        }*/
        switch(Book){
            case 2000:Book += 100;
            System.out.println("Book:"+Book);
            break;
            case 3000:Book += 200;
            System.out.println("Book:"+Book);
            break;
            default:System.out.println("Enter the bound");
        }
    }

}
