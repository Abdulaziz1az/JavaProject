import java.util.Scanner;
// a main class for the student class
import java.util.Scanner;

public class StudentTesting {
    public void main(String [] arsg)
    {
        Scanner Scannedinfo = new Scanner(System.in);
        // Constructor
        Student Student1 = new Student(); 
        // aske  the user the user for the first name
        System.out.print("Enter your first name: ");
        Student1.setFirstName(Scannedinfo.nextLine());

        // aske the user for last name
        System.out.print("Enter your last name: ");
        Student1.setLastName(Scannedinfo.nextLine());

        // aske the user for star id
        System.out.print("Enter your star id: ");
        Student1.setStrId(Scannedinfo.nextLine());

    }
}