package com.vedha.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.vedha.entity.Student;
import com.vedha.model.StudentModel;
import com.vedha.response.StudentResponse;
import com.vedha.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private StudentService studentService;

    public String myFirstQuery() {
        return "First Query";
    }

    public String mySecondQuery() {
        return "Second Query";
    }

    public String getStudentName(StudentModel st) {
        return st.getFirstName() + " " +  st.getLastName();
    }

    public Student getStudent(Integer id) {
        return studentService.getStudentById(id);
    }

    public StudentResponse getStudentResponse(Integer id) {
        return new StudentResponse(studentService.getStudentById(id));
    }
}
