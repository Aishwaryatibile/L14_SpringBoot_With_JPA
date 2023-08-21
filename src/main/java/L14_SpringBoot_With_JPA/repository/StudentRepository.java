package L14_SpringBoot_With_JPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import L14_SpringBoot_With_JPA.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
