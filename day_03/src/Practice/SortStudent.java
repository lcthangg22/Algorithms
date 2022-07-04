package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("a a",18,10));
        students.add(new Student("a b",18,9));
        students.add(new Student("a c",19,8));
        students.add(new Student("b a",17,10));
        students.add(new Student("b b",17,9));
        students.add(new Student("b c",18,8));
        students.add(new Student("c a",16,8));
        students.add(new Student("c b",16,9));
        students.add(new Student("c c",17,10));

        int n = students.size();

        System.out.println("#1. Sắp xếp học sinh theo fullName, nếu giống fullName thì ai nhiều tuổi hơn thì đứng trước.");

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.fullName.compareTo(o2.fullName);
            }
        });

        for (Student student: students) {
            System.out.println(student);
        }

        System.out.println();

        System.out.println("#2. Sắp xếp học sinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần.");

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age  - o2.age;
            }
        });

        for (Student student: students) {
            System.out.println(student);
        }

        System.out.println();

        System.out.println("#3. Sắp xếp theo tên.");
        for (Student student: students) {
            String[] name = {student.fullName};
            Arrays.sort(name);
        }
        for (Student student: students) {
            System.out.println(student);
        }

    }
}
