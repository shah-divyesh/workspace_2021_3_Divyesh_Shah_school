import java.util.Comparator;

public class Student extends Person implements Comparable<Student> {
    private int id;
    private double gpa;

    public Student(int age, String firstName, String lastName, int id, double gpa) {
        super(age, firstName, lastName);
        this.id = id;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{    "+"firstName=   " + super.getFirstName() +", lastName=  "+super.getLastName()+", age=   "+super.getAge()+
                ", id=  " + id +
                ", gpa= " + gpa +
                "   }";
    }

    @Override
    public int compareTo(Student o) {
        return o.getFirstName().compareToIgnoreCase(this.getFirstName());
    }


    public static int compareStudenListByLastName(Student o1, Student o2) {
        return o1.getLastName().compareToIgnoreCase(o2.getLastName());
    }

    public static int compareStudenListByGpa(Student o1, Student o2) {
        return Double.compare(o1.getGpa(), o2.getGpa());
    }

    public static int compareStudentListByAge(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

    public static int compareStudentListById(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }


    public static int comparePersonListById(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }

    public static int comparePersonListByGpa(Student o1, Student o2) {
        return Double.compare(o1.getGpa(), o2.getGpa());
    }

    public static int comparePersonListByAge(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

    public static int comparePersonListByLastName(Student o1, Student o2) {
        return o1.getLastName().compareToIgnoreCase(o2.getLastName());
    }

}
