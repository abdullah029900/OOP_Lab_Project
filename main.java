import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("***** Welcome to Online Banking System *****");
        System.out.println("*****Enter the option you want");
        System.out.println("CHOOSE 1 FOR CREATING NEW ACCOUNT");
        System.out.println("CHOOSE 2 FOR TRANSACTION");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        if(option==1){
        createaccount c1 = new createaccount();  
        c1.display();
         }
         else if (option==2)
         { 
            Transaction transaction = new Transaction();
             
            transaction.display(); 
         }
         else
         {
            System.out.println("CHOOSE THE CORRECT OPTION");
         }
    }
}