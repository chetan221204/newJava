class withdrawal extends Thread{
     
    static  int totalBalance=1000;
    int amount;

    public withdrawal(int amount){
        this.amount=amount;

    }

    public void run(){
        synchronized (withdrawal.class){
        if(totalBalance>=amount)
        {
            System.out.println("  withdraw " + " " + amount);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            totalBalance-=amount;
            System.out.println("remaining amount" + totalBalance);
        }
        else{
            System.out.println("low balance " + totalBalance);
        }
        }
    }
    
}
public class balance {
    public static void main(String[] args) {
        withdrawal t1 =new withdrawal(800);
        withdrawal t2= new withdrawal(300);
        t1.start();
        t2.start();
    
    }

    
}



















