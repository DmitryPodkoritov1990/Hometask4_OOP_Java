public class TeacherVew {
    public void print(Teacher teacher){
        System.out.println(teacher.toString());
    }

    public void printALL(TeacherController teacherController){
        System.out.println(teacherController.getTeacherGroups().getTeachers());

    }
}
