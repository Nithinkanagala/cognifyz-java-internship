// TASK-2
import java.util.Scanner;
public class PasswordStrengthChecker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password;
        int s=0;
        while (s<5){
            System.out.println("Enter your password: ");
            password = sc.nextLine();
            if(password.length()<8){
                System.out.println("Password should have at least 8 characters.");
                continue;
            }
            if (!password.matches(".*[A-Z].*")){
                System.out.println("Password should contain at least one uppercase letter & your password is week.");
                continue;
            }
            if (!password.matches(".*[a-z].*")){
                System.out.println("Password should contain at least one lowercase letter & your password is week.");
                continue;
            }
            if (!password.matches(".*\\d.*")){
                System.out.println("Password should contain at least one digit & your password is Moderate.");
                continue;
            }
            if (!password.matches(".*[!@#$%^&*()-_=+\\[{\\]}\\\\|;:'\",<.>/?].*")){
                System.out.println("Password should contain at least one special character & your password is week.");
                continue;
            }
            s= 5;
        }
        System.out.println("Your password is strong!");
    }
}

/*Output:
Enter your password:
nithin
Password should have at least 8 characters.
Enter your password:
nithinkumar
Password should contain at least one uppercase letter & your password is week.
Enter your password:
Nithinkumar
Password should contain at least one digit & your password is Moderate.
Enter your password:
Nithinkumar24
Your password is strong!
 */