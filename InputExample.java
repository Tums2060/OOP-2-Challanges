import java.util.Scanner;

public class InputExample {
    Scanner s1 = new Scanner(System.in);

    public void readNameAndAge(){
        String name;
        int age;
        System.out.println("Whwat is your name: ");
        name = s1.next();

        System.out.println("How old are you: ");
        age = s1.nextInt();

        System.out.println("Hello " + name + " you are " + age + " years old");

    }

    public static void main(String[] args) {
        InputExample i1 = new InputExample();
        i1.readNameAndAge();
    }
}
