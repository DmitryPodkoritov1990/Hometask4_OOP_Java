public class TeacherController {
    private TeacherService teacherService;
    private TeacherGroups teacherGroups;

    TeacherController() {
        teacherService = new TeacherService();
        teacherGroups = new TeacherGroups();
    }

    private Teacher createTeacher(String name, String subject) {
        if (teacherService.validTeacher(name, subject)) {
            return new Teacher(name, subject);
        }
        System.out.println("Teacher not qualification");
        return null;
    }

    public void addTeacherGroup(String name, String subject) {
        Teacher teacher = createTeacher(name, subject);
        if (teacher != null) {
            if (!teacherService.hasTeacher(teacher, teacherGroups)) {
                teacherGroups.addTeacher(teacher);
            }
        }
    }

    public TeacherGroups getTeacherGroups() {
        return this.teacherGroups;
    }

    public Teacher getTeacher(String argument) {
        if (teacherService.getSubjects().contains(argument)) {
            for (Teacher teacher : teacherGroups.getTeachers()) {
                if (teacher.getSubject().equals(argument)) {
                    return teacher;
                }
            }
        } else {
            for (Teacher teacher : teacherGroups.getTeachers()) {
                if (teacher.getName().equals(argument)) {
                    return teacher;
                }
            }
        }
        System.out.println("Not TEACHER");
        return null;
    }
    public void changeTeacher(Teacher teacher, String argument){
        if(teacherService.getSubjects().contains(argument)){
            teacher.setSubject(argument);
        }
     else{
         teacher.setName(argument);
        }
    }
}



