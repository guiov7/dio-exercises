import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        try {

            // getting user data
            System.out.print("Enter your first name: ");
            String fname = sc.nextLine();
            System.out.print("Enter your last name: ");
            String lname = sc.nextLine();
            System.out.print("Insert your age: ");
            int age = sc.nextInt();
            System.out.print("Enter your height in meters: ");
            Float height = sc.nextFloat();
            
            // outputting user info
            System.out.printf("\nABOUT ME:\nHi, my name is %s %s\nI'm %d years old and my height is %.2f mts",fname,lname,age,height);
        } catch(InputMismatchException e) {
            System.out.println("Failed to get a data: please insert valid age and height numeric value.");
        }

        sc.close();
    }
}
