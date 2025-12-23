import java.util.ArrayList;

public class OOPPractice {

    public static void main(String[] args) {
        ArrayList<Student> school = new ArrayList<>();

        school.add(new Student("Stefan", 38, 5.0, City.STOCKHOLM));
        school.add(new Student("Anna", 28, 4.9, City.ONLINE));
        school.add(new Student("Ibrahim", 46, 4.5, City.STOCKHOLM));
        school.add(new Student("Albert", 31, 2.1, City.GOTEBORG));

        System.out.println("Students in the school:");
        for (Student s : school) {
            System.out.println(s);
        }

        System.out.println();

        System.out.println("Students with good grades:");
        for (Student s : school) {
            if(s.grade > 4.0) {
                System.out.println(s);
            }
        }

        System.out.println();

        System.out.println("Students who study online:");
        for (Student s : school) {
            if(s.campus == City.ONLINE) {
                System.out.println(s);
            }
        }
    }
}
