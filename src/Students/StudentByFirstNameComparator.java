package Students;

import java.util.Comparator;

public class StudentByFirstNameComparator implements Comparator<Student>{

    @Override
    public int compare(Student first, Student second) {
        return first.getFirstName().compareTo(second.getFirstName());
    }
}