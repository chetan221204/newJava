class Myrunable implements Runnable {
    public void run() {
        System.out.println("Threads using runnable interface");
    }
}


   public class usingImplements {

    public static void main(String[] args) {
        Myrunable obj = new Myrunable();
        Thread t1 = new Thread(obj);
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        System.out.println("Main thread is running");
    }
}
