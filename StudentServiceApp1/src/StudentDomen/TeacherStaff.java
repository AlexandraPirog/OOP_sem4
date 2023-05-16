package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * создаем группу учительского состава
 */
public class TeacherStaff implements Iterable<Teacher>{
    private List<Teacher> listTeacher;

    /**
     * Конструктор
     * @param listTeacher
     */
    public TeacherStaff(List<Teacher> listTeacher) {
        this.listTeacher = listTeacher;

    }

    public List<Teacher> getTeacher() {
        return listTeacher;
    }

    public void setTeacherStaff(List<Teacher> listTeacher) {
        this.listTeacher = listTeacher;
    }

    /**
     * Итератор
     * @return - возвр. значение
     */
    @Override
    public Iterator<Teacher> iterator() {
        return new Iterator<Teacher>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index<listTeacher.size();
            }
            @Override
            public Teacher next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return listTeacher.get(index++);
            }

        };
    }

}
