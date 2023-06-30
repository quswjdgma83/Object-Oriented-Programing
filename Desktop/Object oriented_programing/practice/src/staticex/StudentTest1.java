package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentByun = new Student();
        studentByun.setStudentName("변정흠");
        System.out.println(studentByun.serialNum);
        System.out.println(studentByun.studentName + "학번: " + studentByun.studentID);

        Student studentSon = new Student();
        studentSon.setStudentName("손수경");
        System.out.println(studentSon.serialNum);
        System.out.println(studentSon.studentName + "학번: " + studentSon.studentID);
    }
}
