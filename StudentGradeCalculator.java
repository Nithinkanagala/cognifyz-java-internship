//TASK-3
import java.util.*;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1,s2,s3,t,p;
        System.out.println("Enter Subject1:");
        s1=sc.nextInt();
        System.out.println("Enter Subject2:");
        s2=sc.nextInt();
        System.out.println("Enter Subject3:");
        s3=sc.nextInt();
        t=(s1+s2+s3)/3;
        p=t/3;
        System.out.println("Total:"+t);
        System.out.println("Percentage:"+p);
        System.out.println("Grade:");
        if(t>=95){
            System.out.println("O");
        }else if(t<95 && t>=90){
            System.out.println("A+");
        }else if(t<90 && t>=85){
            System.out.println("A");
        }else if(t<85 && t>=80){
            System.out.println("B+");
        }else if(t<80 && t>=70){
            System.out.println("B");
        }else if(t<70 && t>=60){
            System.out.println("c+");
        }else if(t<60 && t>=50){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
    }
}

/*Output:
Enter Subject1:
98
Enter Subject2:
87
Enter Subject3:
78
Total:87
Grade:
A
 */