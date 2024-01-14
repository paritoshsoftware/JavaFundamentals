package Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student(28,"Vishal",100));
        students.add(new Student(32,"Parminder",89));
        students.add(new Student(24,"Agatha",75));
        System.out.println("Before "+ students);
        Collections.sort(students);
        Collections.sort(students, new PSPComparabble());
        System.out.println("After "+ students);

    }
}
