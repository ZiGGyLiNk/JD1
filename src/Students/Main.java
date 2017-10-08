package Students;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new LinkedList<>();

        students.add(new Student("Earnest", "Noriega", 12, 8.9));
        students.add(new Student("Vikki", "Bendel", 13, 9.1));
        students.add(new Student("Edison", "Tibbals", 12, 9.9));
        students.add(new Student("Phil", "Burchard", 14, 6.9));
        students.add(new Student("Philipp", "Buster", 11, 7.9));

        Iterator<Student> iterator = students.iterator();
        Student studentWithMaxAverageScore = students.get(0);
        while (iterator.hasNext()) {
            if (iterator.next().getAverageScore() > studentWithMaxAverageScore.getAverageScore()) {
                studentWithMaxAverageScore = iterator.next();
            }
        }
        System.out.println(studentWithMaxAverageScore + "\n");

        Collections.sort(students, new StudentByFirstNameComparator().thenComparing(new StudentByLastNameComparator()).thenComparing(new StudentByAgeComparator()).thenComparing(new StudentByAverageScoreComparator()));
        students.forEach(System.out::println);
    }
}