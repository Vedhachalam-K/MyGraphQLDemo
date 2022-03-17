package com.vedha.repository;

import com.vedha.entity.Subject;
import com.vedha.entity.SubjectPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, SubjectPk> {
}
