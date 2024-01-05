//TASK-2
import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
        int n,rev=0,t,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a palindrome number:");
        n=sc.nextInt();
        t=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Revers of palindrome number:");
        System.out.println(rev);
        if(t==rev){
            System.out.println("It is a palindrome number");
        }else{
            System.out.println("It is not a palindrome number");
        }
    }
}

/*Output:
 * Enter a palindrome number:
121
Revers of palindrome number:
121
It is a palindrome number

Enter a palindrome number:
123
Revers of palindrome number:
321
It is not a palindrome number
 */