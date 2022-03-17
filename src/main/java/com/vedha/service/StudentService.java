package com.vedha.service;

import com.vedha.entity.Student;
import com.vedha.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudentById(Integer studentId) {
        return studentRepository.findById(studentId).get();
    }
}
