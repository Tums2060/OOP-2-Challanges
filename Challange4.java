//Challange 4 was on importing and using the scanner

//imported the scanner
import java.util.Scanner;

public class Challange4 {
    //create the object of the scanner
    Scanner s1 = new Scanner(System.in);

    public void readNameAndAge(){
        String name;
        int age;
        System.out.print("Name? ");
        name = s1.next();

        System.out.print("Age? ");
        age = s1.nextInt();

        System.out.println("Hello "+name+". You're "+age+" springs young");

        
    }
    public static void main(String[] args) {
        Challange4 c4 = new Challange4();

        c4.readNameAndAge();
    }
}
