//This involved using a while loop


import java.util.*;
public class Challange5 {
    Scanner s1 = new Scanner(System.in);

    void showHello(){
        String choice;

        System.out.println("For Hello type h, anything else to stop");
        choice = s1.next();

        //This while loop will keep running as long as h is typed into the scanner
        while("h".equals(choice)){
            System.out.println("Hello");
            choice = s1.next();
        }
    }
    public static void main(String[] args) {
        Challange5 c5 = new Challange5();

        c5.showHello();
    }
}
