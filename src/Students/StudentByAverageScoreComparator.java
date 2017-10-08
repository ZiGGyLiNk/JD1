package Students;

import java.util.Comparator;

public class StudentByAverageScoreComparator implements Comparator<Student>{

    @Override
    public int compare(Student first, Student second) {
        return Double.compare(first.getAverageScore(), second.getAverageScore());
    }
}
