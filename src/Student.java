public class Student {
    private int StudentId;
    private String StudentName;
    private String StudentPhone;
    private String StudentCity;

    // Constructor
    public Student(int StudentId, String StudentName, String StudentPhone, String StudentCity) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
        this.StudentPhone = StudentPhone;
        this.StudentCity = StudentCity;
    }
    public Student(String StudentName, String StudentPhone, String StudentCity) {
        this.StudentName = StudentName;
        this.StudentPhone = StudentPhone;
        this.StudentCity = StudentCity;
    }

    // getters
    public int getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getStudentPhone() {
        return StudentPhone;
    }

    public String getStudentCity() {
        return StudentCity;
    }

    // setters
    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setStudentPhone(String studentPhone) {
        StudentPhone = studentPhone;
    }

    public void setStudentCity(String studentCity) {
        StudentCity = studentCity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentPhone='" + StudentPhone + '\'' +
                ", StudentCity='" + StudentCity + '\'' +
                '}';
    }
}
