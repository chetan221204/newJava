public class sort {
   static void sort(int strn){
    String[] str={"B","A","C"};
    for(int i=0;i<str.length;i++){
        for(int j=0;j<str.length;j++){
            if((int)str[j].charAt(0)>(int)str[j+1].charAt(0)){
                String temp = str[j];
                str[j]=str[j+1];
                str[j+1]=temp;
            }
        }
    }
}
    public static void main (String[] args){
        
         
    }
}
