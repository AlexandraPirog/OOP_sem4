import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.*;
import StudentService.AvarageAge;

public class Main {
    public static void main(String[] args) throws Exception {
         Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
         Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
         Student s3 = new Student("Иван", "Петров", 22, (long)121);
         Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
         Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
         Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);

         List<Student> listStud = new ArrayList<Student>();
         listStud.add(s1);
         listStud.add(s2);
         listStud.add(s3);
         listStud.add(s4);
         listStud.add(s5);
         listStud.add(s6);

        // StudentGroup group = new StudentGroup(listStud);

        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }

        // System.out.println("============= после сортировки =============");
        // Collections.sort(group.getStudents());


        // for(Student stud : group)
        // {
        //     System.out.println(stud);
        // }


//        Emploee peron1 = new Emploee("Иванов", "Олег", 55, 110);
//        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
//
//        //EmploeeController contrEmp = new EmploeeController();
//        EmploeeController.paySalary(peron1);
//        //contrEmp.paySalary(s1);
//
//        Integer studHour[] = {124,234,231,1,45};
//        System.out.println(EmploeeController.mean(studHour));
//
//        Double emplSalary[] = {12555.23,34213.5,10000.0};
//        System.out.println(EmploeeController.mean(emplSalary));

        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);
        Teacher t1 = new Teacher("Марья", "Потемкина", 57, (int) 1, "Доктор Наук");
        Teacher t2 = new Teacher("Агафья", "Кислицина", 48, (int) 2, "Кандидат наук");
        Teacher t3 = new Teacher("Себастьян", "Полински", 30, (int) 3, "Преподователь");
        Teacher t4 = new Teacher("Григорий", "Отрепьев", 42, (int) 4, "Профессор");
        Teacher t5 = new Teacher("Жанна", "Леонтьева", 48, (int) 5, "Доцент");

        List<Teacher> listTeacher = new ArrayList<Teacher>();
        listTeacher.add(t1);
        listTeacher.add(t2);
        listTeacher.add(t3);
        listTeacher.add(t4);
        listTeacher.add(t5);

        System.out.println("Список учителей до сортировки");
        System.out.println();
        
        TeacherStaff group = new TeacherStaff(listTeacher);

         for(Teacher teacher : listTeacher)
         {
             System.out.println(teacher);
         }

         System.out.println("============= после сортировки =============");
         Collections.sort(group.getTeacher());

         for(Teacher teacher : listTeacher)
         {
             System.out.println(teacher);
         }

        Emploee e1 = new Emploee("Наоми","Кемпбелл", 48, 1);
        Emploee e2 = new Emploee("Мария","Федорова", 44, 2);
        Emploee e3 = new Emploee("Катюша","Назарова", 28, 3);
        Emploee e4 = new Emploee("Константин","Шишкин", 57, 4);
        Emploee e5 = new Emploee("Зоя","Кириллова", 35, 5);
        Emploee e6 = new Emploee("Дмитрий","Петров", 33, 6);
        Emploee e7 = new Emploee("Булат","Кусков", 40, 7);
        Emploee e8 = new Emploee("Зинаида","Костюшкина", 44, 8);
        List<Emploee> listEmploee = new ArrayList<Emploee>();
        listEmploee.add(e1);
        listEmploee.add(e2);
        listEmploee.add(e3);
        listEmploee.add(e4);
        listEmploee.add(e5);
        listEmploee.add(e6);
        listEmploee.add(e7);
        listEmploee.add(e8);

        System.out.println();
        System.out.println("подсчет среднего возраста");

        System.out.println();
        System.out.println("------------------ средний возраст учителей--------------------");
        AvarageAge.getAverageAge(listTeacher);
        System.out.println();

        System.out.println("------------------ средний возраст студентов--------------------");
        AvarageAge.getAverageAge(listStud);
        System.out.println();

        System.out.println("------------------ средний возраст работников--------------------");
        AvarageAge.getAverageAge(listEmploee);
    }
}