package implement;

// import javax.xml.stream.events.StartDocument;
import java.util.*;

class Student{
int age;
String name;
int Roll; 

public Student(int Roll ,String name ,int age){
    this .age = age;
    this.name =name;
    this .Roll= Roll;
}
public String toString(){
    return age +" " +Roll + " " + name;

    }
}
class Sortbyname implements Comparator<Student>{
    public int compare (Student s1 ,Student s2){
        return s1.name .compareTo(s2.name); 
    }

}


public  class SSortByName {
    public static void main(String[] args) {
        
ArrayList<Student> list =new ArrayList<>();
        list.add(new Student(12,"lolo", 29));
        list.add(new Student(29, "polo", 93));
        list.add(new Student(22, "fomo", 80));
       // Collections.sort(list,new sortbyname());
         Collections.sort(list,new Sortbyname());
   
        
        for(Student s : list){
            System.out.println(s.toString());
        }
    
}
}