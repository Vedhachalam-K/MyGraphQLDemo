package com.vedha.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class SubjectPk implements Serializable {

    @Column(name="subject_id")
    private Integer subjectId;

    @Column(name="student_id")
    private Integer studentId;

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

    @Override
    public String toString() {
        return "SubjectPk{" +
                "subjectId=" + subjectId +
                ", studentId=" + studentId +
                '}';
    }
}
