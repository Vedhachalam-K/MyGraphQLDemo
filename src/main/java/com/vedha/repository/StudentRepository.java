package com.vedha.repository;

import com.vedha.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(nativeQuery = true, value = "select max(student_id) from vedha.student")
    public Optional<Integer> getMaxStudentId();

}
