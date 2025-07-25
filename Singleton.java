public class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = new Singleton();

        Singleton.getInstance();
    }
    
}
