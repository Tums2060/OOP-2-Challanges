//Challange 3 was on implementing choices usinf if-else statements

//for this i used a scanner
import java.util.Scanner;

public class Challange3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

     System.out.println("Enter hour in whole number: ");
     int hour = s1.nextInt();

     if(hour >= 5 && hour < 12){
        System.out.println("Good morning!");
     }
     else if(hour >= 12 && hour <= 17){
        System.out.println("Good afternoon!!");
     }
     else if(hour >= 17 && hour < 21){
        System.out.println("Good evening!!");
     }
     else if((hour >= 21 && hour <=23) || (hour >= 0 && hour < 5)){
        System.out.println("Good night!!");
     }
     else{
        System.out.println("Invalid hour entered");
     }
        
    }
     
}
