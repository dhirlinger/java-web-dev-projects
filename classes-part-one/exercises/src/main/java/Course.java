import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Course {
    private String courseName;
    private String instructor;
    private ArrayList<Student> students = new ArrayList<>();

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public String toString(){
        String firstPhrase =  instructor + " teaches " + courseName + " .\n Here are the students enrolled: ";
        String studentsString = "";
        for (Student student : students) {
            studentsString = studentsString + " ," + student.getName();
        }
        return firstPhrase + studentsString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(getCourseName(), course.getCourseName()) && Objects.equals(getInstructor(), course.getInstructor()) && Objects.equals(getStudents(), course.getStudents());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseName(), getInstructor(), getStudents());
    }
}




