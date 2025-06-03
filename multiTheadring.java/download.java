class Downloadfiles{

    public static void file(String file) {
        for(int i=1;i<=5;i++)
        {   
            System.out.println(file + "dowloading..." + (i*20) +"%");
            try 
            {
                Thread.sleep(2000);
            } 
            catch (Exception e) 
            {
                
                
            }
            
            
        }
            System.out.println(file +"done");
    }
    }
    public class download {
    
        public static void main(String[] args) {
            String str ="OmFile";
            String str1="UpmanjiFile";
            Downloadfiles obj =new Downloadfiles();
            obj.file(str);
            obj.file(str1);

        }
    }

