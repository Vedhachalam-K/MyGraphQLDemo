package com.vedha.response;

public class SubjectResponse {
    private Integer subjectId;
    private Integer studentId;
    private String subjectName;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "SubjectResponse{" +
                "subjectId=" + subjectId +
                ", studentId=" + studentId +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
