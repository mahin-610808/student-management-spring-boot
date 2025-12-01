package com.mahin.springboot.repo;
import com.mahin.springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepo extends JpaRepository<Student, Long> {

}

