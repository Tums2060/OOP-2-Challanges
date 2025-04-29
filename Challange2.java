//Challange 2 is on datatypes and how to implement them

public class Challange2 {
    
    void showInterest(){
        double amount;
        double interest;

        amount = 1200.00;
        System.out.println("amount: " + amount);

        interest = 3.0;
        amount = amount * (100+interest)/100;
        System.out.println("after a year: " + amount);

        amount = amount * (100+interest)/100;
        System.out.println("After 2 years: " + amount);

        
    }
    public static void main(String [] args){
     
        Challange2 c2 = new Challange2();

        c2.showInterest();
    }
}
