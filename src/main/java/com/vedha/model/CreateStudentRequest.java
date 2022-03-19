package com.vedha.model;

import java.util.List;

public class CreateStudentRequest {

    private String studentName;
    private List<String> subjectList;

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
}
