import java.util.*;

public class School  {

    public static void demo(){

        List<Student> studentRoster=new ArrayList<Student>();
        List<Person> personRoster=new ArrayList<>();
        studentRoster=addStudentsByStudentAPI(studentRoster);
        personRoster=addStudentsByPersonAPI(personRoster);

        System.out.println("\n"+"---------------------Overriding toString() to show studentRoster List---------------------");
        System.out.println((studentRoster.toString()));

        System.out.println("\n"+"---------------------Overriding toString() to show personRoster List---------------------");
        System.out.println(personRoster.toString());

        System.out.println();
        System.out.println("------------------Sort Student List(Based on FirstName)----------------------------------");
        sortStudentList(studentRoster);

        System.out.println();
        System.out.println("----------------------Sort Person List(Based on FirstName)-------------------------------");
        sortPersonList(personRoster);

        System.out.println();
        System.out.println("---------------------Sort Students in the studentRoster list by ID-----------------------");
        studentRoster.sort(Student::compareStudentListById);
        for (Student s : studentRoster) {
            System.out.println(s.toString());
        }

        System.out.println();
        System.out.println( "-------------------Sort Students in the studentRoster list by AGE-----------------------");
        studentRoster.sort(Student::compareStudentListByAge);
        for (Student s : studentRoster) {
            System.out.println(s.toString());
        }

        System.out.println();
        System.out.println("-----------------------Sort Students in the studentRoster list by LastName-----------------------");
        studentRoster.sort(Student::compareStudenListByLastName);
        for (Student s : studentRoster) {
            System.out.println(s.toString());
        }

        System.out.println();
        System.out.println("-----------------------Sort Students in the studentRoster list by GPA-----------------------");
        studentRoster.sort(Student::compareStudenListByGpa);
        for (Student s : studentRoster) {
            System.out.println(s.toString());
        }

        System.out.println();
        System.out.println( "----------------------Sort Students in the personRoster list by ID----------------------");
        personRoster.sort((o1, o2) -> Student.comparePersonListById((Student) o1,(Student) o2));
        for (Person p : personRoster) {
            System.out.println(p.toString());
        }

        System.out.println();
        System.out.println( "----------------------Sort Students in the personRoster list by AGE----------------------");
        personRoster.sort((o1, o2) -> Student.comparePersonListByAge((Student) o1,(Student) o2));
        for (Person p : personRoster) {
            System.out.println(p.toString());
        }

        System.out.println();
        System.out.println("----------------------Sort Students in the personRoster list by LastName----------------------");
        personRoster.sort((o1, o2) -> Student.comparePersonListByLastName((Student) o1,(Student) o2));
        for (Person p : personRoster) {
            System.out.println(p.toString());
        }


        System.out.println();
        System.out.println( "----------------------Sort Students in the personRoster list by GPA----------------------");
        personRoster.sort((o1, o2) -> Student.comparePersonListByGpa((Student) o1,(Student) o2));
        for (Person p : personRoster) {
            System.out.println(p.toString());
        }
    }

    public static List<Student> addStudentsByStudentAPI(List<Student> studentRoster){
        Student student1=new Student(22, "James", "Sichai",05,3.56);
        Student student2=new Student(25, "Akash", "Patell",01,3.98);
        Student student3=new Student(31, "Cheta", "Kothar",11,4);
        Student student4=new Student(19, "Manth", "Captan",02,3.11);
        Student student5=new Student(23, "Jayee", "Mistry",19,3.22);
        studentRoster.add(student1);
        studentRoster.add(student2);
        studentRoster.add(student3);
        studentRoster.add(student4);
        studentRoster.add(student5);
        return studentRoster;
    }

    public static List<Person> addStudentsByPersonAPI(List<Person> personRoster){
        Person person1=new Student(15, "Yashan", "Jain",03,2.51);
        Person person2=new Student(35, "Dinesh", "Praj",21,2.88);
        Person person3=new Student(11, "Darsha", "Meha",10,3.99);
        Person person4=new Student(24, "Riaana", "Zaak",22,3.50);
        Person person5=new Student(20, "Bharvi", "Desa",04,3.00);
        personRoster.add(person1);
        personRoster.add(person2);
        personRoster.add(person3);
        personRoster.add(person4);
        personRoster.add(person5);
        return personRoster;

    }

    public static void sortStudentList(List<Student> studentRoster ){

        Comparator<Student> studentSorter = new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return String.valueOf(student1.getFirstName()).compareTo(String.valueOf(student2.getFirstName()));
            }
        };
        Collections.sort(studentRoster,studentSorter);

        for(Student i:studentRoster){
            System.out.println(i.toString());
        }
    }

    public static void sortPersonList(List<Person> personRoster ){

        Comparator<Person> personSorter = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                return String.valueOf(person1.getFirstName()).compareTo(String.valueOf(person2.getFirstName()));
            }
        };
        Collections.sort(personRoster,personSorter);

        for(Person i:personRoster) {
            System.out.println(i.toString());
        }
    }


}
