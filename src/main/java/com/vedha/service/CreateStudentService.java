package com.vedha.service;

import com.vedha.entity.Student;
import com.vedha.entity.Subject;
import com.vedha.entity.SubjectPk;
import com.vedha.model.CreateStudentRequest;
import com.vedha.repository.StudentRepository;
import com.vedha.repository.SubjectRepository;
import com.vedha.response.StudentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class CreateStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    public StudentResponse createStudent(CreateStudentRequest createStudentRequest) {
        Integer maxStudentId = studentRepository.getMaxStudentId().orElse(1);
        Integer maxSubjectId = subjectRepository.getMaxSubjectId().orElse(1);

        Integer newStudentId = maxStudentId + 1;
        //Integer newSubjectId = maxSubjectId + 1;
        AtomicInteger newSubjectId = new AtomicInteger(maxSubjectId);

        List<Subject> subjectList = createStudentRequest.getSubjectList().stream().map(s -> {
            Subject sb = new Subject();
            SubjectPk subjectPk = new SubjectPk();
            subjectPk.setSubjectId(newSubjectId.addAndGet(1));
            subjectPk.setStudentId(newStudentId);
            sb.setSubjectPk(subjectPk);
            sb.setSubjectName(s);
            return sb;
        }).collect(Collectors.toList());

        Student st = new Student();
        st.setStudentId(newStudentId);
        st.setStudentName(createStudentRequest.getStudentName());
        st.setSubjectList(subjectList);

        Student savedStudent = studentRepository.save(st);

        return new StudentResponse(savedStudent);
    }

}
