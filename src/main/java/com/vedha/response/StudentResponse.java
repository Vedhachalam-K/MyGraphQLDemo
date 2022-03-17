package com.vedha.response;

import com.vedha.entity.Student;
import com.vedha.entity.Subject;


import java.util.List;
import java.util.stream.Collectors;


public class StudentResponse {

    private Integer studentId;
    private String studentName;
    private List<String> subjectList;
    private Student student;

    public StudentResponse(Student st) {
        this.student = st;
        this.studentId = st.getStudentId();
        this.studentName = st.getStudentName();

        //this.subjectList = st.getSubjectList().stream().map(Subject::getSubjectName).collect(Collectors.toList());
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<String> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<String> subjectList) {
        this.subjectList = subjectList;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentResponse{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", subjectList=" + subjectList +
                '}';
    }
}
