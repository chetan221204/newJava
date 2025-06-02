package implement;

import java.util.*;

class Student implements Comparable <Student>{
    int age;
    String name;

    public Student(int age ,String name){
        this.age = age;
        this.name = name;
    }

        public String toString() {
            return age + " " +name;
        }

        public int compareTo(Student s) {
            return this.age-s.age;
        }



}
public class ClassInterface {

    public static void main(String[] args) {
        ArrayList<Student> list =new ArrayList<>();
        list.add(new Student(11, "om"));
        list.add(new Student(22, "jake"));
        list.add(new Student(9 , "lol"));
        Collections.sort(list);
        System.out.println(list);

        
    }
}