package com.models;
public class Models {
    private int StudentId;
    private String StudentName;
    private String StudentPhone;
    private String StudentEmail;
    private String StudentCity;
    private String StudentRollNo;
    private String StudentRegistrationNumber;
    private String StudentBranch;
    private String StudentYear;
    private String StudentSemester;
    // Constructor

    public Models(int studentId, String studentName, String studentPhone, String studentEmail, String studentCity, String studentRollNo, String studentRegistrationNumber, String studentBranch, String studentYear, String studentSemester) {
        StudentId = studentId;
        StudentName = studentName;
        StudentPhone = studentPhone;
        StudentEmail = studentEmail;
        StudentCity = studentCity;
        StudentRollNo = studentRollNo;
        StudentRegistrationNumber = studentRegistrationNumber;
        StudentBranch = studentBranch;
        StudentYear = studentYear;
        StudentSemester = studentSemester;
    }

    public Models(String studentName, String studentPhone, String studentEmail, String studentCity, String studentRollNo, String studentRegistrationNumber, String studentBranch, String studentYear, String studentSemester) {
        StudentName = studentName;
        StudentPhone = studentPhone;
        StudentEmail = studentEmail;
        StudentCity = studentCity;
        StudentRollNo = studentRollNo;
        StudentRegistrationNumber = studentRegistrationNumber;
        StudentBranch = studentBranch;
        StudentYear = studentYear;
        StudentSemester = studentSemester;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentPhone() {
        return StudentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        StudentPhone = studentPhone;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }

    public String getStudentCity() {
        return StudentCity;
    }

    public void setStudentCity(String studentCity) {
        StudentCity = studentCity;
    }

    public String getStudentRollNo() {
        return StudentRollNo;
    }

    public void setStudentRollNo(String studentRollNo) {
        StudentRollNo = studentRollNo;
    }

    public String getStudentRegistrationNumber() {
        return StudentRegistrationNumber;
    }

    public void setStudentRegistrationNumber(String studentRegistrationNumber) {
        StudentRegistrationNumber = studentRegistrationNumber;
    }

    public String getStudentBranch() {
        return StudentBranch;
    }

    public void setStudentBranch(String studentBranch) {
        StudentBranch = studentBranch;
    }

    public String getStudentYear() {
        return StudentYear;
    }

    public void setStudentYear(String studentYear) {
        StudentYear = studentYear;
    }

    public String getStudentSemester() {
        return StudentSemester;
    }

    public void setStudentSemester(String studentSemester) {
        StudentSemester = studentSemester;
    }

    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentPhone='" + StudentPhone + '\'' +
                ", StudentEmail='" + StudentEmail + '\'' +
                ", StudentCity='" + StudentCity + '\'' +
                ", StudentRollNo='" + StudentRollNo + '\'' +
                ", StudentRegistrationNumber='" + StudentRegistrationNumber + '\'' +
                ", StudentBranch='" + StudentBranch + '\'' +
                ", StudentYear='" + StudentYear + '\'' +
                ", StudentSemester='" + StudentSemester + '\'' +
                '}';
    }
}
