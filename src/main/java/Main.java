public class Main {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        TeacherVew teacherVew = new TeacherVew();
        teacherController.addTeacherGroup("Nikolas", "History");
        teacherController.addTeacherGroup("Mike", "Geography");
        teacherVew.printALL(teacherController);
        

    }
}
