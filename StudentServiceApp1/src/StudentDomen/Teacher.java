package StudentDomen;

import java.util.List;

public class Teacher extends User implements Comparable<Teacher> {

    private int teacerId;
    private String academicDegree;


    public Teacher(String firstName, String secondName, int age, int teacerId, String academicDegree) {
        super(firstName, secondName, age);
        this.teacerId = teacerId;
        this.academicDegree = academicDegree;
    }

    public int getTeacerId() {
        return teacerId;
    }

    public void setTeacerId(int teacerId) {
        this.teacerId = teacerId;
    }

    public String getLevel() {
        return academicDegree;
    }

    public void setLevel(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    /**
     * метод сравнения
     * @param o the object to be compared.
     * @return - возвр. отсортированное значение
     */
    @Override
    public int compareTo(Teacher o) {

        System.out.println(super.getFirstName() + " - " + o.getFirstName());
        if (super.getAge() == o.getAge()) {
            if (this.teacerId == o.teacerId) {
                return 0;
            }
            if (this.teacerId < o.teacerId) {
                return -1;
            }
            return 1;
        }
        if (super.getAge() < o.getAge()) {
            return -1;
        }
        return 1;
    }
}
