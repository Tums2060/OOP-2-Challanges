// package Recursion;

public class factorial {
    public static int Factorial(int i){
        if (i == 1 || i == 0){
            return 1;
        }
        else{
            return i * Factorial(i - 1);
        }
    }

    public static void main(String[] args) {
        int result = Factorial(5);

        System.out.println("Factorail of number is:  "+ result);
    }
}
