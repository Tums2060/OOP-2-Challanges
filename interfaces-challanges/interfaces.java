public class interfaces{
    public static void main(String[] args) {
        Admin curAdmin = new Admin(1234, "Stephan", "xzl@LM4X#");
        User curUser = new User(4455, "John");
        curAdmin.performOperation(new Update());
        curUser.performOperation(new View());
    }
}