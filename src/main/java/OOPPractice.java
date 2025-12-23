import java.util.ArrayList;

public class OOPPractice {

    public static void main(String[] args) {
        ArrayList<Student> school = new ArrayList<>();

        school.add(new Student("Stefan", 38, 5.0));
        school.add(new Student("Anna", 28, 4.9));
        school.add(new Student("Ibrahim", 46, 4.5));
        school.add(new Student("Albert", 31, 2.1));

        System.out.println("Students in the school:");
        for (Student s : school) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("Studets with good grades");
        for (Student s : school) {
            if(s.grade > 4.0) {
                System.out.println(s);
            }
        }
    }
}
