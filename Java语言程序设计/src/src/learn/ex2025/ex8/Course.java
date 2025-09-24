package learn.ex2025.ex8;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
        }
        if (index >= 0) {
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            students[numberOfStudents - 1] = null;
            numberOfStudents--;
        }
    }

    public void clear() {
        students = new String[100];
        numberOfStudents = 0;
    }

    @Override
    public Object clone() {
        try {
            Course clone = (Course)super.clone();
            clone.students = new String[100];
            if (numberOfStudents >= 0) System.arraycopy(students, 0, clone.students, 0, numberOfStudents);
            return clone;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java");
        course1.addStudent("张三");
        course1.addStudent("李四");
        Course clone = (Course)course1.clone();
        clone.dropStudent("李四");
        clone.addStudent("赵六");
        System.out.println("原始课程：" + course1.getCourseName()+", 学生人数: " + course1.getNumberOfStudents());
        System.out.print("学生: ");
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(course1.getStudents()[i] + ", ");
        }
        System.out.println();
        System.out.println("克隆课程：" + clone.getCourseName()+", 学生人数: " + clone.getNumberOfStudents());
        System.out.print("学生: ");
        for (int i = 0; i < clone.getNumberOfStudents(); i++) {
            System.out.print(clone.getStudents()[i] + ", ");
        }
        System.out.println();
    }
}