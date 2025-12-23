public class Student {

    public String name;
    public int age;
    public double grade;
    public City campus;

    public Student(String name, int age, double grade, City campus) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.campus = campus;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years) - Grade: " + grade + " - Campus " + campus.label;
    }
}
