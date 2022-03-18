package com.vedha.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.vedha.entity.Student;
import com.vedha.entity.Subject;
import com.vedha.enumeration.SubjectFilter;
import com.vedha.response.StudentResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {

    public List<String> getSubjectList(StudentResponse sr, SubjectFilter subjectFilter) {
        Student st = sr.getStudent();
        String inputSubject = subjectFilter.name();

        if(!inputSubject.equalsIgnoreCase(SubjectFilter.All.name())){
            return st.getSubjectList().stream().filter(sb -> inputSubject.equalsIgnoreCase(sb.getSubjectName()))
                    .map(Subject::getSubjectName)
                    .collect(Collectors.toList());
        }else{
            return st.getSubjectList().stream().map(Subject::getSubjectName).collect(Collectors.toList());
        }

    }

}
