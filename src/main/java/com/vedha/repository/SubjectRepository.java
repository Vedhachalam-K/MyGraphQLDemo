package com.vedha.repository;

import com.vedha.entity.Subject;
import com.vedha.entity.SubjectPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SubjectRepository extends JpaRepository<Subject, SubjectPk> {

    @Query(nativeQuery = true, value = "select max(subject_id) from vedha.subject")
    public Optional<Integer> getMaxSubjectId();
}
