import java.util.ArrayList;
import java.util.List;

public class TeacherGroups {
    private List <Teacher> teachers = new ArrayList<>();

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
}
