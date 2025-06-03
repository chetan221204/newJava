class MultiDownload1 extends Thread{
    String filename;
     MultiDownload1 (String filename){
        this.filename=filename;

     }

     

        public void run(){
            for(int i=1;i<=5;i++)
        {   
            System.out.println(filename + "dowloading..." + (i*20) +"%");
            try 
            {
                Thread.sleep(2000);
            } 
            catch (Exception e) 
            {

                
                
            }
            
            
        }
            System.out.println(filename +"done");


        }
    
    }



    public class MultiDownload {
    
        
        public static void main(String[] args) {
            String Om = "hello";
            String Shanti="bye";
            MultiDownload1 t1 =new MultiDownload1("Om");
            MultiDownload1 t2 =new MultiDownload1("Shanti");
            t1.start();
            t2.start();
            
        }
    }

