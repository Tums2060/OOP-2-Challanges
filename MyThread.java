public class MyThread extends Thread{
    
    public void run(){
        System.out.println("Thread is running");
    }
    // public static void main(String[] args) {
    //     System.out.println(Thread.currentThread().getPriority());
    // }

    public static void main(String[] args) {
        new Thread(new MyThread()).start();
    }
}
