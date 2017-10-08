package Students;

import java.util.Comparator;

public class StudentByLastNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student first, Student second) {
        return first.getLastName().compareTo(second.getLastName());
    }
}
