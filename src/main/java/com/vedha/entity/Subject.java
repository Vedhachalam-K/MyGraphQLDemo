package com.vedha.entity;

import javax.persistence.*;

@Entity
@Table(schema = "vedha", name = "subject")
public class Subject {

    @EmbeddedId
    private SubjectPk subjectPk;

    @Column(name = "subject_name")
    private String subjectName;

    @ManyToOne
    @JoinColumn(name = "student_Id", insertable = false, updatable = false)
    private Student student;

    public SubjectPk getSubjectPk() {
        return subjectPk;
    }

    public void setSubjectPk(SubjectPk subjectPk) {
        this.subjectPk = subjectPk;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectPk=" + subjectPk +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
