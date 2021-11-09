import java.io;

class main {
    public static void main(String args[]) {
        Student firstStudent = new Student("John", 1209);
        Student secondStudent = new Student("Nick");

        Course newCourseToSet = new Course("C Programming / Course ID 101", 5);

        firstStudent.setCourse(newCourseToSet);
        secondStudent.setCourse(newCourseToSet);

        firstStudent.printStudentInformation();
        secondStudent.printStudentInformation();
    }
}



class Student {
    Student(String nameOfStudent, int ID_ofStudent) {
        name = nameOfStudent;
        ID = ID_ofStudent;
    }

    Student(String nameOfStudent) {
        name = nameOfStudent;
    }

    public void setCourse(Course courseToSet) {
        myCourse = courseToSet;
    }

    public String getStudentName() {
        return name;
    }

    public int getStudentInt() {
        return ID;
    }

    public void printStudentInformation() {
        System.out.println("Student name: " + name +"\nID: " + ID);
        System.out.println("Course name: " + myCourse.getCourseName() + "\nCourse credits: " + myCourse.getCourseCredits() + "\n");
    }

    private Course myCourse;
    private String name = "";
    private int ID = 0;
}

class Course {
    Course(String nameOfCourse, int creditsOfCourse) {
        name = nameOfCourse;
        credits = creditsOfCourse;
    }

    public String getCourseName() {
        return name;
    }

    public int getCourseCredits() {
        return credits;
    }

    private String name = "";
    private int credits = 0;
}