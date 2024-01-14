package Comparator;
import java.util.List;
import  java.lang.Comparable;
public class Student implements Comparable<Student>  {
    int age;
    String name;
    double psp;

    public  Student(int age, String name, double psp)
    {
        this.age = age;
        this.name  = name;;
        this.psp = psp;

    }

    public String toString(){

        return "Student{" +
                "age=" + age +
                ", name='" + name + '\''+
                ", psp="+ psp+
                '}';
    }

    @Override
    public int compareTo(Student other) {
          if(this.age > other.age)
              return  1;

          if(this.age < other.age)
              return  -1;

          return  0;

    }
}
