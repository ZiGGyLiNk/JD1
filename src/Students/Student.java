package Students;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double averageScore;

    public Student(String firstName, String lastName, int age, double averageScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student " + firstName + " " + lastName + ". Age: " + age + ". Average score: " + averageScore;
    }
}
