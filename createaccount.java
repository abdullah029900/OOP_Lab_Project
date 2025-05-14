import java.util.Scanner;

class createaccount {
    Scanner input = new Scanner(System.in);

    String name;
    String email;
    String password;

    createaccount() {
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your email: ");
        email = input.nextLine();

        System.out.print("Enter your password: ");
        password = input.nextLine();
    }

    void display() {
        System.out.println("\nYOUR NAME IS     : " + name);
        System.out.println("YOUR EMAIL IS    : " + email);
        System.out.println("YOUR PASSWORD IS : " + password);
        System.out.println("***** ACCOUNT CREATED SUCCESSFULLY *****");
    }
}
