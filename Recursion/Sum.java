// package Recursion;

public class Sum {
    public static int sum(int i){
        if (i == 1){
            return 1;
        }
        else{
            return i + sum(i - 1);
        }
    }

    public static void main(String[] args) {
        int result = sum(10);

        System.out.println("Sum: " + result);
    }
}
