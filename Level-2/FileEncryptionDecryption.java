//TASK-3
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileEncryptionDecryption {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
        System.out.print("Enter the file name or path: ");
        String fileName = input.nextLine();
        System.out.print("Do you want to encrypt or decrypt the file? (e/d): ");
        String choice = input.nextLine();
        
        switch(choice){
            case "e":encryptFile(fileName);
                     break;
            case "d":decryptFile(fileName);
                     break;
            default:
                System.out.println("Invalid choice.");
            input.close();
        }
    }
    }

    public static void encryptFile(String fileName) {
        try {
            File inputFile = new File(fileName);
            File outputFile = new File("encrypted_" + fileName);

            FileInputStream inputStream = new FileInputStream(inputFile);
            FileOutputStream outputStream = new FileOutputStream(outputFile);

            int key = 5;
            int data;
            while ((data = inputStream.read()) != -1) {
                data += key;
                outputStream.write(data);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("File encrypted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void decryptFile(String fileName) {
        try {
            File inputFile = new File(fileName);
            File outputFile = new File("decrypted_" + fileName);

            FileInputStream inputStream = new FileInputStream(inputFile);
            FileOutputStream outputStream = new FileOutputStream(outputFile);

            int key = 5;
            int data;
            while ((data = inputStream.read()) != -1) {
                data -= key;
                outputStream.write(data);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("File decrypted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
/*Output:
Enter the file name or path: demo.txt
Do you want to encrypt or decrypt the file? (e/d): e
File encrypted successfully.
Enter the file name or path: encrypted_demo.txt
Do you want to encrypt or decrypt the file? (e/d): d
File decrypted successfully.

demo.txt file
nithinkumar_kanagala
hello
wellcome to cognifyz

encrypted_demo.txt file
snymnspzrfwdpfsflfqfmjqqt|jqqhtrj%yt%htlsnk~

decrypted_encrypted_demo.txt file
nithinkumar_kanagala
hello
wellcome to cognifyz
 */