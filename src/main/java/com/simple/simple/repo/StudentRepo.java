package com.simple.simple.repo;

import com.simple.simple.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer>
{

}
