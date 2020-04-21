import java.util.Scanner;
public class App {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Cipher!");
        for( ;; ) {
            System.out.println("choice\n 1.Encrypt\n 2.Decrypt\n3.Exit");
            int choice = sc.nextInt();
            Cipher caeser = new Cipher();
            if (choice == 1) {
                System.out.println("What message would you like encrypted?: ");
                String message = new String();
                message = sc.next();
                System.out.println("Enter Key");
                int shiftKey = sc.nextInt();
                System.out.println(caeser.encrypt(message, shiftKey));

            } else if (choice == 2) {
                System.out.println("What message would you like decripted? : ");
                String message = new String();
                message = sc.next();
                System.out.println("Enter Key");
                int shiftKey = sc.nextInt();
                System.out.println(caeser.decrypt(message, 3));

            } else if (choice == 3) {
                System.exit(0);

            } else {
                System.out.println("Invalid choice");
            }
        }


    }

}