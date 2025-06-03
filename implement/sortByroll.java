package implement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student{
    int rollN ; String name ; int age;
    public Student(int rollN,String name,int age){
        this.rollN=rollN;
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return name+ " " +age;
    }
}
class sortByName implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return s1.name.compareTo(s2.name);
    }
}
class SortByRollN implements Comparator<Student>{
    public int compare(Student s1, Student s2) {
        return s1.rollN-s2.rollN;
    }
}
public class sortByroll {
public static void main(String[] args) {
    ArrayList<Student> list=new ArrayList<>();
    list.add(new Student(10, "avni", 12));
    list.add(new Student(22, "anushka", 20));
    list.add(new Student(3, "anjali", 12));
    // Collections.sort(list,new sortByName());
    // System.out.println(list);
    Collections.sort(list,new sortByRollN());

    for(Student s : list){
        System.out.println(s);
    }


}
} 