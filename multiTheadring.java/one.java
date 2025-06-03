
class Mythread extends Thread{
    public void run(){

        // System.out.println("hello");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        
             
        }
        System.out.println("hello");
    }
}


public class one {


    public static void main(String[] args) {
        Mythread t1=new Mythread();
        t1.start();
        System.out.println("hii");
    }
}