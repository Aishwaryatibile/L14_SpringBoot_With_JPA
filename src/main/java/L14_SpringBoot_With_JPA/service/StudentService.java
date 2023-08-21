package L14_SpringBoot_With_JPA.service;

import L14_SpringBoot_With_JPA.entity.Student;

public interface StudentService {
	public Student updateById(Student student, int id) ;
}
