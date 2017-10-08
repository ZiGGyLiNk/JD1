package Students;

import java.util.Comparator;

public class StudentByAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student first, Student second) {
        return Integer.compare(first.getAge(), second.getAge());
    }
}