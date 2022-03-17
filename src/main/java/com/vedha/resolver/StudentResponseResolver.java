package com.vedha.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.vedha.entity.Student;
import com.vedha.entity.Subject;
import com.vedha.response.StudentResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {

    public List<String> getSubjectList(StudentResponse sr) {
        Student st = sr.getStudent();
        return st.getSubjectList().stream().map(Subject::getSubjectName).collect(Collectors.toList());
    }

}
