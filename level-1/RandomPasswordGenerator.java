//TASK-4
import java.util.Random;
class RandomPasswordGenerator{
    public static void main(String[] args) {
        System.out.println(GeneratingPassword(8));
    }
public static char[] GeneratingPassword(int length){
    String uppercase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lowercase="abcdefghijklmnopqrstuvwxyz";
    String specialchar="#$!@&*";
    String numbers="012345789";
    String combinedString=uppercase+lowercase+specialchar+numbers;
    char[] newpassword=new char[length];
    Random random=new Random();
    System.out.println("=========================");
    System.out.println("Random Password Generated");
    System.out.println("=========================");
    for(int i=0;i<length;i++){
        newpassword[i]=combinedString.charAt(random.nextInt(combinedString.length()));
    }
    return newpassword;
}
}

/*Output:
=========================
Random Password Generated
=========================
wH4R!5hx
 */