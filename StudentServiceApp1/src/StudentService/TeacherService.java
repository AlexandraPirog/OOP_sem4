package StudentService;

import java.util.ArrayList;
import java.util.List;


import StudentDomen.Teacher;
import StudentDomen.UserComparator;

/**
 * Создаем класс TeacherService
 */
public class TeacherService implements iUserService<Teacher> {

    private int count;
    private String academicDegree;
    private List<Teacher> teachers;

    /**
     * создаем массив из учителей
     */
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    /**
     * создаем представителей класса
     * @param firstName - имя
     * @param secondName - фамилия
     * @param age - возраст
     */
    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher teacher = new Teacher(firstName, secondName, age, count, academicDegree);
        count++;
        this.academicDegree = academicDegree;
        teachers.add(teacher);
    }

    /**
     * Получаем список учителей
     * @return - возвр. метод
     */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * метод сортировки
     * @return - возвр. значение
     */
    public List<Teacher> getSortedByFIOStudentGroup(int numberGroup) {
        List<Teacher> teach = new ArrayList<>(teachers);
        teach.sort(new UserComparator<Teacher>());
        return teachers;
    }
}
