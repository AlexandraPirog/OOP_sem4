package StudentService;

import java.util.List;

import StudentDomen.User;

public class AvarageAge<T extends User> {
    /**
     * Считаем средний возраст выбранного класса
     * @param <T>  - класс пользователей
     * @param list - массив из юзеров выбранного класса
     */
    public static <T extends User> void getAverageAge(List<T> list) {
        double sum = 0;
        for (T person : list) {
            sum = sum + person.getAge();
        }
        sum = sum / list.size();
        System.out.printf("Средний возраст: %f\n", sum);
    }
}
