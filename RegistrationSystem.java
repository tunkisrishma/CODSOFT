import java.util.*;
public class RegistrationSystem 
{
    private Map<String, Student> students;
    public RegistrationSystem() 
    {
        this.students = new HashMap<>();
    }
    public void registerStudent(Student student) 
    {
        this.students.put(student.getId(), student);
    }
    public Student getStudent(String id) 
    {
        return this.students.get(id);
    }
    public void printAllStudents() 
    {
        for (Student student : this.students.values()) 
        {
            System.out.println(student);
        }
    }
    public static void main(String[] args) 
    {
        RegistrationSystem srs = new RegistrationSystem();
        Student s1 = new Student("1", "Swarna");
        Student s2 = new Student("2", "Subbu");
        srs.registerStudent(s1);
        srs.registerStudent(s2);
        System.out.println("All:");
        srs.printAllStudents();
    }
}
class Student 
{
    private String id;
    private String name;
    public Student(String id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    public String getId() 
    {
        return this.id;
    }
    public String getName() 
    {
        return this.name;
    }
    @Override
    public String toString() 
    {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}