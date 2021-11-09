import java.util.ArrayList;

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
    Course(String nameOfCourse, string nameOfClassrom) {
        name = nameOfCourse;
        classrom = nameOfClassrom;
    }

    public String getCourseName() {
        return name;
    }

    public int getCourseCredits() {
        return credits;
    }

    public Classroom getClassroom() {
        return myClassroom;
    }

    public void addStudentToCourse(Student studentToAdd) {
        if (myClassroom.getCapacity() < enrolledStudents.size()) {
            studentToAdd.setCourse(this);
            enrolledStudents.add(studentToAdd);
        } else {
            System.out.println("Classroom is at maximum capacity");
        }
    }

    public void printEnrolledStudents() {
        System.out.println("Enrolled students");

        for (int i = 0; i < enrolledStudents.size(); i++) {
            enrolledStudents.get(i).printStudentInformation();
        }
    }

    public void printClassroomData() {
        myClassroom.printClassroomInformation();
    }

    private ArrayList<Student> enrolledStudents = new ArrayList<Students>();
    private Classroom myClassroom;
    private String name = "";
    private String classrom = "";
}

class Classroom {
    Classroom(int capacityToSet, string nameToSet) {
        capacity = capacityToSet;
        name = nameToSet;
    }

    public int getCapacity() {
        return capacity;
    }

    public string getName() {
        return name;
    }

    public void printClassroomInformation() {
        System.out.println("Classroom name: " + name + "\nClassroom capacity: " + capacity);
    }

    private string name = "";
    private int capacity = 0;
}

class Registry {
    Registry(string registryNameToSet) {
        registryName = registryNameToSet;
    }

    public void addCourse(Course courseToAdd) {
        courseList.add(courseToAdd);
    }

    public void printRegistryData() {
        for (int i = 0; i < courseList.size(); i++) {
            System.out.println(courseList.get(i).getCourseName());
            courseList.get(i).printClassroomData();
            courseList.get(i).printEnrolledStudents();
        }
    }

    private string registryName = "";
    private ArrayList<Course> courseList = new ArrayList<Course>();
}
