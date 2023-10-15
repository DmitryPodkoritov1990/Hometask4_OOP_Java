import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    TeacherService() {
        generateSubjects();
    }

    private List<String> subjects = new ArrayList<>();

    private void generateSubjects() {
        for (Subject eSubject : Subject.values()) subjects.add(eSubject.name());
    }

    public boolean validTeacher(String name, String subject) {
        if (name != null) {
            if (subjects.contains(subject)) {
                return true;
            } else {
                System.out.println("Subject not found");
                return false;
            }
        }
        System.out.println("Invalid name");
        return false;

    }

    public boolean hasTeacher(Teacher teacher, TeacherGroups teacherGroups) {
        List<Teacher> teachers = teacherGroups.getTeachers();
        for (Teacher el : teachers) {
            if (el.getName().equals(teacher.getName())) ;
            {
                System.out.println("Doblicates");
                return true;
            }
        }

        return false;
    }

    public List<String> getSubjects(){return this.subjects;}
}





