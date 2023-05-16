package StudentService;

import java.util.List;

public interface iUserService<T> {
    void create(String firstName, String secondName, int age);

    List<T> getAll();

}
